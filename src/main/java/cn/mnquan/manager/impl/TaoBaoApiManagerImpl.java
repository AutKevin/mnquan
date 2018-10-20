package cn.mnquan.manager.impl;

import cn.mnquan.commons.Contents;
import cn.mnquan.manager.ITaobaoApiManager;
import cn.mnquan.model.TbMnMaterialOptionalDo;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.taobao.api.response.TbkItemInfoGetResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/10
 */
@Service
@Slf4j
public class TaoBaoApiManagerImpl implements ITaobaoApiManager{
    /**
     * 超级搜索接口
     * @param request
     * @return
     */
    public List<TbkDgMaterialOptionalResponse.MapData> getSuperQueryList(TbkDgMaterialOptionalRequest request) throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setPageSize(request.getPageSize());//每页数
        req.setPageNo(request.getPageNo());//第几页
        req.setSort(request.getSort());//按销量排序
        req.setQ(request.getQ());
        req.setHasCoupon(request.getHasCoupon());//是否有优惠券，设置为true表示该商品有优惠券，设置为false或不设置表示不判断这个属性
        req.setAdzoneId(Contents.adzone_id);
        TbkDgMaterialOptionalResponse rsp = client.execute(req);
        List<TbkDgMaterialOptionalResponse.MapData> mapData =  rsp.getResultList();
        return mapData;
    }

    /**
     * 超级搜索接口,根据商品链接进行搜索
     * @param itemUrl
     * @param adzoneId
     * @return
     */
    public TbkDgMaterialOptionalResponse.MapData getProductByItemUrl(String itemUrl,Long adzoneId) throws ApiException {
        //通过物料搜索接口获取优惠券信息
        TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setQ(itemUrl);
        req.setAdzoneId(Contents.adzone_id);
        TbkDgMaterialOptionalResponse optionalResponse = client.execute(req);
        TbkDgMaterialOptionalResponse.MapData mapData = optionalResponse.getResultList().get(0);
        return mapData;
    }

    /**
     * 商品详情查询接口
     * @param numIid
     * @return
     */
    public TbkItemInfoGetResponse.NTbkItem queryProductItem(String numIid) throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient(Contents.MATERIAL_OPTIONAL_URL, Contents.appkey, Contents.secret);
        TbkItemInfoGetRequest request = new TbkItemInfoGetRequest();
        request.setNumIids(numIid);
        TbkItemInfoGetResponse response = client.execute(request);
        List<TbkItemInfoGetResponse.NTbkItem>  items = response.getResults();
        TbkItemInfoGetResponse.NTbkItem item = items.get(0);
        return item;
    }
}
