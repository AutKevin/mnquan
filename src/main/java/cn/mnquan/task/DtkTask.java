package cn.mnquan.task;

import cn.mnquan.manager.IDtkManager;
import cn.mnquan.utils.DateUtil;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * <p>
 * 每天凌晨2点定时从大淘客网站获取最新商品信息
 * </p>
 * User: wangkecheng Date: 2018/9/29
 */
@Slf4j
public class DtkTask implements SimpleJob{

    @Autowired
    private IDtkManager dtkManager;
    /**
     * 定时任务执行入口
     * @param shardingContext
     */
    public void execute(ShardingContext shardingContext) {
        log.info("大淘客定时任务开始运行,dateTime:{}", DateUtil.dateTimeFormat(new Date()));
        try {
            dtkManager.execute();
        } catch (ApiException e) {
            e.printStackTrace();
        }
        log.info("大淘客定时任务开始结束,dateTime:{}", DateUtil.dateTimeFormat(new Date()));
    }
}
