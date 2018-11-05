package weibo4j;

import org.apache.commons.io.IOUtils;
import weibo4j.http.ImageItem;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/29
 */
public class Send {
    public static void main(String[] args) {
        try {
            //http://www.mnquan.cn/app/detail/skipProductDetail.do?numIid=576356392290
        String access_token = "2.002S3P4HE3KwGE3ad98af740k43PDC";
        String statuses = URLEncoder.encode("【优惠券详情链接】 http://www.mnquan.cn/app/detail/skipProductDetail.do?numIid=576356392290&type=weibo\n【app下载链接】 http://www.mnquan.cn/app/apk/download.do","utf-8");
        Timeline tm = new Timeline(access_token);

            ImageItem imageItem1 = new ImageItem(loadImageByte("https://img.alicdn.com/bao/uploaded/i4/47011887/O1CN011PoHpdFZctdOzLx_!!47011887.jpg"));

            Status share = tm.share(statuses,imageItem1);
            System.out.println(share);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] loadImageByte(String imgUrl) {
        byte[] picData = null;
        try {
            InputStream inputImage = new URL(imgUrl).openStream();
            picData = IOUtils.toByteArray(inputImage);
        } catch (Exception e) {
            System.out.println("失败");
        }
        return picData;
    }
}
