<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/page/commons.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta content="telephone=no" name="format-detection"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <title>搜索分类_搜券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <link href="../../page/js/jquery.min.js" rel="stylesheet">
    <link href="../../page/js/wap_common.css" rel="stylesheet">
    <link href="../../page/js/wap_search.css" rel="stylesheet"/>
</head>
<style>
    .main-title .search {
        background-color: #fff;
        border-radius: 15px;
        margin-left: 12%;
        width: 65%;
    }
    .search-pop{
        display: none;
    }

    .src-content {
        margin: 20px 0 30px;
    }
    .toTop {
        position: fixed;
        right: 30px;
        bottom: 65px;
        font-family: iconfont;
        display: none;
        font-size: 37px;
        width: 50px;
        height: 50px;
        background-color: #fff;
        border: 1px solid #CCCCCC;
        border-radius: 50px;
        text-align: center;
        z-index: 11;
        line-height: 50px;
        color: #8c8c8c;
    }

    .main-src .src-item a {
        font-size: 13px;
        color: #333;
    }
    .src-item span{
        position: absolute;font-size: 12px;background-color: #FE4A65;right: -22px;
        top:-10px;color: #fff;border-radius: 12px;padding: 0 5px;line-height: 16px;
    }

    .search-cat .menu-content .main-cat li a {
        display: block;
        color: #333;
        font-size: 14px;
    }
    .search-land{
        display: none;
        position: fixed;width: 100%;height: 100%;background-color: #fff;z-index: 9999;top: 90px;overflow: hidden;
    }
    .search-land li{
        width: 90%;  border-bottom: 1px solid #f7f7f7;font-size: 13px;padding:9px 0;margin: 0 auto;
    }
    .search-land li a{
        color: #232326;width: 100%;
        display: inline-block;
    }
    .search .src-close-btn{
        display: none;
        position: absolute;right:0px;top: 0;
        background-image: url("http://cmsstatic.dataoke.com//web/images/cms-img.png?t=111");
        background-position: -107px 7px;
        background-repeat: no-repeat;
        background-size: 287px 800px;
        width: 28px;
        height: 28px;
        z-index: 9999;
    }

</style>
<body  data-appid="489217" data-in="1">
<div class="search-pop" style="display:block;">

    <div class="main-title clearfix theme-bg-color-1">
        <input type="hidden" name="wsw-status" value="1">
        <div class="search-tab">
            <%--<a href="/index.php?r=index/classify&s_type=0" data-stype="0" class='my-sub-src cur '>搜券</a>--%>
            <a href="javascript:void(0);" data-stype="1" class='my-sub-src '>搜全网</a>
        </div>

        <a href="/app" class="close-src"></a>
        <form action="/app/query/super_query.do" method="GET" id="my-search" >
            <div class="search  fl" style="background-color: #fff;border-radius: 20px;width: 70%">
                <input type="text"  autocomplete="off"
                       placeholder="请输入商品名称" value=""
                       name="title" id="search_area"
                       class="old-search search_area" />

                <span class="src-close-btn"></span>

            </div>

            <button class="wap-srcBtn search_submit search-in background" type="submit" >搜 索</button>

        </form>
    </div>
    <div class="search-default" style="font-size: 12px">
        <img src="http://cmsstatic.dataoke.com//web/images/search-default.png?v=201809291636" alt="">
        <dt style="width: 80%">搜索方法：</dt>
        <dt style="width: 80%; color: #999;">1、打开手机淘宝/天猫，长按拷贝商品标题 </dt>
        <dt style="width: 80%; color: #999;">2、将商品标题粘贴到搜索框中进行搜索</dt>

        <dd style="margin-top: 120px;text-align:center;">"搜全网"功能中的商品信息均来自于互联网</dd>
        <dd style="text-align:center;margin-bottom: 80px">商品准确信息请与商品所属店铺经营者沟通确认</dd>

    </div>

    <script>
        document.addEventListener("plusready", function() {
            // 注册返回按键事件
            plus.key.addEventListener('backbutton', function() {
                // 事件处理
                window.history.back();
            }, false);
        });
    </script>

    <script>
        $(".main-title .search-tab a").on("click",function(){
            $(".main-title .search-tab a").removeClass('cur');
            $(this).addClass('cur');
            $("input[name='s_type']").val($(this).data("stype"));
            var url = $(this).attr("href")+"&kws="+$("#my-search input[name='kw']").val();
            window.location.href=url;
            return false;
        });
        var kw_url = "/index.php?r=l&kw=%E7%A7%8B%E8%A3%85";
        $('#my-search').on('submit',function(){

            if($(this).find("input[name='kw']").val()=="" && kw_url != ""){
                window.location.href=kw_url;
                return false;
            }
            var value = $(this).find("input[name='kw']").val() ;
            /*触发mta 打开详细也统计*/
            MtaH5.clickStat("doSearch",{
                uid:$cmsLayer.getMtaCookie(),
                key: value == "" ? $(this).find("input[name='kw']").attr("placeholder") : value
            })
        });

    </script>

    <script>
        if($('.my-sub-src ').length>1){

        }else{
            $('#my-search .search').css('width','70%');
            $('.my-sub-src').removeClass('cur');
            $('.my-sub-src').css('opacity','1');
        }
    </script>
</div>
<style>
    .search .src-close-btn{
        right: 0!important;
    }
</style>
<!--搜索弹窗-->
</body>
</html>

