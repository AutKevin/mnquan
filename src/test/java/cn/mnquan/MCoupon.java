package cn.mnquan;

import cn.mnquan.model.HttpClientResponse;
import cn.mnquan.utils.HttpClientUtils;
import org.junit.Test;

/**
 * <p>
 * 猫有券口令解析
 * </p>
 * User: wangkecheng Date: 2018/10/23
 */
public class MCoupon {


    @Test
    public void test(){
        String url = "https://api.open.21ds.cn/apiv1/tpwdtoid?apkey=105bc582-a6b2-9c26-4e9d-e5bb9657c2c8&tpwd=€Zz5gb151Wmn€";
        HttpClientResponse rsp = HttpClientUtils.get(url);
        System.out.println(rsp.getResponseContent());
    }
}
