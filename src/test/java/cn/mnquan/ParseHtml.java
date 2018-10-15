package cn.mnquan;

import cn.mnquan.mapper.TbMnCatItemMapper;
import cn.mnquan.model.TbMnCatItemDo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 描述
 * </p>
 * User: wangkecheng Date: 2018/10/2
 */
public class ParseHtml extends BaseSpringTest{

    @Autowired
    private TbMnCatItemMapper tbMnCatItemMapper;

    @Test
    public void parseUl(){
        String ul = "<ul class=\"main-cat2\"><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=8976\" data-cid=\"79989\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i2/2053469401/TB2.W1vtr5YBuNjSspoXXbeNFXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i2/2053469401/TB2.W1vtr5YBuNjSspoXXbeNFXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">游泳装备</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=8990\" data-cid=\"79991\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i2/2053469401/TB27Bmltv9TBuNjy1zbXXXpepXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i2/2053469401/TB27Bmltv9TBuNjy1zbXXXpepXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">健身装备 </a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=8997\" data-cid=\"79992\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i2/2053469401/TB2jEdstwmTBuNjy1XbXXaMrVXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i2/2053469401/TB2jEdstwmTBuNjy1XbXXaMrVXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">户外装备</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=8983\" data-cid=\"79990\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i1/2053469401/TB21gaMtER1BeNjy0FmXXb0wVXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i1/2053469401/TB21gaMtER1BeNjy0FmXXb0wVXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">瑜伽用品</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=9004\" data-cid=\"79993\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i3/2053469401/TB2jkxwlnXYBeNkHFrdXXciuVXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i3/2053469401/TB2jkxwlnXYBeNkHFrdXXciuVXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">健身服装</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=31266\" data-cid=\"79997\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i4/2053469401/TB2zphywqSWBuNjSsrbXXa0mVXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i4/2053469401/TB2zphywqSWBuNjSsrbXXa0mVXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">球迷用品</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=9011\" data-cid=\"79994\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i3/2053469401/TB2O0u8tASWBuNjSszdXXbeSpXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i3/2053469401/TB2O0u8tASWBuNjSszdXXbeSpXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">泳衣</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=9018\" data-cid=\"79995\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i3/2053469401/TB2cbv2tCtYBeNjSspaXXaOOFXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i3/2053469401/TB2cbv2tCtYBeNjSspaXXaOOFXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">泳镜</a></li><li style=\"\" class=\"cat-item \"><a href=\"/index.php?r=class/sub&amp;cid=9025\" data-cid=\"79996\"><img class=\"lazy\" src=\"https://img.alicdn.com/imgextra/i4/2053469401/TB2rSl_tuuSBuNjSsplXXbe8pXa-2053469401.png_310x310.jpg\" data-original=\"https://img.alicdn.com/imgextra/i4/2053469401/TB2rSl_tuuSBuNjSsplXXbe8pXa-2053469401.png_310x310.jpg\" alt=\"\" style=\"background: rgb(245, 245, 245); display: block;\">瑜伽垫</a></li></ul>";

        Document doc = Jsoup.parse(ul, "UTF-8");
        Document docSub;
        Elements content = doc.getElementsByClass("cat-item");
        for (int i = 1; i <= content.size(); i++) {
            docSub = Jsoup.parse(content.get(i).toString());
            Element doc_a = docSub.getElementsByTag("a").get(0);
            Element doc_img = docSub.getElementsByTag("img").get(0);
            String catName = doc_a.text();
            String pictureUrl = doc_img.attr("data-original");
            System.out.println(catName);
            System.out.println(pictureUrl);

            TbMnCatItemDo record = new TbMnCatItemDo();
            record.setCatId("14");
            record.setCatName("户外运动");
            record.setCategoryId(String.valueOf(i));
            record.setCategoryName(catName);
            record.setCategoryPictureUrl(pictureUrl);
            record.setSkipUrl("/app");
            record.setSort((short)i);
            record.setState("1");

            tbMnCatItemMapper.insertSelective(record);

        }
    }
}
