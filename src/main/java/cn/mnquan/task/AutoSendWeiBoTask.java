package cn.mnquan.task;

import cn.mnquan.mapper.TbMnMaterialOptionalMapper;
import cn.mnquan.model.TbMnMaterialOptionalDo;
import cn.mnquan.utils.DateUtil;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import weibo4j.Timeline;
import weibo4j.http.ImageItem;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

/**
 * <p>
 * 自动发微博
 * </p>
 * User: wangkecheng Date: 2018/10/29
 */
@Slf4j
public class AutoSendWeiBoTask implements SimpleJob {

    @Autowired
    private TbMnMaterialOptionalMapper tbMnMaterialOptionalMapper;

    public void execute(ShardingContext shardingContext) {
        log.info("开发发送微博");
        //随机送表内获取一个少于29.9的商品发微博
        TbMnMaterialOptionalDo item = tbMnMaterialOptionalMapper.selectWeiBoProduct();
        try {
            String access_token = "2.002S3P4HE3KwGE3ad98af740k43PDC";
            String statuses = URLEncoder.encode(item.getShortTitle()+"\n【原价】"+item.getZkFinalPrice()+"元，【"+item.getCouponInfo()+"】\n"+item.getJddPrice()+"\n【优惠券详情链接】 http://www.mnquan.cn/app/detail/skipProductDetail.do?numIid="+item.getNumIid()+"\n【app下载链接】 http://www.mnquan.cn/app/apk/download.do","utf-8");
            Timeline tm = new Timeline(access_token);

            ImageItem imageItem1 = new ImageItem(loadImageByte(item.getPictUrl()));

            tm.share(statuses,imageItem1);
            log.info("微博发送成功,dateTime:{}", DateUtil.getCurrentTimeBySecond());
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }

    public byte[] loadImageByte(String imgUrl) {
        byte[] picData = null;
        try {
            InputStream inputImage = new URL(imgUrl).openStream();
            picData = IOUtils.toByteArray(inputImage);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return picData;
    }
}
