package cn.mnquan.manager.impl;

import cn.mnquan.manager.ILoginManager;
import cn.mnquan.mapper.TbMnUserMapper;
import cn.mnquan.model.TbMnUserDo;
import cn.mnquan.model.TbMnUserDoExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/13
 */
@Service
@Slf4j
public class LoginManagerImpl implements ILoginManager {

    @Autowired
    private TbMnUserMapper tbMnUserMapper;

    public boolean checkAccountAndPwd(TbMnUserDo tbMnUserDo) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAccountEqualTo(tbMnUserDo.getAccount())
                .andPwdEqualTo(tbMnUserDo.getPwd());

        List<TbMnUserDo> list = tbMnUserMapper.selectByExample(example);
        if(null != list && list.size() > 0){
            return true;
        }
        return false;
    }
}
