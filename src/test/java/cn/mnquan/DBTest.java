package cn.mnquan;

import cn.mnquan.mapper.TbMnCatItemMapper;
import cn.mnquan.model.TbMnCatItemDo;
import cn.mnquan.model.TbMnCatItemDoExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/5
 */
public class DBTest extends BaseSpringTest {
    @Autowired
    private TbMnCatItemMapper tbMnCatItemMapper;

    @Test
    public void updateParam(){
        TbMnCatItemDoExample example = new TbMnCatItemDoExample();
        List<TbMnCatItemDo> list = tbMnCatItemMapper.selectByExample(example);

        for(TbMnCatItemDo catItemDo : list){
            TbMnCatItemDoExample example1 = new TbMnCatItemDoExample();
            example1.createCriteria().andCategoryIdEqualTo(catItemDo.getCategoryId())
                    .andCatIdEqualTo(catItemDo.getCatId());
            TbMnCatItemDo record = new TbMnCatItemDo();
            record.setSkipUrl("/app/classify/skipProductList.do?categoryId="+catItemDo.getCategoryId()+"&levelOneCategoryId="+catItemDo.getCatId());
            tbMnCatItemMapper.updateByExampleSelective(record,example1);
        }
    }
}
