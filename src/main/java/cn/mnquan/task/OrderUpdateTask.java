package cn.mnquan.task;

import cn.mnquan.manager.IOrderManager;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 每天凌晨，将未结算的订单重新查询一遍，进行更新
 * </p>
 * User: wangkecheng Date: 2018/11/12
 */
@Slf4j
public class OrderUpdateTask implements SimpleJob {

    @Autowired
    private IOrderManager orderManager;

    @Override
    public void execute(ShardingContext shardingContext) {
        log.info("自动更新订单数据");
        try {
            orderManager.queryOrderAndUpdate();
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }
}
