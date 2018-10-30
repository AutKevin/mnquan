package cn.mnquan.manager.impl;

import cn.mnquan.manager.IUserManager;
import cn.mnquan.mapper.TbMnAdzoneMapper;
import cn.mnquan.mapper.TbMnAgencyMapper;
import cn.mnquan.mapper.TbMnUserMapper;
import cn.mnquan.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

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
    @Autowired
    private TbMnAdzoneMapper tbMnAdzoneMapper;

    public String addUser(TbMnUserDo tbMnUserDo) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAccountEqualTo(tbMnUserDo.getAccount());

        List<TbMnUserDo> list = tbMnUserMapper.selectByExample(example);
        if(null != list && list.size() > 0){
            return "1";//用户名已经存在
        }

        //如果用户输入邀请码，则进行校验
        String agencyId = "";
        if(null != tbMnUserDo.getAgencyId() && tbMnUserDo.getAgencyId().length() > 2){
            TbMnAdzoneDoExample tbMnAdzoneDoExample = new TbMnAdzoneDoExample();
            tbMnAdzoneDoExample.createCriteria().andRegisterCodeEqualTo(tbMnUserDo.getAgencyId());
            List<TbMnAdzoneDo> agencyDos = tbMnAdzoneMapper.selectByExample(tbMnAdzoneDoExample);
            if(null != agencyDos && agencyDos.size() > 0){
                agencyId = agencyDos.get(0).getAdzoneId();
            }else {
                return "2";//未匹配到此邀请码的用户！
            }
        }

        //为用户分配一个可用的广告位Id
        TbMnAdzoneDoExample adzoneDoExample = new TbMnAdzoneDoExample();
        TbMnAdzoneDoExample.Criteria criteria = adzoneDoExample.createCriteria();
        criteria.andStateEqualTo("1");

        List<TbMnAdzoneDo> adzoneDos = tbMnAdzoneMapper.selectByExample(adzoneDoExample);
        if(null != adzoneDos && adzoneDos.size() > 0){
            TbMnAdzoneDo adzoneDo = new TbMnAdzoneDo();
            adzoneDo.setState("2");
            adzoneDo.setAccount(tbMnUserDo.getAccount());
            adzoneDo.setRegisterCode(getRandom());

            String adzoneId = adzoneDos.get(0).getAdzoneId();
            criteria.andAdzoneIdEqualTo(adzoneId);
            tbMnAdzoneMapper.updateByExampleSelective(adzoneDo,adzoneDoExample);
            TbMnUserDo record = new TbMnUserDo();
            record.setId(adzoneId);
            record.setAccount(tbMnUserDo.getAccount());
            record.setPwd(tbMnUserDo.getPwd());
            record.setAgencyId(agencyId);
            record.setState("1");
            record.setCreatedAt(new Date());
            record.setUserName(tbMnUserDo.getUserName());
            tbMnUserMapper.insertSelective(record);
            return "4";
        }else {
            return "3";//暂时没有广告位
        }
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

    /**
     * 重新绑定提现账号
     * @param tbMnUserDo
     */
    public void resetAccount(TbMnUserDo tbMnUserDo) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAccountEqualTo(tbMnUserDo.getAccount());

        TbMnUserDo record = new TbMnUserDo();
        record.setBindAccount(tbMnUserDo.getBindAccount());
        tbMnUserMapper.updateByExampleSelective(record,example);
    }

    /**
     * 查出团队人数
     * @param tbMnUserDo
     * @return
     */
    public int queryTeamCount(TbMnUserDo tbMnUserDo) {
        TbMnUserDoExample example = new TbMnUserDoExample();
        example.createCriteria().andAgencyIdEqualTo(tbMnUserDo.getId());

        List<TbMnUserDo> list = tbMnUserMapper.selectByExample(example);
        if(null != list && list.size() > 0){
            return list.size();
        }
        return 0;
    }

    private String getRandom(){
        Random random = new Random();
        String result="";
        for (int i=0;i<4;i++)
        {
            result+=random.nextInt(10);
        }

        TbMnAdzoneDoExample example = new TbMnAdzoneDoExample();
        example.createCriteria().andRegisterCodeEqualTo(result);

        List<TbMnAdzoneDo> adzoneDos = tbMnAdzoneMapper.selectByExample(example);
        if(null != adzoneDos && adzoneDos.size() > 0){
            getRandom();
        }
       return result;
    }
}
