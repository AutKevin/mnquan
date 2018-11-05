package cn.mnquan.manager.impl;

import cn.mnquan.manager.ITaoBaoManager;
import cn.mnquan.mapper.TbMnCatItemMapper;
import cn.mnquan.mapper.TbMnCatMapper;
import cn.mnquan.mapper.TbMnMaterialOptionalMapper;
import cn.mnquan.mapper.TbMnProductDetailMapper;
import cn.mnquan.model.*;
import com.github.pagehelper.PageHelper;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.response.TbkItemGetResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static cn.mnquan.commons.Contents.appkey;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/30
 */
@Service
@Slf4j
public class TaoBaoManagerImpl implements ITaoBaoManager{

    @Autowired
    private TbMnMaterialOptionalMapper tbMnMaterialOptionalMapper;
    @Autowired
    private TbMnCatItemMapper tbMnCatItemMapper;
    @Autowired
    private TbMnCatMapper tbMnCatMapper;
    @Autowired
    private TbMnProductDetailMapper tbMnProductDetailMapper;

    /**
     * 获取首页元素列表
     * @param optionalDo
     * @return
     */
    public List<TbMnMaterialOptionalDo> getProductList(TbMnMaterialOptionalDo optionalDo) {
        PageHelper.startPage(optionalDo.getPageNo(),optionalDo.getPageSize());
        TbMnMaterialOptionalDoExample example = new TbMnMaterialOptionalDoExample();
        TbMnMaterialOptionalDoExample.Criteria criteria = example.createCriteria();
        if(null != optionalDo.getNumIid()){
            criteria.andNumIidEqualTo(optionalDo.getNumIid());
        }
        if(null != optionalDo.getLevelOneCategoryId()){
            criteria.andLevelOneCategoryIdEqualTo(optionalDo.getLevelOneCategoryId());
        }
        if(null != optionalDo.getCategoryId()){
            criteria.andCategoryIdEqualTo(optionalDo.getCategoryId());
        }
        if(null != optionalDo.getSort() && ""  != optionalDo.getSort() && !optionalDo.getSort().contains("latest")){
            example.setOrderByClause(optionalDo.getSort());
        }else {
            example.setOrderByClause("token_time desc");
        }

        List<TbMnMaterialOptionalDo> optionalDos = tbMnMaterialOptionalMapper.selectByExample(example);
        return optionalDos;
    }

    /**
     * 获取首页中心元素列表
     * @param page
     * @return
     */
    public List<TbMnMaterialOptionalDo> getCentreList(Page page) {
        List<TbMnMaterialOptionalDo> optionalDos = tbMnMaterialOptionalMapper.getCentreList();
        return optionalDos;
    }

    /**
     * 获取类目元素列表
     * @param catItemDo
     * @return
     */
    public List<TbMnCatItemDo> getCatList(TbMnCatItemDo catItemDo) {
        TbMnCatItemDoExample example = new TbMnCatItemDoExample();
        example.createCriteria().andCatIdEqualTo(catItemDo.getCatId());
        example.setOrderByClause("sort");
        List<TbMnCatItemDo> catItemDos = tbMnCatItemMapper.selectByExample(example);
        return catItemDos;
    }

    /**
     * 获取二级类目名称
     * @param optionalDo
     * @return
     */
    public TbMnCatItemDo getCategoryName(TbMnMaterialOptionalDo optionalDo) {
        TbMnCatItemDoExample example = new TbMnCatItemDoExample();
        example.createCriteria().andCategoryIdEqualTo(String.valueOf(optionalDo.getCategoryId()))
        .andCatIdEqualTo(String.valueOf(optionalDo.getLevelOneCategoryId()));
        List<TbMnCatItemDo> catItemDos = tbMnCatItemMapper.selectByExample(example);
        return catItemDos.get(0);
    }

    /**
     * 获取一级类目名称
     * @param catId
     * @return
     */
    public TbMnCatDo getCatName(String catId) {
        TbMnCatDoExample example = new TbMnCatDoExample();
        example.createCriteria().andCatIdEqualTo(catId);

        List<TbMnCatDo> catDos = tbMnCatMapper.selectByExample(example);
        return catDos.get(0);
    }

    /**
     * 获取商品详情
     * @param numIid
     * @return
     */
    public TbMnProductDetailDo getProductDetail(Long numIid) {
        TbMnProductDetailDoExample example = new TbMnProductDetailDoExample();
        example.createCriteria().andNumIidEqualTo(numIid);

        List<TbMnProductDetailDo> list =tbMnProductDetailMapper.selectByExample(example);
        return list.get(0);
    }

    /**
     * 查询推荐语
     * @param optionalDo1
     */
    public void queryRecommendMsg(TbMnMaterialOptionalDo optionalDo1) {
        TbMnMaterialOptionalDoExample example = new TbMnMaterialOptionalDoExample();
        example.createCriteria().andNumIidEqualTo(optionalDo1.getNumIid());

        List<TbMnMaterialOptionalDo> list =tbMnMaterialOptionalMapper.selectByExample(example);
        if(null != list && list.size() > 0){
            optionalDo1.setJddPrice(list.get(0).getJddPrice());
        }else {
            optionalDo1.setJddPrice(optionalDo1.getTitle());
        }
    }
}
