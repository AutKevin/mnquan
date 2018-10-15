<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta content="telephone=no" name="format-detection"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <title>连衣裙折扣，领券立减_淘券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,淘券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <script src="http://cmsstatic.dataoke.com//web/js/jquery.2.0.min.js?v=201809291636"></script>
    <%--<link href="http://cmsstatic.dataoke.com//web/css/wap_common.css?v=201809291636" rel="stylesheet">--%>
    <style>
        /**
 * static.cms - v1.0.0  License By
 * WEB小组
 */
        .iconfont,.toTop:before{font-family:iconfont!important}#detail-top-menu .iconfontv2,.iconfont{-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale;font-style:normal}.ads-list2 .goods-item>div.text .title,.goods-new li .cent .bt,.goods-new li .cent .num,.ui_bot_tab .row-s>a em.num{text-overflow:ellipsis;white-space:nowrap}@font-face{font-family:iconfont;src:url(iconfont/iconfont.eot?t=1532938536847);src:url(iconfont/iconfont.eot?t=1532938536847#iefix) format('embedded-opentype'),url(data:application/x-font-woff;charset=utf-8;base64,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) format('woff'),url(iconfont/iconfont.ttf?t=1532938536847) format('truetype'),url(iconfont/iconfont.svg?t=1532938536847#iconfont) format('svg')}.iconfont{font-size:16px}.icon-juhuasuan:before{content:"\e601"}.icon-zhankai:before{content:"\e600"}.icon-top:before{content:"\e603"}.icon-taoqianggou:before{content:"\e604"}.icon-remen:before{content:"\e638"}.icon-coordinates_fill:before{content:"\e6ec"}.icon-fanhuidingbu:before{content:"\e606"}.icon-juhuasuan1:before{content:"\e609"}.icon-top1:before{content:"\e6a4"}.icon-fenleitubiao:before{content:"\e628"}.icon-shang:before{content:"\e6ed"}.icon-qiang:before{content:"\e629"}.icon-shoppingbag:before{content:"\e62a"}.icon-shangtwo:before{content:"\e764"}.fl{float:left}.fr{float:right}.hide{display:none}.show{display:block}li{list-style:none}a{text-decoration:none}body,button,div,img,input,li,p,span,ul{margin:0;border:none;padding:0;outline:0}body{font-size:17px;margin:0 auto;background:#faf5f6;top:0;left:0}.no-scroll{height:100%;overflow:hidden}.clearfix:after{content:".";display:block;height:0;clear:both;visibility:hidden}.toTop,.toTop:before{width:35px;height:35px}.toTop{background:rgba(51,51,51,.8);display:none;overflow:hidden;line-height:35px;border-radius:35px;-moz-border-radius:35px;-webkit-border-radius:35px;-o-border-radius:35px;-ms-border-radius:35px;text-align:center;position:fixed;color:#fff;z-index:100;right:20px;bottom:25px}.toTop:before{display:block;content:"\e764"}.main-title .main-logo{font-family:Simhei;max-width:97px;font-weight:700;font-size:19px;line-height:32px;color:#fff;overflow:hidden;max-height:32px}.main-title .main-logo img{height:28px}
        .main-title .main-icon{
            position:relative;
            z-index:7;
            background:url(http://localhost:8080/page/img/return.png) 0 2px no-repeat;
            background-size:287px 800px;
            width:28px;
            height:28px;
            margin-left:2px;top:0}.main-title,.main-title-bg{height:44px}.main-title #mui-action-app{background-position:-221px -537px;width:30px}.main-title{background:-moz-linear-gradient(left,#FA4DBE 0,#FBAA58 100%);background:-webkit-gradient(linear,left top,left right,color-stop(0,#FA4DBE),color-stop(100%,#FBAA58));background:-webkit-linear-gradient(left,#FA4DBE 0,#FBAA58 100%);background:-o-linear-gradient(left,#FA4DBE 0,#FBAA58 100%);background:-ms-linear-gradient(left,#FA4DBE 0,#FBAA58 100%);background:linear-gradient(to left,#FA4DBE 0,#FBAA58 100%);border-bottom-color:transparent;padding:8px 10px;position:fixed;top:0;left:0;width:100%;z-index:120;display:block;box-sizing:border-box}.goods-list .goods-item a.img img.lazy{background:#f5f5f5}.main-title .menu-cat,.main-title .menu-detail{font-family:Simhei;font-size:17px;height:28px;line-height:28px;color:#fff;text-align:center}.main-title .menu-cat span{position:relative;cursor:pointer;padding:6px 22px 6px 15px}.main-title .menu-cat span i{position:absolute;width:17px;height:17px;top:6px;right:0;background:url(../images/cms-img.png?v=2018-09-29) -94px 0 no-repeat;background-size:287px 800px}.main-title .menu-cat span i.show,.main-title .menu-cat span.active i{-moz-transform:scaleY(-1);-webkit-transform:scaleY(-1);-o-transform:scaleY(-1);transform:scaleY(-1)}.main-title .main-home,.main-title .main-more{position:absolute;z-index:7;background:url(../images/cms-img.png?v=2018-09-29) -62px 0 no-repeat;background-size:287px 800px;width:28px;height:28px;right:10px;top:10px}
        .main-title .main-back{
            position:absolute;
            left:10px;
            height:28px;
            width:28px;
            display:block;
            background:url(http://localhost:8080/page/img/return.png) -32px 0 no-repeat;
            background-size:287px 800px;float:left}
        .main-title .close-src{
            position:absolute;
            left:20px;
            height:28px;
            width:28px;
            display:block;
            background:url(http://localhost:8080/page/img/return.png) -32px 0 no-repeat;
            background-size:287px 800px;float:left}
        .main-title .my-search,.main-title .search{margin-left:8px;position:relative;padding:0 9px;height:28px;line-height:28px;font-size:13px}
        .main-title .main-more{background:url(http://localhost:8080/page/img/return.png) -243px 0 no-repeat;background-size:287px 800px}.main-title .search{z-index:5}.main-title .search input{border:none;outline:0;height:28px;font-size:13px;line-height:28px;background:#fff;color:#666;border-radius:5px;padding:0 0 0 5px}.main-title .search .search_submit{position:absolute;width:24px;height:24px;top:2px;border:none;display:block;background:url(../images/cms-img.png?v=2018-09-29) 6px -26px no-repeat;background-size:287px 800px;right:6px}.main-title .search .search-in{display:none}.main-title .search .search-kw{max-width:125px;position:absolute;right:10px;line-height:28px;color:#666}.show-top-menu{position:fixed;top:0;width:100%;height:100%;z-index:-1;font-family:MicrosoftYaHei;-webkit-transform:translateY(-50%) translateX(0);transform:translateY(-50%) translateX(0);transition:all .6s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transition:all .6s cubic-bezier(.4,.68,.15,1) 0s;opacity:0}.show-top-menu .menu-nav{width:4.8em;position:absolute;left:0;top:0;height:100%;overflow:hidden;overflow-y:auto;z-index:5;background:#F4F4F4}.show-top-menu .menu-nav a{line-height:45px;display:block;height:45px;color:#333;z-index:10;font-size:13px;text-align:center;position:relative;transition:all .4s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transition:all .4s cubic-bezier(.4,.68,.15,1) 0s}.show-top-menu .menu-nav a.active{color:#FC3F78}.show-top-menu .menu-nav .bg{position:absolute;left:0;top:0;z-index:4;width:100%;height:45px;border-left:solid 2px #FC3F78;background:#fff;transition:all .4s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transition:all .4s cubic-bezier(.4,.68,.15,1) 0s}.show-top-menu .img{margin:0 10px;overflow:hidden;padding-top:10px}.show-top-menu .img img{display:block;width:100%;border-radius:5px;min-height:60px;background:#f5f5f5}.show-top-menu .img.hide{display:none}.show-top-menu .menu-content .tab{font-weight:400;font-size:18px;line-height:45px;text-align:center;margin:0 0 44px;position:relative;top:44px}.show-top-menu .menu-mask{background:rgba(0,0,0,.65);width:100%;height:100%;display:block;position:absolute;left:0;z-index:1;opacity:0;transition:all .7s cubic-bezier(.4,.68,.15,1) .2s;-webkit-transition:all .7s cubic-bezier(.4,.68,.15,1) .2s}.cat_tab_list li,.show-top-menu .menu-content{transition:all .6s cubic-bezier(.4,.68,.15,1) 0s}.show-top-menu .menu-content{width:100%;position:absolute;z-index:2;top:0;right:0;background:#fff;padding-bottom:22px;height:100%;-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);-webkit-transition:all .6s cubic-bezier(.4,.68,.15,1) 0s;overflow:hidden;overflow-y:auto}.show-top-menu .menu-content .cent{margin-left:4.8em;overflow:hidden;overflow-y:auto;position:relative;z-index:0}.show-top-menu .menu-content .main-cat{overflow:hidden;padding-bottom:27px}.show-top-menu .menu-content .main-cat li{box-sizing:border-box;float:left;width:25%;height:51px;border-bottom:#eee 1px solid;border-right:#eee 1px solid;text-align:center;line-height:50px}.show-top-menu .menu-content .main-cat li a{display:block;color:#333;font-size:14px}.show-top-menu .menu-content .main-cat li:nth-child(4n){border-right:none}.show-top-menu .menu-content .main-cat2 li{width:33%;float:left;text-align:center;opacity:1;transition:all .5s cubic-bezier(.4,.68,.15,1) .2s;-webkit-transition:all .5s cubic-bezier(.4,.68,.15,1) .2s;-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0)}.show-top-menu .menu-content .main-cat2 li a{display:block;font-size:12px;color:#333;line-height:25px;overflow:hidden;padding-bottom:20px}.show-top-menu .closs,.show-top-menu .closs .main-icon{color:rgba(255,255,255,.7);text-align:center;display:block}.show-top-menu .menu-content .main-cat2 li img{display:block;margin:auto;width:60%;min-height:40px}.show-top-menu .menu-content .main-cat2.active li{opacity:0;-webkit-transform:translateY(-20px) translateX(0);transform:translateY(-20px) translateX(0)}.show-top-menu .menu-content .main-cat2{padding-top:20px}.show-top-menu .menu-content .main-cat2:after{content:"";height:0;overflow:hidden;clear:both}.show-top-menu .closs{transition:all .5s cubic-bezier(.4,.68,.15,1) .2s;-webkit-transition:all .5s cubic-bezier(.4,.68,.15,1) .2s;-webkit-transform:translateY(0) translateX(100px);transform:translateY(0) translateX(100px);line-height:18px;opacity:0;width:20px;float:left;font-size:14px;position:fixed;left:10%;margin:-80px 0 0 -10px;z-index:10;top:50%}.show-top-menu .closs .main-icon{border:1px solid rgba(255,255,255,.7);font-family:"宋体";line-height:14px;height:14px;width:14px;font-size:12px;border-radius:20px;font-style:normal;font-weight:600;position:relative;top:10px;margin:auto}.show-top-menu .menu-content .up-menu{display:none;width:120px;height:25px;border-radius:1px;border:1px solid #ff7f90;text-align:center;color:#ff7f90;font-size:13px;line-height:24px;margin:0 auto;box-sizing:border-box}.show-top-menu .menu-content.show,.show-top-menu .menu-mask.show{-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);top:0!important}.show-top-menu .menu-mask.show .closs{-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);opacity:1}.show-top-menu .menu-mask.show{opacity:1}.show-top-menu .menu-mask.show:active{background:rgba(254,74,101,.7)}.show-top-menu .menu-content.show1,.show-top-menu .menu-mask.show1{top:50px;border-top:1px solid #eee}.show-top-menu.active{z-index:100}.show-top-menu.active .menu-content,.show-top-menu.active .menu-mask{-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);top:0!important}.show-top-menu.active,.show-top-menu.active .closs{-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);opacity:1}.show-top-menu-load{background:url(../../images/load.gif?v=2018-09-29) center center no-repeat;background-size:50px 50px;position:absolute;z-index:101;width:100%;height:100%;text-align:center;line-height:100%;top:0;left:0}.ads-list,.pullup-goods{background-color:#fff;text-align:center}.pullup-goods{font-size:12px;height:50px;display:block;line-height:50px;color:#565656}.ads-list{padding:.4em .2em .2em}.ads-list .goods-item{width:48%;float:left;text-align:left;margin-bottom:1em;margin-right:.15em}.ads-list .goods-item:nth-child(2n){float:right}.ads-list .goods-item a.img{width:100%;position:relative;display:block}.ads-list .goods-item a.img .today-wrapper{position:absolute;right:50px;bottom:0;z-index:10;text-align:center;background-color:#000;opacity:.5;width:35px;color:#FFF;font-size:12px;border-radius:1px;height:1rem;line-height:1rem}.wap11,.wap11-ks{background-repeat:no-repeat;background-color:#fff!important;background-position:center;border:1px solid red;height:14px!important}.ads-list .goods-item a.img .today-wrapper b{font-weight:400;padding:0 5px}.wap11{background-image:url(../images/wap11.png?v=2018-09-29);background-size:90%;width:59px}.wap11-ks{background-image:url(../images/ssyks.png?v=2018-09-29);background-size:71%;width:50px}.ads-list .goods-item a.img .today-wrapper span{display:block;font-size:12px;line-height:16px;padding:0 4px}.ads-list .goods-item a.img .coupon-wrapper span{display:block;font-size:10px;line-height:16px;padding:0 3px}.ads-list .goods-item a.img .coupon-wrapper .coupon{color:#EDFF00}.ads-list .goods-item a.img .coupon-wrapper .price{color:#FFF}.ads-list .goods-item a.img img{width:100%;border:none}.ads-list .goods-item a.title{width:100%}.ads-list .goods-item a.title .text{word-break:break-all;width:100%;overflow:hidden;color:#a3a3a3;font-size:12px;line-height:18px;height:18px;margin:5px 5px 0}.ads-list .goods-item .price-wrapper{position:relative;margin:.2em 5px}.ads-list .goods-item .price-wrapper .text{color:#a3a3a3;font-size:12px;display:inline-block}.ads-list .goods-item .price-wrapper .price{color:#FE0000;font-size:1rem;margin-left:-.3em;display:inline-block;margin-top:.1em;font-family:Arial}.ads-list .goods-item .price-wrapper .sold-wrapper{position:absolute;right:0;top:.05em}.ads-list .goods-item .price-wrapper .sold-wrapper .sold-num{color:#888;font-size:12px;font-family:Arial}.ads-list .goods-item .price-wrapper .sold-wrapper .text{color:#a3a3a3;font-size:12px}.goods-list,.goods-list2{padding:.4em .2em .2em;text-align:center;overflow:hidden}.goods-list .goods-item,.goods-list .goods-item-ads{width:48%;display:block;text-align:left;margin-bottom:.4em;margin-left:.15em;float:left}.goods-list .goods-item-ads:nth-child(2n),.goods-list .goods-item:nth-child(2n){margin-right:.15em;float:right}.goods-list .goods-item a.img,.goods-list .goods-item-ads a.img{width:100%;position:relative;display:block;overflow:hidden;z-index:1;background:#f5f5f5}.ads-list .goods-item a.img .coupon-wrapper,.goods-list .goods-item a.img .coupon-wrapper,.goods-list .goods-item a.img .today-wrapper,.goods-list .goods-item-ads a.img .coupon-wrapper,.goods-list .goods-item-ads a.img .today-wrapper{position:absolute;bottom:0;right:0;z-index:10;font-size:10px;filter:progid:DXImageTransform.Microsoft.Gradient(startColorStr='#F2AE2E', endColorStr='#FE8102', gradientType='0');background:-moz-linear-gradient(left,#F2AE2E,#FE8102);background:-o-linear-gradient(left,#F2AE2E,#FE8102);background:-webkit-gradient(linear,0 0,100% 100%,from(#F2AE2E),to(#FE8102));height:1rem;line-height:1rem;color:#fff;border-radius:1px;width:50px;text-align:center;float:right;font-family:"Microsoft Yahei"}.goods-list .goods-item a.img .today-wrapper,.goods-list .goods-item-ads a.img .today-wrapper{right:50px;background:#000;opacity:.5;width:35px}#detail-top-menu .arrow,#detail-top-menu .detail-menu-content{-o-transition:all .4s ease 0s;-moz-transition:all .4s ease 0s;-webkit-transition:all .4s ease 0s;opacity:0}.ads-list .goods-item a.img .coupon-wrapper i,.goods-list .goods-item a.img .coupon-wrapper i,.goods-list .goods-item a.img .today-wrapper i,.goods-list .goods-item-ads a.img .coupon-wrapper i,.goods-list .goods-item-ads a.img .today-wrapper i{font-style:normal}.ads-list .goods-item a.img .coupon-wrapper b,.goods-list .goods-item a.img .coupon-wrapper b,.goods-list .goods-item a.img .today-wrapper b,.goods-list .goods-item-ads a.img .coupon-wrapper b,.goods-list .goods-item-ads a.img .today-wrapper b{font-family:Arial;font-size:10px;font-weight:400}.goods-list .goods-item a.img .coupon-wrapper .coupon,.goods-list .goods-item-ads a.img .coupon-wrapper .coupon{color:#f3b419}.goods-list .goods-item a.img .coupon-wrapper .price,.goods-list .goods-item-ads a.img .coupon-wrapper .price{color:#FFF}.goods-list .goods-item a.img img,.goods-list .goods-item-ads a.img img{width:100%;border:none;vertical-align:top}.goods-list .goods-item a.title,.goods-list .goods-item-ads a.title{width:100%;margin-top:.2em;display:block}.goods-list .goods-item a.title .text,.goods-list .goods-item-ads a.title .text{word-break:break-all;overflow:hidden;color:#777;font-size:13px;line-height:18px;text-align:left;height:18px;margin:0 5px}.goods-list .goods-item .price-wrapper,.goods-list .goods-item-ads .price-wrapper{position:relative;margin:.2em 5px}.goods-list .goods-item .price-wrapper .text,.goods-list .goods-item-ads .price-wrapper .text{color:#aaa;font-size:12px;display:inline-block;margin-left:5px}.goods-list .goods-item .price-wrapper .price,.goods-list .goods-item-ads .price-wrapper .price{color:#FE0000;font-size:.8rem;margin-left:-.3em;display:inline-block;margin-top:.1em;font-family:PingFang-SC-Bold,Arial}.goods-list .goods-item .price-wrapper .price span,.goods-list .goods-item-ads .price-wrapper .price span{font-size:1rem;font-family:Arial}.goods-list .goods-item .price-wrapper .sold-wrapper,.goods-list .goods-item-ads .price-wrapper .sold-wrapper{position:absolute;right:0;top:0}.goods-list .goods-item .price-wrapper .sold-wrapper .sold-num,.goods-list .goods-item-ads .price-wrapper .sold-wrapper .sold-num{color:#888;font-size:10px;font-family:Arial;margin-left:4px}.goods-list .goods-item .price-wrapper .sold-wrapper .text,.goods-list .goods-item-ads .price-wrapper .sold-wrapper .text{color:#888;font-size:10px}
        .descript-tag-list .descript-tag-item i{
            position:absolute;
            left:10px;
            width:13px;
            height:11px;
            top:4px;
            background:url(http://localhost:8080/page/img/return.png) -1px -751px no-repeat;background-size:287px 800px}.descript-tag-list .descript-tag-item i.descript-tag-icon-2{background-position:-21px -751px}.descript-tag-list .descript-tag-item i.descript-tag-icon-3{background-position:-41px -751px}.descript-tag-list .descript-tag-item i.descript-tag-icon-4{background-position:-61px -751px}.descript-tag-list .descript-tag-item i.descript-tag-icon-5{background-position:-81px -751px}.descript-tag-list .descript-tag-item i.descript-tag-icon-0{background-position:-101px -751px}a.img .video_icon{width:50px;height:50px;border:2px solid #fff;border-radius:100%;position:absolute;left:50%;top:50%;margin:-27px;background:rgba(0,0,0,.2)}a.img .video_icon:after{content:'';width:0;height:0;position:absolute;top:14px;left:19px;border-top:10px solid transparent;border-bottom:10px solid transparent;border-left:16px solid #fff}#detail-top-menu{position:fixed;width:100%;height:0;top:44px;right:0;z-index:7;overflow:hidden}@font-face{font-family:iconfontv2;src:url(../common/images/iconfont/iconfont.eot?t=1536228655063?v=2018-09-29);src:url(../common/images/iconfont/iconfont.eot?t=1536228655063#iefix?v=2018-09-29) format('embedded-opentype'),url(data:application/x-font-woff;charset=utf-8;base64,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) format('woff'),url(../common/images/iconfont/iconfont.ttf?t=1536228655063?v=2018-09-29) format('truetype'),url(../common/images/iconfont/iconfont.svg?t=1536228655063#iconfont?v=2018-09-29) format('svg')}#detail-top-menu .iconfontv2{font-family:iconfontv2!important;font-size:16px}#detail-top-menu .icon-detail_home:before{content:"\e630"}#detail-top-menu .icon-detail_search:before{content:"\e631"}#detail-top-menu .icon-detail_servicer:before{content:"\e62f"}#detail-top-menu .icon-datail_feedback:before{content:"\e62e"}#detail-top-menu .icon-gerenzhongxin:before{content:"\e653"}#detail-top-menu .detail-menu-content{-webkit-transform:translateY(0) translateX(100%);transform:translateY(0) translateX(100%);width:120px;border-radius:6px;overflow:hidden;position:absolute;z-index:2;top:7px;right:5px;background:rgba(51,51,51,.9)}#detail-top-menu .detail-menu-content .main-detail{overflow:hidden}#detail-top-menu .detail-menu-content .main-detail li{border-bottom:solid 1px rgba(102,102,102,.9);color:#fff;font-size:14px;margin:0 .5rem;line-height:44px}#detail-top-menu .detail-menu-content .main-detail li .iconfontv2{margin:0 10px 0 25px}#detail-top-menu .detail-menu-content .main-detail li a{display:block;color:#fff;font-size:14px}#detail-top-menu .detail-menu-content .main-detail li:nth-child(4n){border-right:none}#detail-top-menu.show{z-index:111;height:100%}#detail-top-menu .arrow{width:0;height:0;border-left:7px transparent solid;border-right:7px transparent solid;border-bottom:7px rgba(51,51,51,.9) solid;border-top:none;position:absolute;right:18px;top:0;z-index:9999;-webkit-transform:translateY(0) translateX(100%);transform:translateY(0) translateX(100%)}#detail-top-menu.show .arrow,#detail-top-menu.show .detail-menu-content{-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);opacity:1}#detail-top-menu .menu-mask2{background:rgba(0,0,0,.5);width:100%;height:100%;display:block;position:absolute;left:0;z-index:1;top:0}.shuang11{height:40px;width:100%;background-color:#FF0036}.shuang11 .imgbg{background-size:84%;background-repeat:no-repeat;background-position:center;float:left;width:34%;height:40px}.img_ks{background-image:url(../images/ssyjx.png?t=123?v=2018-09-29);background-size:70%!important;width:27%!important}.img_ys{background-image:url(../images/wapdt11.png?t=123?v=2018-09-29)}.shuang11 .quan{float:left;color:#F6FF00;font-size:13px;height:40px;line-height:42px}.shuang11 .quan span{font-family:Arial}.shuang11 .zsz{font-size:12px;float:right;height:40px;line-height:40px;margin-right:10px;color:#FFEBEF}.wap-srcBtn{width:18%;height:28px;background:#FFB925;color:#fff;float:right;margin-top:-28px;position:relative;border-radius:15px;margin-right:5%;z-index:30}.price_yj{font-size:12px;color:#888;border-bottom:1px solid #888;height:8px;display:inline-block;margin-left:5px}.ads-list2 .goods-item{margin-bottom:5px;background:#fff;position:relative;z-index:0;min-height:80px}.ads-list2 .goods-item a.img{width:36%;float:left;display:block}.ads-list2 .goods-item a.img img{display:block;width:100%;min-height:80px}.ads-list2 .goods-item>div.text{width:60%;float:left}.ads-list2 .goods-item>div.text>div{padding:0 10px}.ads-list2 .goods-item>div.text .title{font-size:16px;color:#666;line-height:52px;display:block;overflow:hidden}.ads-list2 .goods-item .theme-bg-color-1{font-size:10px;background:-webkit-gradient(linear,0 0,100% 100%,from(#F2AE2E),to(#FE8102));height:22px;line-height:22px;color:#fff;border-radius:3px;display:inline-block;padding:0 10px;text-align:center}.ads-list2 .goods-item .theme-bg-color-1 *{font-weight:400;font-style:normal;font-family:Arial}.ads-list2 .goods-item .theme-bg-color-1 b{font-size:14px}.ads-list2 .goods-item .price-wrapper{position:absolute;left:36%;bottom:0;width:60%;text-align:right;line-height:50px}.ads-list2 .goods-item .price-wrapper .price{display:inline-block;padding-left:10px;float:left;color:#FE0000;font-size:12px}.ads-list2 .goods-item .price-wrapper .price span{font-size:16px;font-family:Arial}.ads-list2 .goods-item .price-wrapper .sold-wrapper{font-size:12px;color:#888;padding-right:10px;font-family:Arial}.icon_nav_tab,.icon_nav_tab.icon_nav_tab_whole{padding-right:0}.ads-list2 .goods-item .price-wrapper .price_yj{float:left;border:0}.mysrc{background-color:#fff;border-radius:5px;min-width:50%;margin-left:10px;line-height:28px;height:28px;position:relative}.mysrc .search_area{margin-left:25px;background:0 0;color:#ccc;position:absolute;top:0;font-size:14px}.ggw_fm .ggw_fm_close_box,.ggw_fm_main .ggw_fm_close,.ggw_fm_swiper .ggw_fm_close,.ggw_fr_main .ggw_fm_close{color:#fff;font-size:12px;line-height:20px;font-family:Helvetica,Arial,sans-serif;display:block;text-align:center}
        .main-title .mysrc .search_submit{
            position:absolute;
            width:24px;
            height:24px;
            top:2px;
            border:none;
            display:block;
            background:url(http://localhost:8080/page/img/return.png) 6px -26px no-repeat;
            background-size:287px 800px;right:6px;overflow:hidden}
        .ggw_fm,.ggw_fm_cover{position:fixed;width:100%;top:0;left:0}.ggw_fm{z-index:9999995555555;height:120%}.cms_ggw img{width:100%}.ggw_fm_cover{height:100%;background:#000;opacity:.7;z-index:9999990}.ggw_fm_main{position:absolute;width:60%;top:50%;height:auto;margin-top:-40%;left:20%;z-index:9999991}.ggw_fm_main a{display:block}.ggw_fm_main a img{vertical-align:top}.ggw_fm .ggw_fm_close_box,.ggw_fm_main .ggw_fm_close,.ggw_fm_swiper .ggw_fm_close{z-index:99999901;position:fixed;top:10px;right:10px;border-radius:50px;width:20px;height:20px;background:url(/web/images/close_x.svg?v=2018-09-29) center center no-repeat rgba(0,0,0,.15);background-size:50%;border:1px solid #fff}.ggw_fr{position:fixed;width:80px;height:80px;top:50%;margin-top:-35px;right:0;z-index:99}.ggw_fr_main .ggw_fm_close{position:absolute;left:50%;bottom:-20px;margin-left:-10px;border-radius:50px;width:15px;height:15px;background:url(/web/images/close_x.svg?v=2018-09-29) center center no-repeat rgba(0,0,0,.15);background-size:50%;border:1px solid #fff}.icon_nav_tab .tab_def_list,.icon_nav_tab_box .tab a{font-family:iconfont!important}.ggw_fr_main{display:block;position:relative}.ggw_fm .ggw_fm_close_box{position:absolute}.ggw_fm_swiper .ggw_fm_close{position:absolute;z-index:50;top:5px;right:5px;width:15px;height:15px}.icon_nav_tab{height:44px;z-index:80;zoom:1;position:fixed;top:44px;width:100%;background:#fff;transform-origin:center;text-align:center;overflow:hidden}.icon_nav_tab_bg{height:44px}.icon_nav_tab .swiper-container{position:relative;z-index:1;overflow:initial}.icon_nav_tab .swiper-wrapper{height:44px;text-align:center;position:relative;z-index:50;zoom:1;display:-webkit-box;display:-moz-box;display:-ms-flexbox;display:-webkit-flex;display:flex}.icon_nav_tab .swiper-slide{position:relative;z-index:5;display:block;width:auto;line-height:44px;margin:auto;overflow:hidden;-webkit-flex-shrink:0;-ms-flex:0 0 auto;flex-shrink:0}.icon_nav_tab .swiper-slide a{display:block;position:relative;z-index:1;zoom:1;margin:0 15px;font-size:14px;text-align:center;height:44px;line-height:44px;color:#333}.icon_nav_tab .swiper-slide.active a{color:#FC3F78;font-weight:600}.icon_nav_tab .swiper-slide a:before{content:"";transition:all .4s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transition:all .4s cubic-bezier(.4,.68,.15,1) 0s;display:block;position:absolute;bottom:0;left:50%;width:0}.icon_nav_tab .swiper-slide.active a:before{bottom:0;left:0;width:100%;height:3px;border-radius:3px;overflow:hidden;background:#FC3F78}.icon_nav_tab .tab_def_list{height:43px;width:44px;position:absolute;right:-45px;top:0;z-index:55;background:#fff;border-bottom:solid 1px #efefef;border-left:solid 1px #f6f6f6;line-height:44px;color:#707070;box-shadow:-4px -1px 20px 0 rgba(0,0,0,.08);-webkit-box-shadow:-4px -1px 20px 0 rgba(0,0,0,.08);font-size:18px;font-style:normal;text-align:center;display:none}.icon_nav_tab .load,.icon_nav_tab_box .tab{color:#333;line-height:44px;text-align:center}.icon_nav_tab .tab_def_list:before{content:"\e600"}.icon_nav_tab .load{display:none;background:url(../images/rolling.gif?v=2018-09-29) center center no-repeat #fff;background-size:150px 150px;position:absolute;top:0;left:0;z-index:58;width:100%;height:100%}.icon_nav_tab.tav_load .load{display:block}.icon_nav_tab.tav_load .swiper-container{margin-right:0}.icon_nav_tab_box{position:fixed;z-index:500;left:0;top:0;width:100%;height:100%;background:#fff;opacity:0;transition:all .6s cubic-bezier(.4,.68,.15,1) .1s;-webkit-transition:all .6s cubic-bezier(.4,.68,.15,1) .1s;-webkit-transform:translateY(-500px) translateX(0);transform:translateY(-500px) translateX(0)}.icon_nav_tab_box .tab{height:44px;position:relative;z-index:5;border-bottom:solid 1px #EEE}.icon_nav_tab_box .tab a{position:absolute;right:0;top:0;color:#707070;width:44px;line-height:44px}.icon_nav_tab_box .tab a:before{content:"\e6ed"}.icon_nav_tab_box .ullit{overflow:hidden;overflow-y:auto;padding:15px 0}.icon_nav_tab_box .ullit li{margin-bottom:10px;width:33%;float:left;text-align:center;line-height:20px;color:#333;font-size:14px}.icon_nav_tab_box .ullit li a{display:block}.icon_nav_tab_box .ullit li img{display:block;width:80%;margin:auto}.icon_nav_tab_box .ullit li span{color:#333}.icon_nav_tab_box.active{-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);opacity:1}.icon_nav_tab_box .ullit .ov_h{height:15px}.cat_tab_list{background:#fff;border-bottom:solid 7px #f5f5f5}.cat_tab_list ul{padding:10px 0}.cat_tab_list li{width:25%;float:left;text-align:center;-webkit-transition:all .6s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transform:translateY(0) translateX(0);transform:translateY(0) translateX(0);opacity:1}.cat_tab_list li a{display:block;padding-top:10px}.cat_tab_list li img{display:block;width:60%;margin:auto}.cat_tab_list li span{color:#333;font-size:12px;display:block;line-height:30px}.cms_layer_msg span,.dtb_618 p{color:#fff;display:inline-block}.cat_tab_list.active ul li{transition:all .6s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transition:all .6s cubic-bezier(.4,.68,.15,1) 0s;-webkit-transform:translateY(-20px) translateX(0);transform:translateY(-20px) translateX(0);opacity:0}.cat_tab_list_load{background:url(../../images/load.gif?v=2018-09-29) center center no-repeat;background-size:50px 50px;position:fixed;z-index:101;width:100%;height:100%;text-align:center;line-height:100%;top:0;left:0}.row-s{clear:both}.row-s .col-1,.row-s .col-10,.row-s .col-11,.row-s .col-12,.row-s .col-2,.row-s .col-3,.row-s .col-4,.row-s .col-5,.row-s .col-6,.row-s .col-7,.row-s .col-8,.row-s .col-9,.row-s .col-sm-1,.row-s .col-sm-10,.row-s .col-sm-11,.row-s .col-sm-12,.row-s .col-sm-2,.row-s .col-sm-3,.row-s .col-sm-4,.row-s .col-sm-5,.row-s .col-sm-6,.row-s .col-sm-7,.row-s .col-sm-8,.row-s .col-sm-9{float:left}.row-s .col-1{width:8.33333333%}.row-s .col-2{width:16.66666667%}.row-s .col-3{width:25%}.row-s .col-4{width:33.33333333%}.row-s .col-5{width:41.66666667%}.row-s .col-6{width:50%}.row-s .col-7{width:58.33333333%}.row-s .col-8{width:66.66666667%}.row-s .col-9{width:75%}.row-s .col-10{width:83.33333333%}.row-s .col-11{width:91.66666667%}.row-s .col-12{width:100%}.row-s .col-sm-1{width:10%}.row-s .col-sm-2{width:20%}.row-s .col-sm-3{width:30%}.row-s .col-sm-4{width:40%}.row-s .col-sm-5{width:50%}.row-s .col-sm-6{width:60%}.row-s .col-sm-7{width:70%}.row-s .col-sm-8{width:80%}.row-s .col-sm-9{width:90%}.row-s .col-sm-10{width:100%}.ov_h{overflow:hidden;height:0;clear:both}.row-mar{margin:0 15px}.text-right{text-align:right}.text-left{text-align:left}.cms_layer_load,.cms_layer_msg,.dtb_618 p,.text-center{text-align:center}.cms_layer_msg{width:100%;height:100%;position:fixed;top:0;left:0;z-index:99999}.cms_layer_msg span{background:rgba(0,0,0,.7);line-height:40px;font-size:12px;height:40px;border-radius:5px;margin-top:-20px;padding:0 15px;position:relative}.cms_layer_load{background:url(../../images/load.gif?v=2018-09-29) center center no-repeat rgba(245,245,245,.05);background-size:50px 50px;position:fixed;z-index:999999;width:100%;height:100%;line-height:100%;top:0;left:0}.dtb_618,.icon_618{background-repeat:no-repeat}.icon_618{background-image:url(../images/corner_tab.png?v=20180605?v=2018-09-29);position:absolute;right:0;top:0;width:44%;height:20px;background-size:contain}.dtb_618{position:relative;background-image:url(../images/dtbar_618.jpg?v=2018-09-29);background-color:#ff27a2;width:100%;height:46px;background-size:auto 100%;line-height:46px;font-size:.8em}.dtb_618 p{line-height:46px;margin-left:40%}.dtb_618 p span{color:#FBEA2A}.dtb_618 .text{float:right;color:#fff;margin-right:3%}.goods-new{clear:both}.goods-new li .cent{background:#fff;margin:0 2.5px 5px 0}.goods-new li:nth-child(2n) .cent{margin:0 0 5px 2.5px}.goods-new li .cent a.img{display:block;overflow:hidden}.goods-new li .cent a.img img{width:100%;display:block}.goods-new li .cent .bt{height:30px;line-height:30px;font-size:14px;overflow:hidden;font-weight:400;margin:0;color:#333}.goods-new li .cent .num{font-size:12px;color:#888;padding:5px 0 10px}.goods-new li .cent .money{color:#FF2B22;white-space:nowrap;font-size:18px;position:relative;top:2px;line-height:22px;height:22px}.goods-new li .cent .money span{color:#FF2B22;font-size:12px}.goods-new li .cent .quan{overflow:hidden;width:60px;display:block;top:2px;float:right;position:relative}.goods-new li .cent .quan i{background:#fff;position:relative;z-index:1;font-style:normal;display:block;border-radius:3px;font-size:12px;text-align:center;padding:2px 0;border:1px solid #FC4D52;color:#FC4D52}.goods-new li .cent .quan i:after,.goods-new li .cent .quan i:before{position:absolute;left:-4px;top:50%;margin-top:-3px;background:#fff;display:block;width:5px;height:5px;content:"";border-radius:10px;border:1px solid #FC4D52}.goods-new li .cent .quan i:before{left:auto;right:-4px}.goods-new li .mar{margin:0 10px;padding-bottom:13px}@media only screen and (max-width:360px){.goods-new li .cent .money{font-size:14px}}.layout{max-width:750px;text-align:left;margin:auto;overflow:hidden}.ui_bot_tab~.layout{padding-bottom:44px;display:block}.ui_bot_tab{border-top:solid 1px #eee;position:fixed;zoom:1;z-index:110;left:0;bottom:0;width:100%;background:#fff}.ui_bot_tab .row-s>a{color:#666;text-align:center;font-size:12px;padding:3px 0 2px;position:relative;z-index:1;zoom:1;line-height:20px}.ui_bot_tab .row-s>a .iconfont{display:block;color:#666;font-size:24px}.ui_bot_tab .row-s>a .iconfont img{width:24px;height:24px;display:block;margin:auto}.ui_bot_tab .row-s>a em.num{position:absolute;zoom:1;left:45%;top:3px;z-index:10;font-style:normal;background:#FC3F78;color:#fff;overflow:hidden;font-size:11px;border-radius:20px;-moz-border-radius:20px;-webkit-border-radius:20px;-o-border-radius:20px;-ms-border-radius:20px;line-height:15px;text-align:center;margin-left:10px;max-width:2rem;padding:0 7px}.ui_bot_tab .row-s>a.active,.ui_bot_tab .row-s>a.active .iconfont{color:#FC3F78}.row-s:after,.row-s:before{content:"";overflow:hidden;height:0;clear:both;display:block}.row-s .col-10-1,.row-s .col-10-10,.row-s .col-10-11,.row-s .col-10-12,.row-s .col-10-2,.row-s .col-10-3,.row-s .col-10-4,.row-s .col-10-5,.row-s .col-10-6,.row-s .col-10-7,.row-s .col-10-8,.row-s .col-10-9,.row-s .col-12-1,.row-s .col-12-10,.row-s .col-12-11,.row-s .col-12-12,.row-s .col-12-2,.row-s .col-12-3,.row-s .col-12-4,.row-s .col-12-5,.row-s .col-12-6,.row-s .col-12-7,.row-s .col-12-8,.row-s .col-12-9{float:left}.row-s .col-12-1{width:8.33333333%}.row-s .col-12-2{width:16.66666667%}.row-s .col-12-3{width:25%}.row-s .col-12-4{width:33.33333333%}.row-s .col-12-5{width:41.66666667%}.row-s .col-12-6{width:50%}.row-s .col-12-7{width:58.33333333%}.row-s .col-12-8{width:66.66666667%}.row-s .col-12-9{width:75%}.row-s .col-12-10{width:83.33333333%}.row-s .col-12-11{width:91.66666667%}.row-s .col-12-12{width:100%}.row-s .col-10-1{width:10%}.row-s .col-10-2{width:20%}.row-s .col-10-3{width:30%}.row-s .col-10-4{width:40%}.row-s .col-10-5{width:50%}.row-s .col-10-6{width:60%}.row-s .col-10-7{width:70%}.row-s .col-10-8{width:80%}.row-s .col-10-9{width:90%}.row-s .col-10-10{width:100%}.col-mar{margin:0 1rem}
    </style>
    <link rel="Bookmark" href="touch-icon-iphone.png" />

    <!-- 皮肤 S-->
    <link href="http://cmsstatic.dataoke.com//web/css/cms_skin/orange.css?v=201809291636" rel="stylesheet">        <!-- 皮肤 E-->

    <!-- 视频 S -->
    <link href="http://cmsstatic.dataoke.com//web/css/wap-video.css?v=201809291636" rel="stylesheet">
    <!-- 视频 E -->

    <link href="http://cmsstatic.dataoke.com//web/css/wapcat.css?v=201809291636" rel="stylesheet"/>
    <script src="http://cmsstatic.dataoke.com//web/js/lazyload.js?v=201809291636" ></script>
    <!-- 统计 -->
    <script>
        var coutData =[{"page":"0","event_name":"index_search","page_event":"click","page_class":"#search button","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"app_download_hover","page_event":"mouseenter","page_class":".app_download","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"record_number","page_event":"click","page_class":".miitbeian","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"service_bottom","page_event":"click","page_class":".footer_service","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"service_top","page_event":"click","page_class":".header_service","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"logo","page_event":"click","page_class":"#header .header_logo","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"home_set","page_event":"click","page_class":".set_home","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"collect_set","page_event":"click","page_class":".add_favorite","is_data":"","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"index_banner ","page_event":"click","page_class":".swiper-slide a","is_data":"gid","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"index_left_cid","page_event":"click","page_class":"#banner .list li a","is_data":"catid","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"index_qlist_goods","page_event":"click","page_class":".live .goods-list li a","is_data":"gid","is_posting_events":"0","is_num":"0","is_param":""},{"page":"0","event_name":"index_search_fixed","page_event":"click","page_class":".floatNav .srcBtn","is_data":"","is_posting_events":"0","is_num":"0","is_param":""}];
    </script>
</head>
<body data-appid="489217" data-in="1">
<div class="main-title clearfix theme-bg-color-1">
    <a href="javascript:void(0)" class="main-back"></a>
    <div class="menu-detail">
        <span>连衣裙</span>
    </div>
    <a class="mui-action-menu main-more" href="javascript:void(0)" id="cat-action-menu"></a>
</div>
<nav id="detail-top-menu">
    <div class="arrow"></div>
    <div class="mask" id="menu-mask2"></div>
    <div class="detail-menu-content">
        <ul class="main-detail">
            <li>
                <a href="/index.php?r=index/wap"><i class="iconfontv2 icon-detail_home"></i>首页</a>
            </li>
            <li>
                <a href="/index.php?r=index/classify"><i class="iconfontv2 icon-detail_search"></i>搜索</a>
            </li>
            <li>
                <a href="/index.php?r=index/customService"><i class="iconfontv2 icon-detail_servicer"></i>客服</a>
            </li>
            <li>
                <a href="/index.php?r=index/feedback&amp;id=16246604"><i class="iconfontv2 icon-datail_feedback"></i>反馈</a>
            </li>
            <li>
                <a href="/index.php?r=user/index"><i class="iconfontv2 icon-gerenzhongxin"></i>我的</a>
            </li>
        </ul>
    </div>
</nav>
<!-- 主界面具体展示内容 -->
<div class="order-nav" >
    <ul>
        <li class="theme-border-bottom-color-1 cur">
            <span><a data-sort="t" class="theme-color-1" href="/index.php?r=class/sub&px=t&cid=8612&u=489217">人气</a></span>
        </li>
        <li class="" >
            <span><a data-sort="latest"  href="/index.php?r=class/sub&px=latest&cid=8612&u=489217">最新</a></span>
        </li>
        <li class=""  >
            <span><a data-sort="sell"  href="/index.php?r=class/sub&px=sell&cid=8612&u=489217">销量</a></span>
        </li>
        <li class="">
            <span><a data-sort="price"  href="/index.php?r=class/sub&px=price&cid=8612&u=489217">价格
                <span class="price-ico "></span>
                <!--ico-up 升序   ico-down降序-->
                </a></span>
        </li>
    </ul>
</div>

<style>
    .scrollable{
        margin-top:50px;
        bottom: 0;
        left: 0;
        right: 0;
        overflow-y: scroll;
        -webkit-overflow-scrolling: touch;
        -webkit-box-flex: 1;
        background-color: #faf5f6;
    }
</style>
<div class="scrollable">
    <div class="goods-list" data-page="2" style="padding-top: 50px;">
        <div class="goods-item">
            <a data-gid="16600612" href="/index.php?r=p/d&id=16600612&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>40</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/bao/uploaded/i4/2170061322/TB210yFx5CYBuNkHFCcXXcHtVXa_!!2170061322.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16600612" href="/index.php?r=p/d&id=16600612&u=489217" class="title">
                <div class="text">赫本风连衣裙泡泡袖蝴蝶结A字蓬蓬小黑裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>89</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">482</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16608091" href="/index.php?r=p/d&id=16608091&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>200</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i1/2878099809/O1CN012MKZSuDEkAu9Hrq_!!2878099809.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16608091" href="/index.php?r=p/d&id=16608091&u=489217" class="title">
                <div class="text">秋装长袖蕾丝连衣裙两件套毛衣背心套装</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>148</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">177</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16605335" href="/index.php?r=p/d&id=16605335&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i4/2971058657/TB228SLxcj_B1NjSZFHXXaDWpXa_!!2971058657-0-item_pic.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16605335" href="/index.php?r=p/d&id=16605335&u=489217" class="title">
                <div class="text">秋装新款女装2018中长款刺绣毛衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>309</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">45</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16605345" href="/index.php?r=p/d&id=16605345&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i1/2971058657/TB2R_G5xfImBKNjSZFlXXc43FXa_!!2971058657-0-item_pic.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16605345" href="/index.php?r=p/d&id=16605345&u=489217" class="title">
                <div class="text">中长款针织连衣裙时尚绣花A字裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>359</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">33</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16608039" href="/index.php?r=p/d&id=16608039&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>10</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i2/3163167858/TB2IV1qc6fguuRjSspkXXXchpXa_!!3163167858.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16608039" href="/index.php?r=p/d&id=16608039&u=489217" class="title">
                <div class="text">秋装2018新款韩版显瘦女连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>79</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">608</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16603759" href="/index.php?r=p/d&id=16603759&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i4/1663047112/TB2zqOHGQKWBuNjy1zjXXcOypXa_!!1663047112.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16603759" href="/index.php?r=p/d&id=16603759&u=489217" class="title">
                <div class="text">长款长袖牛仔连衣裙夏欧货裙春秋</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>128</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">845</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16603937" href="/index.php?r=p/d&id=16603937&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>20</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i3/727249233/TB2Pt_0bXYqK1RjSZLeXXbXppXa_!!727249233-0-item_pic.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16603937" href="/index.php?r=p/d&id=16603937&u=489217" class="title">
                <div class="text">【苏醒的乐园】收腰鱼尾连衣裙卫衣打底裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>149</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">1411</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16602350" href="/index.php?r=p/d&id=16602350&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://gd2.alicdn.com/imgextra/i2/1588403792/O1CN011dsmL3r0BIy8kXG_!!1588403792.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16602350" href="/index.php?r=p/d&id=16602350&u=489217" class="title">
                <div class="text">2018秋冬款复古修身V领高腰拼接针织裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>69</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">232</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16597003" href="/index.php?r=p/d&id=16597003&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i3/2995791564/O1CN011NQLtgYQXvxfqIL_!!2995791564.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16597003" href="/index.php?r=p/d&id=16597003&u=489217" class="title">
                <div class="text">中长款毛衣女打底针织连衣裙秋冬季包臀</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>98</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">28</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16596942" href="/index.php?r=p/d&id=16596942&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i1/2995791564/O1CN011NQLtjZElEKNPuX_!!2995791564.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16596942" href="/index.php?r=p/d&id=16596942&u=489217" class="title">
                <div class="text">韩版中长款长袖收腰修身V领针织连衣裙子</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>88</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">31</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16599140" href="/index.php?r=p/d&id=16599140&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>40</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i4/3027490010/O1CN011BwcQIL0sIRvolj_!!0-item_pic.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16599140" href="/index.php?r=p/d&id=16599140&u=489217" class="title">
                <div class="text">优雅赫本风假两件丝绒连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>59.9</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">541</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16601416" href="/index.php?r=p/d&id=16601416&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>60</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i2/1707642904/TB2mycBbxtnkeRjSZSgXXXAuXXa_!!1707642904.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16601416" href="/index.php?r=p/d&id=16601416&u=489217" class="title">
                <div class="text">【欧贝萱】秋装碎花中长款针织连衣裙女</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>69</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">887</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16600462" href="/index.php?r=p/d&id=16600462&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>70</b></span>                                                            <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i3/3065373623/TB2ECyNFuGSBuNjSspbXXciipXa_!!3065373623.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16600462" href="/index.php?r=p/d&id=16600462&u=489217" class="title">
                <div class="text">2018秋装新款长袖气质V领连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>89</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">173</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16596933" href="/index.php?r=p/d&id=16596933&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i2/2995791564/O1CN011NQLtcIGFjJiGvC_!!2995791564.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16596933" href="/index.php?r=p/d&id=16596933&u=489217" class="title">
                <div class="text">韩版中长款长袖收腰修身打底针织连衣裙子</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>88</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">30</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16603953" href="/index.php?r=p/d&id=16603953&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>50</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i3/727249233/TB29J8dx5OYBuNjSsD4XXbSkFXa_!!727249233-0-item_pic.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16603953" href="/index.php?r=p/d&id=16603953&u=489217" class="title">
                <div class="text">【苏醒的乐园】早秋长袖连衣裙气质衬衫裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>209</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">1107</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16597014" href="/index.php?r=p/d&id=16597014&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i4/2995791564/O1CN011NQLtZ5Glj73L8M_!!2995791564.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16597014" href="/index.php?r=p/d&id=16597014&u=489217" class="title">
                <div class="text">2019秋冬款慵懒风针织高领毛衣连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>98</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">69</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16602294" href="/index.php?r=p/d&id=16602294&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>100</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i4/3257404801/TB2mQ_rgLuSBuNkHFqDXXXfhVXa_!!3257404801.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16602294" href="/index.php?r=p/d&id=16602294&u=489217" class="title">
                <div class="text">温柔裙子超仙少女装中长款白色蕾丝连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>98</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">40</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16605789" href="/index.php?r=p/d&id=16605789&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>50</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://gd1.alicdn.com/imgextra/i1/159168102/TB2HC_oJN9YBuNjy0FfXXXIsVXa_!!159168102.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16605789" href="/index.php?r=p/d&id=16605789&u=489217" class="title">
                <div class="text">2018春秋新款气质修身格子长袖连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>148</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">455</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16599156" href="/index.php?r=p/d&id=16599156&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>50</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i3/3058007492/TB24jSyIkyWBuNjy0FpXXassXXa_!!3058007492-0-item_pic.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16599156" href="/index.php?r=p/d&id=16599156&u=489217" class="title">
                <div class="text">2018新款韩版收腰针织连衣裙</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>89</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">188</span></div>                </div>
        </div>
        <div class="goods-item">
            <a data-gid="16597066" href="/index.php?r=p/d&id=16597066&u=489217"  class="img">
                <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>30</b></span>                    <span class="today-wrapper"><b>NEW</b></span>                                        <img class="lazy" src="http://cmsstatic.dataoke.com//web/images/rolling.gif?v=201809291636"  data-original="https://img.alicdn.com/imgextra/i2/2995791564/O1CN011NQLtYVG9Q0r04m_!!2995791564.jpg_310x310.jpg" alt="">
            </a>
            <a data-gid="16597066" href="/index.php?r=p/d&id=16597066&u=489217" class="title">
                <div class="text">秋冬高领加厚打底毛衣女包臀针织连衣裙修</div>
            </a>
            <div class="price-wrapper">
                <span class="price">￥<span>108</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">34</span></div>                </div>
        </div>
    </div>
    <div class="pullup-goods">
        <div class="label">商品加载中...</div>
    </div>
</div>
<script src="http://cmsstatic.dataoke.com//web/js/swiper-3.4.2.jquery.min.js?v=201809291636"></script>
<script language="javascript">
    // $(".main-title .main-back").attr("href","/index.php?r=index/wap#8612");
    if(window.history.state){
        $('.goods-list').html(window.history.state.list);
        var page = window.history.state.page;
    }else{
        var page = 2;
    }
    var isFinish = false;
    var isLoading = false;
    var $pullUp = null;
    var needLoadMore = false;

    var maxScrollY = 0;
    var windowHeight = 0;
    var cid = '8612';
    var px = 't';
    var cac_id ='cXVlcnlUaGVuRmV0Y2g7NDs0NjAyMDM1OTg1OkJWRVVlVFRLUzF1aGVYUW52RkhvQkE7NDYwMTY1NjA3MDpKTmxzUWI5SVJwcVVqMkV6YzRXd2hBOzQ2MDI1NDI0NDc6M3BudXQ4azhUdHEtVlZIcU9qZUwzdzs0NjAyNTU0OTYxOjR0b09PZUxJUlNHaTcyNmducFpPekE7MDs='
    $(document).ready(function () {
        maxScrollY = $(document).height();
        windowHeight = $(window).height();
        $(window).on('resize', function () {
            windowHeight = $(window).height();
        });

        $(document).scroll(function (e) {
            if (isFinish || isLoading) {
                return;
            }
            $("img.lazy").lazyload({ threshold :180});

            if ($(document).scrollTop() >= $(document).height() - $(window).height() - 150) {
                var $wrapper = $(this);
                if (!$pullUp) {
                    $pullUp = $wrapper.find('.pullup-goods');
                }
                var data = null;
                getData($wrapper, data, 1);
            }
        });

        $(".order-nav a").on("click",function(){
            px = $(this).data("sort") == 'price' ? 'price_h' : $(this).data("sort") == 'price_h' ? 'price' : $(this).data("sort");
            showActive(this,px);
            localStorage.setItem("CLASS_SUB_SORT",px);
            return false;
        });

        function showActive(_t,px){
            $(".order-nav a").removeClass('theme-color-1').parents("li").removeClass('cur').removeClass('theme-border-bottom-color-1').find("a span").removeClass('ico-down').removeClass('ico-up');
            $(_t).addClass('theme-color-1').parents("li").addClass('cur').addClass('theme-border-bottom-color-1');
            $(_t).data("sort",px);
            if(px == 'price'){
                $(_t).find("span").addClass('ico-up').removeClass('ico-down');
            }else if(px == 'price_h'){
                $(_t).find("span").addClass('ico-down').removeClass('ico-up');
            }
            page = 1;
            cac_id = "";
            isFinish = false;
            isLoading = false;
            $(".scrollable .pullup-goods .label").html('商品加载中...');
            $(".scrollable .goods-list").html("");
            getData($(".scrollable"), null, 1);
        }

        $(".main-title .main-back").click(function(){
            localStorage.removeItem("CLASS_SUB_SORT");
        });

        // 回显数据
        var CLASS_SUB_SORT = localStorage.getItem("CLASS_SUB_SORT");
        if(CLASS_SUB_SORT){
            px = CLASS_SUB_SORT;
            showActive(".order-nav a[data-sort='"+px+"']",px);
        }
        function getData($wrapper, data, direction) {

            if (isFinish) {
                return;
            }
            isLoading = true;
            if (!$pullUp) {
                $pullUp = $wrapper.find('.pullup-goods');
            }
            var labelTag = $($pullUp).find('.label');
            var tPaht="/index.php";
            $.ajax(tPaht,{
                data: {r:'class/ajaxsub',page: page, cid: cid,px:px,cac_id:cac_id},
                dataType: 'json',
                type: 'get',
                error: function (xhr, type, errorThrown) {
                    getData($wrapper, data, direction);
                },
                success: function (result, status, xhr) {
                    needLoadMore = false;
                    if (result.status == 0) {
                        if(result.data.pageStatus === false || result.data.content==""){
                            isLoading = false;
                            $('.pullup-goods .label').html(result.data.content=="" ? "小编正在筛选商品！" : '没有更多商品啦');
                            isFinish = true;
                        }
                        $('.goods-list').append(result.data.content);
                        //myScroll.refresh();
                        $("img.lazy").lazyload({container:$('.scrollable ')});
                        aClick();
                        maxScrollY = $(document).height();
                        isLoading = false;
                        page++;
                        $('.goods-list').attr('data-page',page);
                        //$(labelTag).html('上拉加载更多商品');
                        cac_id = result.data.cac_id;
                    } else {

                        maxScrollY = $(document).height();
                        isLoading = false;
                        $(labelTag).html('没有更多商品啦');
                        isFinish = true;
                    }
                }
            });
        }

    });
    $(window).load(function(){
        /*触发mta 打开详细也统计*/
        MtaH5.clickStat("showpage",{
            uid:$cmsLayer.getMtaCookie(),
            time:((new Date()).getHours()<10 ? "0" + (new Date()).getHours() : (new Date()).getHours())+":"+((new Date()).getMinutes()<10 ? "0" + (new Date()).getMinutes() : (new Date()).getMinutes()),
            name:$(".main-title .menu-cat span, .main-title .menu-detail span").html(),
            'siteid':standId,
            'domainid':window.location.hostname.replace("www.","")
        });
    })
    $(function () {
        $("img.lazy").lazyload();
    });
</script>
<div class="toTop">&#xe6a4;</div>
<div style="display: none;">
</div>
<script src="http://cmsstatic.dataoke.com//web/js/cms_common.js?v=201809291636"></script>
<script>
    var standId = 489217;
    var MtaH5={
        clickShare:function(){},
        clickStat:function(){},
        hack:function(){},
        pgv:function(){}
    };
    var _mtac = {"performanceMonitor":1,"senseQuery":1};
    (function() {
        var mta = document.createElement("script");
        mta.src = "//pingjs.qq.com/h5/stats.js?v2.0.4";
        mta.setAttribute("name", "MTAH5");
        /*mta.setAttribute("sid", "500628419");
        mta.setAttribute("cid", "500628420");*/
        mta.setAttribute("sid", "500625431");
        mta.setAttribute("cid", "500625432");
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(mta, s);
    })();
</script>
<script src="http://cmsstatic.dataoke.com//wap_new/lib/md5.js?v=201809291636"></script>    </body>
</html>

