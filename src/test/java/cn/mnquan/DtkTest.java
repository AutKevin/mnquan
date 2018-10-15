package cn.mnquan;

import cn.mnquan.manager.IDtkManager;
import cn.mnquan.model.HttpClientResponse;
import cn.mnquan.utils.HttpClientUtils;
import com.taobao.api.ApiException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/9/29
 */
public class DtkTest extends BaseSpringTest{

    @Autowired
    private IDtkManager dtkManager;

    @Test
    public void getProductsFromDTK() throws ApiException {
        dtkManager.execute();
    }

    @Test
    public void getProducts(){
        String url = "http://www.dataoke.com/search/?keywords=%E5%AE%9D%E5%AE%9D%E7%94%A8%E5%93%81&xuan=keyword&page=0";
        HttpClientResponse rsp = HttpClientUtils.get(url);
        Document doc = Jsoup.parse(rsp.getResponseContent());
        Elements rows = doc.getElementsByClass("goods-item");
        for(int i = 0 ; i<rows.size() ; i++){
            String itemId = rows.get(i).attr("data_goodsid");
            System.out.println(itemId);
        }
    }


}
