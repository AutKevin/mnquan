package cn.mnquan.manager;

import cn.mnquan.model.*;
import com.taobao.api.request.TbkItemGetRequest;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/30
 */
public interface ITaoBaoManager {
    List<TbMnMaterialOptionalDo> getProductList(TbMnMaterialOptionalDo optionalDo);

    List<TbMnMaterialOptionalDo> getCentreList(Page page);

    List<TbMnCatItemDo> getCatList(TbMnCatItemDo catItemDo);

    TbMnCatItemDo getCategoryName(TbMnMaterialOptionalDo optionalDo);

    TbMnCatDo getCatName(String catId);

    TbMnProductDetailDo getProductDetail(Long numIid);

    void queryRecommendMsg(TbMnMaterialOptionalDo optionalDo1);
}
