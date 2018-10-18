package cn.mnquan.task;

import cn.mnquan.model.HttpClientResponse;
import cn.mnquan.utils.HttpClientUtils;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 自动同步订单数据
 * </p>
 * User: wangkecheng Date: 2018/10/18
 */
public class OrderManagerTask  implements SimpleJob {

    public void execute(ShardingContext shardingContext) {
        //https://api.open.21ds.cn/apiv1/gettkorder?apkey=登录后即可显示&starttime=2018-05-23 12:18:22&span=1200&page=1&pagesize=100&tkstatus=1&ordertype=create_time&tbname=海阔天空
        HttpClientResponse response =  HttpClientUtils.get("https://api.open.21ds.cn/apiv1/gettkorder?apkey=105bc582-a6b2-9c26-4e9d-e5bb9657c2c8&starttime=2018-05-23 12:18:22&span=1200&page=1&pagesize=100&tkstatus=1&ordertype=create_time&tbname=王柯成");
        System.out.println(response);
    }
}
