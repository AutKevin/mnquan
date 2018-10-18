package cn.mnquan.controller;

import cn.mnquan.commons.Contents;
import cn.mnquan.manager.IDtkManager;
import cn.mnquan.manager.ITaoBaoManager;
import cn.mnquan.manager.ITaobaoApiManager;
import cn.mnquan.model.*;
import cn.mnquan.utils.BeanMapperUtil;
import com.alibaba.fastjson.JSON;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.taobao.api.response.TbkItemInfoGetResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/25
 */
@Slf4j
@Controller
public class TaoBaoController extends BaseController{

    @Autowired
    private ITaoBaoManager taoBaoManager;
    @Autowired
    private ITaobaoApiManager taobaoApiManager;
    @Autowired
    private IDtkManager dtkManager;
    /**
     * app优惠券入口
     * @return
     */
    @RequestMapping("/app")
    public String index(){
        return "page/index";
    }
    /**
     * 获取首页商品列表
     * @param optionalDo
     * @param response
     */
    @RequestMapping(value="/app/index/getProductList.do")
    public void getPageList(TbMnMaterialOptionalDo optionalDo, HttpServletResponse response){
        log.info("获取首页元素,optionalDo:{}",optionalDo.toString());
        List<TbMnMaterialOptionalDo> optionalDos = taoBaoManager.getProductList(optionalDo);
        sendMessages(response, JSON.toJSONString(optionalDos));
    }

    /**
     * 获取首页商品列表
     * @param page
     * @param response
     */
    @RequestMapping(value="/app/index/getCentreList.do")
    public void getCentreList(Page page, HttpServletResponse response){
        log.info("获取首页中心滚动图元素,page:{}",page.toString());
        List<TbMnMaterialOptionalDo> tbkItems = taoBaoManager.getCentreList(page);
        sendMessages(response, JSON.toJSONString(tbkItems));
    }

    /**
     * app跳转到分类
     * @return
     */
    @RequestMapping("/app/classify")
    public String skipClassify(){
        return "page/classify";
    }

    /**
     * 获取类目元素列表
     * @param catItemDo
     * @param response
     */
    @RequestMapping(value="/app/classify/getCatList.do")
    public void getCatList(TbMnCatItemDo catItemDo, HttpServletResponse response){
        log.info("获取类目元素列表");
        List<TbMnCatItemDo> catItemDos = taoBaoManager.getCatList(catItemDo);
        sendMessages(response, JSON.toJSONString(catItemDos));
    }

    /**
     * 跳转到二级类目列表
     * @param catItemDo
     * @param model
     */
    @RequestMapping(value="/app/classify/skipProduct.do",method = RequestMethod.GET)
    public String skipProduct(TbMnCatItemDo catItemDo, Model model){
        log.info("跳转到指定的产品列表,catItemDo{}",catItemDo);
        List<TbMnCatItemDo> catItemDos = taoBaoManager.getCatList(catItemDo);

        //获取一级类目名称
        TbMnCatDo catDo = taoBaoManager.getCatName(catItemDo.getCatId());
        model.addAttribute("catItemDos",catItemDos);
        model.addAttribute("catName",catDo.getCatName());
        model.addAttribute("catId",catItemDo.getCatId());
        return "page/classify_product";
    }

    /**
     * 跳转到产品列表
     * @param optionalDo
     * @param model
     */
    @RequestMapping(value="/app/classify/skipProductList.do",method = RequestMethod.GET)
    public String skipProductList(TbMnMaterialOptionalDo optionalDo, Model model){
       /* log.info("跳转到产品列表,optionalDo:{}",optionalDo.toString());
        List<TbMnMaterialOptionalDo> optionalDos = taoBaoManager.getProductList(optionalDo);*/

        //获取类目名称
        TbMnCatItemDo itemDo = taoBaoManager.getCategoryName(optionalDo);
       /* model.addAttribute("optionalDos",optionalDos);*/
        model.addAttribute("categoryName",itemDo.getCategoryName());
        model.addAttribute("optionalDo",optionalDo);
        return "page/classify_product_list";
    }

    /**
     * 跳转到产品列表
     * @param optionalDo
     * @param model
     */
    @RequestMapping(value="/app/detail/skipProductDetail.do",method = RequestMethod.GET)
    public String skipProductDetail(TbMnMaterialOptionalDo optionalDo, Model model){
        log.info("跳转到产品列表,optionalDo:{}",optionalDo.toString());
        TbMnProductDetailDo itemDetail = null;
        TbMnMaterialOptionalDo optionalDo1 = null;
        if("1".equals(optionalDo.getType())){//超级查询
            String itemUrl = "https://detail.tmall.com/item.htm?id="+optionalDo.getNumIid();
            //通过物料搜索接口获取优惠券信息
            TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
            TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
            req.setQ(itemUrl);
            req.setAdzoneId(Contents.adzone_id);
            String couponAmonunt = null;
            String smallImages = null;
            String command = null;
            try {
                TbkDgMaterialOptionalResponse optionalResponse = client.execute(req);
                TbkDgMaterialOptionalResponse.MapData mapData = optionalResponse.getResultList().get(0);
                optionalDo1 = BeanMapperUtil.objConvert(mapData,TbMnMaterialOptionalDo.class);
                smallImages = getSmallImages(mapData.getSmallImages());

                if(null != optionalDo1.getCouponEndTime()){
                    couponAmonunt = dtkManager.getCouponAmount(mapData);
                }else {
                    couponAmonunt = "0";
                }
                command = dtkManager.getCommand(mapData);
                optionalDo1.setCouponAmount(couponAmonunt);
                optionalDo1.setSmallImages(smallImages);
                optionalDo1.setToken(command);
                optionalDo1.setCouponShareUrl(optionalDo1.getUrl());

                //获取商品详情
                TbkItemInfoGetRequest request = new TbkItemInfoGetRequest();
                request.setNumIids(String.valueOf(mapData.getNumIid()));
                TbkItemInfoGetResponse response = client.execute(request);
                List<TbkItemInfoGetResponse.NTbkItem>  items = response.getResults();
                TbkItemInfoGetResponse.NTbkItem item = items.get(0);
                itemDetail = BeanMapperUtil.objConvert(item,TbMnProductDetailDo.class);
            } catch (ApiException e) {
                e.printStackTrace();
            }
        }else{
            List<TbMnMaterialOptionalDo> optionalDos = taoBaoManager.getProductList(optionalDo);
            optionalDo1 = optionalDos.get(0);
            //获取商品详情
            itemDetail = taoBaoManager.getProductDetail(optionalDo.getNumIid());
        }
        String afterAmount = getAfterAmount(optionalDo1);
        model.addAttribute("optionalDo",optionalDo1);
        model.addAttribute("images",optionalDo1.getSmallImages().split(","));
        model.addAttribute("itemDetail",itemDetail);
        model.addAttribute("afterAmount",afterAmount);
        return "page/product_detail";
    }

    /**
     * 跳转到查询页面
     */
    @RequestMapping(value="/app/query/query.do",method = RequestMethod.GET)
    public String skipQueryPage(){
        log.info("跳转到查询页面");
        return "page/super_query";
    }

    /**
     * 跳转到超级搜索查询页面
     * @param model
     * @param title
     * @return
     */
    @RequestMapping(value="/app/query/super_query.do",method = RequestMethod.GET)
    public String superQuery(Model model,String title){
        model.addAttribute("title",title);
        return "page/super_query_list";
    }

    /**
     * 超级搜索产品列表
     * @param request
     */
    @RequestMapping(value="/app/query/superQueryList.do",method = RequestMethod.POST)
    public void superQueryList(TbkDgMaterialOptionalRequest request, HttpServletResponse response){
        log.info("跳转到产品列表,optionalDo:{}",request.toString());
        List<TbkDgMaterialOptionalResponse.MapData> mapData = null;
        try {
            mapData = taobaoApiManager.getSuperQueryList(request);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        sendMessages(response, JSON.toJSONString(mapData));
    }

    private String getAfterAmount(TbMnMaterialOptionalDo optionalDo) {
        BigDecimal bigA = new BigDecimal(optionalDo.getZkFinalPrice());
        BigDecimal bigB = new BigDecimal(optionalDo.getCouponAmount());
        return String.valueOf(bigA.subtract(bigB).doubleValue());
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
}
