package cn.mnquan;

import cn.mnquan.commons.Contents;
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
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * <p>
 * 通用物料搜索API（导购）
 * </p>
 * User: wangkecheng Date: 2018/9/29
 */
public class TbMaterialOptional{

    public final static String url = "https://eco.taobao.com/router/rest";
    public final static String appkey = "24810297";
    public final static String secret = "76250cfab3f567fdb5e90e7d03c1b10c";
    public final static long adzone_id = 71344394;

    @Test
    public void getProducts() throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setPageSize(30L);//每页数
        req.setPageNo(1L);//第几页
        req.setSort("total_sales");//按销量排序
        req.setQ("女装");
        req.setHasCoupon(true);
        req.setAdzoneId(Contents.adzone_id);
        req.setPlatform(2l);
        TbkDgMaterialOptionalResponse rsp = client.execute(req);
        List<TbkDgMaterialOptionalResponse.MapData> mapData =  rsp.getResultList();
    }

    @Test
    public void getProductByItemUrl() throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setQ("https://detail.tmall.com/item.htm?id=577406087388");
        req.setAdzoneId(adzone_id);
        TbkDgMaterialOptionalResponse rsp = client.execute(req);
        JSONObject jsonObject = JSONObject.fromObject(rsp.getBody());
        String tbkResp = jsonObject.get("tbk_dg_material_optional_response").toString();
        JSONObject jsonObject1 = JSONObject.fromObject(tbkResp);
        String resultList = jsonObject1.get("result_list").toString();
        JSONObject jsonObject2 = JSONObject.fromObject(resultList);
        String mapData = jsonObject2.get("map_data").toString();
    }

    @Test
    public void getToken() throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkTpwdCreateRequest req = new TbkTpwdCreateRequest();
        req.setText("这是一个美好的开始");
        req.setUrl("https://s.click.taobao.com/t?e=m%3D2%26s%3Db%2F06WN%2FMS1IcQipKwQzePOeEDrYVVa64lwnaF1WLQxlyINtkUhsv0PSmSIWUg6KBMcIayu1B3iT1ou5n2RpPURXhUUkIsBPCNylfDVXN8fEKg%2BJ8tBU%2F3l9EeTtntI44Nft9EeeNPimsTxbHVSF9fM0Q9fK1X0Au0ItOGVs%2B65mgKGtQyOe%2FTtdzfAIVyv8%2BWAuytjnXIXA%3D&scm=null&pvid=100_11.182.80.32_213316_651539357224526055&app_pvid=0b01fd3915393572245168812d220c&ptl=floorId:2836;pvid:100_11.182.80.32_213316_651539357224526055;app_pvid:0b01fd3915393572245168812d220c&union_lens=lensId:0b084dac_0cba_16668d72e56_d53e");
        req.setLogo("https://img.alicdn.com/bao/uploaded/i4/3087008040/O1CN0129GMpGrnm3U5KXv_!!3087008040.jpg");
        TbkTpwdCreateResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }

    @Test
    public void queryCouponMsg()throws ApiException{
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkCouponGetRequest req = new TbkCouponGetRequest();
        req.setItemId(3326470811l);
        req.setActivityId("1db9c8b20da540c7a51c3770bbf2f7a1");
        TbkCouponGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }

    @Test
    public void queryDetail() throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkItemInfoGetRequest req = new TbkItemInfoGetRequest();
        req.setNumIids("561357302164");
        TbkItemInfoGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
}
