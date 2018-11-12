package cn.mnquan;

import cn.mnquan.manager.IOrderManager;
import com.taobao.api.ApiException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/18
 */
public class OrderQueryTest extends BaseSpringTest{

    @Autowired
    private IOrderManager orderManager;

    @Test
    public void queryOrder() throws ApiException {
        orderManager.queryOrderAndUpdate();
    }
}
