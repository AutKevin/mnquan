package cn.mnquan.manager;

import cn.mnquan.model.TbMnUserDo; /**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/13
 */
public interface ILoginManager {
    boolean checkAccountAndPwd(TbMnUserDo tbMnUserDo);
}
