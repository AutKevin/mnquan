package cn.mnquan.model;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/18
 */
public class JsonBean {
    public List<TbMnOrderDo> n_tbk_order;

    public List<TbMnOrderDo> getMnOrderDos() {
        return n_tbk_order;
    }

    public void setMnOrderDos(List<TbMnOrderDo> n_tbk_order) {
        this.n_tbk_order = n_tbk_order;
    }
}
