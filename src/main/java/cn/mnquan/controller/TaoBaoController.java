package cn.mnquan.controller;

import cn.mnquan.commons.Contents;
import cn.mnquan.manager.IDtkManager;
import cn.mnquan.manager.ITaoBaoManager;
import cn.mnquan.manager.ITaobaoApiManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.model.*;
import cn.mnquan.utils.BeanMapperUtil;
import cn.mnquan.utils.DateUtil;
import cn.mnquan.utils.HttpClientUtils;
import cn.mnquan.utils.UuidUtil;
import com.alibaba.fastjson.JSON;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
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

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    @Autowired
    private IUserManager userManager;
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
        String uuid = UuidUtil.getUuid();
        log.info("开始获取商品元素,uuid:{},dat:{}",uuid,DateUtil.getCurrentTimeBySecond());
        List<TbMnMaterialOptionalDo> optionalDos = taoBaoManager.getProductList(optionalDo);
        log.info("结束获取商品元素,uuid:{},dat:{}",uuid,DateUtil.getCurrentTimeBySecond());
        sendMessages(response, JSON.toJSONString(optionalDos));
    }

    /**
     * 9.9精选
     * @return
     */
    @RequestMapping("/app/choiceness")
    public String choiceness(){
        return "page/choiceness";
    }
    /**
     * 获取首页商品列表
     * @param page
     * @param response
     */
    @RequestMapping(value="/app/index/getCentreList.do")
    public void getCentreList(Page page, HttpServletResponse response){
        String uuid = UuidUtil.getUuid();
        log.info("开始获取首页中心滚动图元素,uuid:{},dat:{}",uuid,DateUtil.getCurrentTimeBySecond());
        List<TbMnMaterialOptionalDo> tbkItems = taoBaoManager.getCentreList(page);
        log.info("结束获取首页中心滚动图元素,uuid:{},dat:{}",uuid,DateUtil.getCurrentTimeBySecond());
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
        //获取类目名称
        TbMnCatItemDo itemDo = taoBaoManager.getCategoryName(optionalDo);
        model.addAttribute("categoryName",itemDo.getCategoryName());
        model.addAttribute("optionalDo",optionalDo);
        return "page/classify_product_list";
    }

    /**
     * 转链
     * @param zhuanlian
     */
    @RequestMapping(value="/app/query/zhuanlian.do",method = RequestMethod.POST)
    public void zhanlian(String zhuanlian, HttpServletResponse response){
        String numIid = "1";
        String url = null;
        log.info("转链请求,zhuanlian:{}",zhuanlian);
        try {
            if (zhuanlian.contains("€")) {
                Pattern pattern1 = Pattern.compile("€(\\w+)€");
                Matcher matcher1 = pattern1.matcher(zhuanlian);
                if (matcher1.find()) {
                    url = "https://api.open.21ds.cn/apiv1/tpwdtoid?apkey=105bc582-a6b2-9c26-4e9d-e5bb9657c2c8&tpwd=€" + matcher1.group(1) + "€";
                }
            }

            if (zhuanlian.contains("￥")) {
                Pattern pattern2 = Pattern.compile("￥(\\w+)￥");
                Matcher matcher2 = pattern2.matcher(zhuanlian);
                if (matcher2.find()) {
                    url = "https://api.open.21ds.cn/apiv1/tpwdtoid?apkey=105bc582-a6b2-9c26-4e9d-e5bb9657c2c8&tpwd=￥" + matcher2.group(1) + "￥";
                }
            }
            log.info(url);
            HttpClientResponse rsp = HttpClientUtils.get(url);
            log.info(rsp.getResponseContent());
            JsonObject jsonObject = (JsonObject) new JsonParser().parse(rsp.getResponseContent());

            log.info(jsonObject.get("code").getAsString());
            if ("200".equals(jsonObject.get("code").getAsString())) {
                log.info("转链成功");
                sendMessages(response, JSON.toJSONString(jsonObject.get("data").getAsString()));
                return;
            }
        } catch(JsonSyntaxException e){
            log.error(e.getMessage(), e);
        }
        sendMessages(response, JSON.toJSONString(numIid));
    }

    /**
     * 跳转到商品详情
     * @param optionalDo
     * @param model
     */
    @RequestMapping(value="/app/detail/skipProductDetail.do",method = RequestMethod.GET)
    public String skipProductDetail(TbMnMaterialOptionalDo optionalDo,String type, Model model, HttpServletRequest request){
        try {
            log.info("开始跳转到商品详情,numIid:{},date:{}",optionalDo.getNumIid(), DateUtil.getCurrentTimeBySecond());
            Cookie cookie = getCookieByName(request,"accountNo");
            //判断用户是否登陆，登陆后才能获取到返利，否则算是自己的
            Long adzoneId = Contents.adzone_id;
            String tbkRate = "60";
            boolean flag = false;
            if(cookie != null){
                TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(cookie.getValue());
                adzoneId = Long.valueOf(tbMnUserDo.getId());
                flag = true;
                log.info("查询订单详情,adzoneId:{},accountNo:{}",adzoneId,cookie.getValue());
                tbkRate = tbMnUserDo.getOwnRate();
            }
            TbMnProductDetailDo itemDetail = null;
            TbMnMaterialOptionalDo optionalDo1 = null;
            String itemUrl = "https://detail.tmall.com/item.htm?id="+optionalDo.getNumIid();
            //通过物料搜索接口获取优惠券信息
            String couponAmonunt = null;
            String smallImages = null;
            String command = null;
            try {
                log.info("查询订单详情,adzoneId:{}",adzoneId);
                TbkDgMaterialOptionalResponse.MapData mapData = taobaoApiManager.getProductByItemUrl(itemUrl,adzoneId);
                optionalDo1 = BeanMapperUtil.objConvert(mapData,TbMnMaterialOptionalDo.class);

                if(null == mapData.getSmallImages()){
                    smallImages = mapData.getPictUrl();
                }else {
                    smallImages = getSmallImages(mapData.getSmallImages());
                }
                if(null != optionalDo1.getCouponEndTime()){
                    couponAmonunt = dtkManager.getCouponAmount(mapData);
                    optionalDo1.setCouponShareUrl(optionalDo1.getCouponShareUrl());
                }else {
                    couponAmonunt = "0";
                    optionalDo1.setCouponShareUrl(optionalDo1.getUrl());
                }
                command = dtkManager.getCommand(mapData);
                optionalDo1.setCouponAmount(couponAmonunt);
                optionalDo1.setSmallImages(smallImages);
                optionalDo1.setToken(command);
                model.addAttribute("rate" ,(new BigDecimal(optionalDo1.getZkFinalPrice()).subtract(new BigDecimal(couponAmonunt))).multiply(new BigDecimal(optionalDo1.getCommissionRate())).multiply(new BigDecimal(tbkRate)).divide(new BigDecimal(Double.toString(1000000))).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
                //获取商品详情
                TbkItemInfoGetResponse.NTbkItem item = taobaoApiManager.queryProductItem(String.valueOf(mapData.getNumIid()));
                itemDetail = BeanMapperUtil.objConvert(item,TbMnProductDetailDo.class);

                //如果商品存在本地库，则查询出推荐语
                taoBaoManager.queryRecommendMsg(optionalDo1);
            } catch (ApiException e) {
                e.printStackTrace();
            }
            String afterAmount = getAfterAmount(optionalDo1);
            model.addAttribute("optionalDo",optionalDo1);
            model.addAttribute("images",optionalDo1.getSmallImages().split(","));
            model.addAttribute("itemDetail",itemDetail);
            model.addAttribute("afterAmount",afterAmount);
            model.addAttribute("flag",flag);
            log.info("结束跳转到商品详情,numIid:{},date:{}",optionalDo.getNumIid(), DateUtil.getCurrentTimeBySecond());
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        if("weibo".equals(type)){
            return "page/weibo_detail";
        }
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
    public String superQuery(Model model,String title,HttpServletRequest request){
        Cookie cookie = getCookieByName(request,"accountNo");
        if(cookie != null){
            //查出用户信息
            TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo(cookie.getValue());
            model.addAttribute("ownRate",tbMnUserDo.getOwnRate());
        }
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
