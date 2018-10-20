package cn.mnquan;

import cn.mnquan.manager.IOrderManager;
import cn.mnquan.manager.IUserManager;
import cn.mnquan.mapper.TbMnCatItemMapper;
import cn.mnquan.mapper.TbMnOrderMapper;
import cn.mnquan.mapper.TbMnUserMapper;
import cn.mnquan.model.TbMnCatItemDo;
import cn.mnquan.model.TbMnCatItemDoExample;
import cn.mnquan.model.TbMnOrderDo;
import cn.mnquan.model.TbMnUserDo;
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
    @Autowired
    private TbMnOrderMapper tbMnOrderMapper;
    @Autowired
    private IUserManager userManager;
    @Autowired
    private IOrderManager orderManager;

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

    @Test
    public void queryTotalAmt(){
        TbMnOrderDo orderDo = new TbMnOrderDo();
        orderDo.setAdzoneId("71344394");

        //查出用户信息
        TbMnUserDo tbMnUserDo = userManager.queryUserByAccountNo("17521333602");
        //获取用户累计收益=自己收益*55%+团队收益*5
         double ownAmt = orderManager.getownAmt(tbMnUserDo);
        List<TbMnUserDo> userDos = userManager.queryUserList(tbMnUserDo);
            double  teadAmt = orderManager.getTeadAmt(userDos);
        System.out.println(ownAmt +teadAmt );
    }
}
