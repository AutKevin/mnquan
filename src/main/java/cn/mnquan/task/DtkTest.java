package cn.mnquan.task;

import cn.mnquan.commons.Contents;
import cn.mnquan.model.HttpClientResponse;
import cn.mnquan.model.TbMnCatItemDo;
import cn.mnquan.model.TbMnMaterialOptionalDo;
import cn.mnquan.model.TbMnMaterialOptionalDoExample;
import cn.mnquan.utils.BeanMapperUtil;
import cn.mnquan.utils.DateUtil;
import cn.mnquan.utils.HttpClientUtils;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/29
 */
public class DtkTest {
    public static void main(String[] args) {
        String url = Contents.DAK_URL+"?keywords=女装&xuan=keyword&px=sell";
            Document doc = null;
            try {
                HttpClientResponse rsp = HttpClientUtils.get(url);
                doc = Jsoup.parse(rsp.getResponseContent());
            } catch (Exception e) {
            }
            Elements rows = doc.getElementsByClass("goods-item");
        String numIid = rows.get(0).attr("data_goodsid");
        String datagid = rows.get(0).attr("id").replace("goods-items_","");

        HttpClientResponse rsp = HttpClientUtils.get("http://www.dataoke.com/item?id=16919348");

        Document doc1 = Jsoup.parse(rsp.getResponseContent());/*System.out.println(rsp.getResponseContent());*/
//获得所有p标签
        Elements links = doc1.select("div.goods-info div.goods-tit > p");
        System.out.println(links.get(0).text());


    }
}
