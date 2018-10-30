package cn.mnquan.manager;

import cn.mnquan.model.TbMnUserDo;

import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/14
 */
public interface IUserManager {
    String addUser(TbMnUserDo tbMnUserDo);

    TbMnUserDo queryUserByAccountNo(String s);

    List<TbMnUserDo> queryUserList(TbMnUserDo tbMnUserDo);

    void resetAccount(TbMnUserDo tbMnUserDo);

    int queryTeamCount(TbMnUserDo tbMnUserDo);
}
