package cn.mnquan.manager.impl;

import cn.mnquan.commons.Contents;
import cn.mnquan.manager.IDtkManager;
import cn.mnquan.manager.ITaobaoApiManager;
import cn.mnquan.mapper.TbMnCatItemMapper;
import cn.mnquan.mapper.TbMnMaterialOptionalMapper;
import cn.mnquan.mapper.TbMnProductDetailMapper;
import cn.mnquan.mapper.TbMnProductMapper;
import cn.mnquan.model.*;
import cn.mnquan.utils.BeanMapperUtil;
import cn.mnquan.utils.DateUtil;
import cn.mnquan.utils.HttpClientUtils;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkCouponGetRequest;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao.api.request.TbkTpwdCreateRequest;
import com.taobao.api.response.TbkCouponGetResponse;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.taobao.api.response.TbkItemInfoGetResponse;
import com.taobao.api.response.TbkTpwdCreateResponse;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/29
 */
@Service
@Slf4j
public class DtkManagerImpl implements IDtkManager {

    @Autowired
    private TbMnCatItemMapper tbMnCatItemMapper;
    @Autowired
    private TbMnMaterialOptionalMapper tbMnMaterialOptionalMapper;
    @Autowired
    private TbMnProductDetailMapper tbMnProductDetailMapper;
    @Autowired
    private ITaobaoApiManager taobaoApiManager;

    /**
     * 业务入口
     */
    public void execute() throws ApiException {
        log.info("获取所有商品类目名称");
        TbMnCatItemDoExample example = new TbMnCatItemDoExample();
        example.createCriteria().andStateEqualTo("1");

        List<TbMnCatItemDo> productDos = tbMnCatItemMapper.selectByExample(example);
        //获取前15页的数据
        for(int i = 0 ; i < 1 ; i++){
            for(TbMnCatItemDo productDo : productDos){
                //http://www.dataoke.com/qlist/?keywords=%E8%A1%AC%E8%A1%AB&cid=1&px=sell&page=2
                String cid = getCid(productDo);
                String url = Contents.DAK_URL+"?keywords="+productDo.getCategoryName()+"&cid="+cid+"&xuan=keyword&page="+i+"&px=sell";
                Document doc = null;
                try {
                    HttpClientResponse rsp = HttpClientUtils.get(url);
                    doc = Jsoup.parse(rsp.getResponseContent());
                } catch (Exception e) {
                    continue;
                }
                Elements rows = doc.getElementsByClass("goods-item");
                for(int j = 0 ; j<rows.size() ; j++){
                    //获取商品id
                    String numIid = rows.get(j).attr("data_goodsid");
                    //判断商品是否已经存在
                    TbMnMaterialOptionalDoExample example1 = new TbMnMaterialOptionalDoExample();
                    example1.createCriteria().andNumIidEqualTo(Long.valueOf(numIid));

                    List<TbMnMaterialOptionalDo> list = tbMnMaterialOptionalMapper.selectByExample(example1);
                    if(list.size() > 0) continue;

                    String itemUrl = "https://detail.tmall.com/item.htm?id="+numIid;
                    //通过物料搜索接口获取优惠券信息
                    TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
                    TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
                    req.setQ(itemUrl);
                    req.setAdzoneId(Contents.adzone_id);
                    TbkDgMaterialOptionalResponse.MapData mapData = null;
                    String command = null;
                    String couponAmonunt = null;
                    String smallImages = null;
                    try {
                        TbkDgMaterialOptionalResponse optionalResponse = client.execute(req);
                        mapData = optionalResponse.getResultList().get(0);
                        //如果券有效期为空，则continue
                        if(null == mapData.getCouponStartTime()) continue;
                        //获取淘口令
                        command = getCommand(mapData);
                        if(null == command || "" == command) continue;
                        //获取优惠券金额
                        couponAmonunt = getCouponAmount(mapData);
                        smallImages = getSmallImages(mapData.getSmallImages());

                        //获取详情页的商品推荐语
                        String datagId = rows.get(j).attr("id").replace("goods-items_","");
                        HttpClientResponse rsp1 = HttpClientUtils.get("http://www.dataoke.com/item?id="+datagId);
                        Document doc1 = Jsoup.parse(rsp1.getResponseContent());
                        //获得所有p标签
                        Elements links = doc1.select("div.goods-info div.goods-tit > p");
                        String tuiJianYu = links.get(0).text();

                        TbMnMaterialOptionalDo record = BeanMapperUtil.objConvert(mapData,TbMnMaterialOptionalDo.class);
                        record.setLevelOneCategoryId(Long.valueOf(productDo.getCatId()));
                        record.setCategoryId(Long.valueOf(productDo.getCategoryId()));
                        record.setTokenTime(DateUtil.dateFormat(new Date()));
                        record.setToken(command);
                        record.setSmallImages(smallImages);
                        record.setCouponAmount(couponAmonunt);
                        record.setJddPrice(tuiJianYu);
                        tbMnMaterialOptionalMapper.insertSelective(record);
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
    }

    private String getCid(TbMnCatItemDo productDo) {
        String cid = productDo.getCatId();
        if("1".equals(cid)){//女装
            return "1";
        }
        if("2".equals(cid)){//男装
            return "9";
        }
        if("3".equals(cid)){//鞋品
            return "5";
        }
        if("4".equals(cid)){//内衣
            return "10";
        }
        if("5".equals(cid)){//配饰
            return "12";
        }
        if("6".equals(cid)){//美妆
            return "3";
        }
        if("7".equals(cid)){//母婴
            return "2";
        }
        if("8".equals(cid)){//美食
            return "6";
        }
        if("9".equals(cid)){//箱包
            return "11";
        }
        if("10".equals(cid)){//居家日用
            return "4";
        }
        if("11".equals(cid)){//数码家电
            return "8";
        }
        if("12".equals(cid)){//文娱车品
            return "7";
        }
        if("13".equals(cid)){//家装家纺
            return "14";
        }
        if("14".equals(cid)){//户外运动
            return "13";
        }
        return null;
    }

    public String getCouponAmount(TbkDgMaterialOptionalResponse.MapData mapData) throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
        TbkCouponGetRequest req = new TbkCouponGetRequest();
        req.setItemId(mapData.getNumIid());
        req.setActivityId(mapData.getCouponId());
        TbkCouponGetResponse rsp = client.execute(req);
        TbkCouponGetResponse.MapData mapData1 = rsp.getData();
        return mapData1.getCouponAmount();
    }

    private String getSmallImages(List<String> list) {
        StringBuffer sb = new StringBuffer();
        for(String str : list){
            sb.append(str);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /**
     * 生成淘口令
     * @param mapData
     * @return
     */
    public String getCommand(TbkDgMaterialOptionalResponse.MapData mapData) {
        String tbkCode="";
        try {
            TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
            TbkTpwdCreateRequest req = new TbkTpwdCreateRequest();
            req.setText(mapData.getTitle());
            if(null != mapData.getCouponEndTime()){
                req.setUrl("https:"+mapData.getCouponShareUrl());
            }else {
                req.setUrl("https:"+mapData.getUrl());
            }
            req.setLogo(mapData.getPictUrl());
            TbkTpwdCreateResponse rsp = client.execute(req);
            if("" == rsp.getErrorCode()){
                tbkCode = rsp.getData().getModel();
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return tbkCode;
    }
}
