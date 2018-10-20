package cn.mnquan.manager.impl;

import cn.mnquan.manager.IUserManager;
import cn.mnquan.mapper.TbMnAgencyMapper;
import cn.mnquan.mapper.TbMnUserMapper;
import cn.mnquan.model.TbMnAgencyDo;
import cn.mnquan.model.TbMnAgencyDoExample;
import cn.mnquan.model.TbMnUserDo;
import cn.mnquan.model.TbMnUserDoExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 用户管理
 * </p>
 * User: wangkecheng Date: 2018/10/14
 */
@Service
@Slf4j
public class UserManagerImpl implements IUserManager{

    @Autowired
    private TbMnUserMapper tbMnUserMapper;
    @Autowired
    private TbMnAgencyMapper tbMnAgencyMapper;

    public String addUser(TbMnUserDo tbMnUserDo) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAccountEqualTo(tbMnUserDo.getAccount());

        List<TbMnUserDo> list = tbMnUserMapper.selectByExample(example);
        if(null != list && list.size() > 0){
            return "2";//用户名已经存在
        }

        //如果用户输入邀请码，则进行校验
        String agencyId = "000001";
        if(!agencyId.equals(tbMnUserDo.getAgencyId())){
            TbMnAgencyDoExample agencyDoExample = new TbMnAgencyDoExample();
            agencyDoExample.createCriteria().andAgencyCodeEqualTo(tbMnUserDo.getAgencyId());

            List<TbMnAgencyDo> agencyDos = tbMnAgencyMapper.selectByExample(agencyDoExample);
            if(null != agencyDos && agencyDos.size() > 0){
                agencyId = agencyDos.get(0).getId();
            }
        }

        TbMnUserDo record = new TbMnUserDo();
        record.setAccount(tbMnUserDo.getAccount());
        record.setPwd(tbMnUserDo.getPwd());
        record.setAgencyId(agencyId);
        record.setState("1");
        record.setCreatedAt(new Date());

        tbMnUserMapper.insertSelective(record);
        return "4";
    }

    public TbMnUserDo queryUserByAccountNo(String account) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAccountEqualTo(account);
        TbMnUserDo tbMnUserDo = null;
        List<TbMnUserDo> list = tbMnUserMapper.selectByExample(example);
        if(null != list && list.size() > 0){
            tbMnUserDo = list.get(0);
        }
        return tbMnUserDo;
    }

    /**
     * 查出整个团队的广告位id
     * @param tbMnUserDo
     * @return
     */
    public List<TbMnUserDo> queryUserList(TbMnUserDo tbMnUserDo) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAgencyIdEqualTo(tbMnUserDo.getId());
        return tbMnUserMapper.selectByExample(example);
    }
}
