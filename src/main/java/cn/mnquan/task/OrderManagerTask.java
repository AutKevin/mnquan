package cn.mnquan.task;

import cn.mnquan.manager.IOrderManager;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * <p>
 * 自动同步订单数据
 * </p>
 * User: wangkecheng Date: 2018/10/18
 */
@Slf4j
public class OrderManagerTask  implements SimpleJob {

    @Autowired
    private IOrderManager orderManager;

    public void execute(ShardingContext shardingContext) {
        log.info("自动查询订单数据");
        try {
            orderManager.queryOrderByTask();
        } catch (ApiException e) {
            log.error(e.getMessage(),e);
        }
    }
}
