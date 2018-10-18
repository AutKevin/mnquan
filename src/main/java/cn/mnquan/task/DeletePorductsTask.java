package cn.mnquan.task;

import cn.mnquan.mapper.TbMnMaterialOptionalMapper;
import cn.mnquan.mapper.TbMnProductDetailMapper;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 定期删除失效的优惠券
 * </p>
 * User: wangkecheng Date: 2018/10/16
 */
public class DeletePorductsTask implements SimpleJob {

    @Autowired
    private TbMnProductDetailMapper tbMnProductDetailMapper;
    @Autowired
    private TbMnMaterialOptionalMapper tbMnMaterialOptionalMapper;

    public void execute(ShardingContext shardingContext) {
        //删除淘口令过期的优惠券

    }
}
