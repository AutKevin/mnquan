package cn.mnquan;

import cn.mnquan.model.HttpClientResponse;
import cn.mnquan.utils.HttpClientUtils;
import org.junit.Test;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/18
 */
public class OrderQueryTest {

    @Test
    public void queryOrder(){
        //https://api.open.21ds.cn/apiv1/gettkorder?apkey=登录后即可显示&starttime=2018-05-23 12:18:22&span=1200&page=1&pagesize=100&tkstatus=1&ordertype=create_time&tbname=海阔天空
        HttpClientResponse response =  HttpClientUtils.get("https://api.open.21ds.cn/apiv1/gettkorder?apkey=105bc582-a6b2-9c26-4e9d-e5bb9657c2c8&starttime=2018-05-23+12%3a18%3a22&span=1200&page=1&pagesize=100&tkstatus=1&ordertype=create_time&tbname=王柯成");
        System.out.println(response);
    }
}
