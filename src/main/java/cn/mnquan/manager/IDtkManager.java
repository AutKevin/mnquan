package cn.mnquan.manager;

import com.taobao.api.ApiException;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/29
 */
public interface IDtkManager {
    void execute() throws ApiException;
    public String getCouponAmount(TbkDgMaterialOptionalResponse.MapData mapData) throws ApiException;
    public String getCommand(TbkDgMaterialOptionalResponse.MapData mapData);
}
