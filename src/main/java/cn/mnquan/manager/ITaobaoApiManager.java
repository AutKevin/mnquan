package cn.mnquan.manager;

import com.taobao.api.ApiException;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/10
 */
public interface ITaobaoApiManager {
    List<TbkDgMaterialOptionalResponse.MapData> getSuperQueryList(TbkDgMaterialOptionalRequest request)throws ApiException;
}
