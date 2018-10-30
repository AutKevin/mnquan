package cn.mnquan;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/6
 */
public class DemoTest {

    @Test
    public  void main() {
       String str = "{\"code\":200,\"data\":\"544560042583\",\"msg\":\"解析成功\"}";
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(str);
        System.out.println("rst:" + jsonObject.get("data"));
    }


    @Test
    public void zhuanlian(){
        String str = "【魅斑大码宽松羊毛呢大衣2018新款,优雅大气的大衣，上身亮眼又大气】，https://m.tb.cn/h.3RtxzAV?sm=ed307b 点击链接，再选择浏览器咑閞；或復·制这段描述€PXBdbh0Qjpd€后咑閞 淘 寳  ";
        Pattern p= Pattern.compile("€(\\w+)￥");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group(1));

        }
    }
}
