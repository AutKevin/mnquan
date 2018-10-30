<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/page/zhuanlian.jsp" %>
<!DOCTYPE html>
<html style="overflow: hidden;">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta content="telephone=no" name="format-detection">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
    <link rel="apple-touch-icon" href="/touch-icon-iphone.png">
    <link href="/favicon.ico" rel="shortcut icon">
    <link href="/favicon.ico" rel="icon">
    <link href="/touch-icon-iphone.png" rel="Bookmark">

    <title>全部分类_搜券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝">
    <meta name="description" content="9.9包邮，白菜价，天天特价">
    <script src="../page/js/jquery.js" type="text/javascript"></script>
    <link href="../page/js/swiper-4.4.1.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../page/js/wap_common.css">
    <script src="../page/js/swiper-4.4.1.min.js"></script>
</head>
<body data-appid="489217" data-in="1" style="">
<div class="main-title clearfix theme-bg-color-1" style="height: 44px">
    <a href="javascript:void(0);" onclick="window.location.href=document.referrer;" class="main-back" style="margin-left: 0">
    </a>
    <div class="mysrc" style="margin-left: 30px;" onclick="javascript:window.location.href='/app/query/query.do'">
        <form action="/app/query/query.do" method="get">
            <button class="search_submit background" style="left: 0;"></button>
            <div class="search_area">输入您需要的商品名称</div>
        </form>
    </div>
</div>
<!-- 主界面具体展示内容 -->
<a id="ui_class" href="javascript:;" ui-class="" data-bottom="50px" data-url="/index.php" class="active"></a>
<!--icon-detail_home icon-detail_servicer-->
<Style>
    .ui_bot_tab .row-s .col-10-2{
        width: 20%;
    }
</Style>
<div class="ui_bot_tab" data-mta_name="首页-底部导航" ui-mta-modular="">
    <div class="row-s">
        <a data-mold="1" data-el="1" href="/app" class="col-10-2">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i1/2053469401/TB2GCzpnVkoBKNjSZFkXXb4tFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);">首页</span>
        </a>

        <a data-mold="1" data-el="2" href="javascript:void(0);" class="col-10-2">
            <em class="num" style="background-image: -webkit-gradient(linear, left 20, right 0, from(#DC143C), to(	#FF0000));-webkit-background-clip: text;-webkit-text-fill-color: transparent;">新</em>
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i4/2053469401/TB23GLTn77mBKNjSZFyXXbydFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);">准备中</span>
        </a>

        <a data-mold="1" data-el="4" id="zhuanlian" href="javascript:void(0);" class="col-10-2">
            <i class="iconfont"><img src="../../page/img/zhuanlian.png"></i>
            <span style="color: rgb(102, 102, 102);">转链</span>
        </a>

        <a data-mold="1" data-el="3" href="/app/classify" class="col-10-2">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i1/2053469401/TB2y4_qnVkoBKNjSZFkXXb4tFXa-2053469401.png"></i>
            <span style="color: rgb(253, 87, 92);">分类</span>
        </a>

        <%--<a data-mold="1" data-el="4" data-addr="/index.php?r=user/list" href="/index.php?r=user/list" class="col-10-2 ">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i1/2053469401/TB26bEfnQZmBKNjSZPiXXXFNVXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);">收藏</span>
        </a>--%>

        <a data-mold="1" data-el="5" href="/app/user/centre.do" class="col-10-2">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i3/2053469401/TB2WXrhqFkoBKNjSZFkXXb4tFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);">我的</span>
        </a>
    </div>
</div>
<div style="display: none;">
</div>
<div class="show-top-menu-load" style="display: none;"></div>
    <nav class="show-top-menu  active" id="cmsClass" style="z-index:100">
        <div class="menu-content myco1  " style="padding:0;">
            <div class="menu-nav" id="menu-nav" style="padding:0; -webkit-overflow-scrolling: touch; -webkit-box-flex: 1; position: fixed;">
                <div class="ov_h" style="height:44px;"></div>
                <a  class="active" id="1" onclick="get_cat_list(1);" name="45" data-id="1">女装</a>
                <a  class="" id="2" onclick="get_cat_list(2);" name="90" data-id="1">男装</a>
                <a  class="" id="3" onclick="get_cat_list(3);" name="135" data-id="1">鞋品</a>
                <a  class="" id="4" onclick="get_cat_list(4);" name="180" data-id="1">内衣</a>
                <a  class="" id="5" onclick="get_cat_list(5);" name="225" data-id="1">配饰</a>
                <a  class="" id="6" onclick="get_cat_list(6);" name="270" data-id="1">美妆</a>
                <a  class="" id="7" onclick="get_cat_list(7);" name="315" data-id="1">母婴</a>
                <a  class="" id="8" onclick="get_cat_list(8);" name="360" data-id="1">美食</a>
                <a  class="" id="9" onclick="get_cat_list(9);" name="405" data-id="1">箱包</a>
                <a  class="" id="10" onclick="get_cat_list(10);" name="450" data-id="1">居家日用</a>
                <a  class="" id="11" onclick="get_cat_list(11);" name="505" data-id="1">数码家电</a>
                <a  class="" id="12" onclick="get_cat_list(12);" name="550" data-id="1">文娱车品</a>
                <a  class="" id="13" onclick="get_cat_list(13);" name="605" data-id="1">家装家纺</a>
                <a  class="" id="14" onclick="get_cat_list(14);" name="650" data-id="1">户外运动</a>
                <p  class="bg" style="top: 45px;"></p>
                <div class="ov_h" style="height:50px;"></div>
            </div>
            <div class="cent" style="height:100%; -webkit-overflow-scrolling: touch; -webkit-box-flex: 1; ">
                <div class="ov_h" style="height:44px;"></div>
                <div class="img hide"><a><img src=""></a></div>
                <ul id="classifyUI" class="main-cat2">
                    <%--<li style="" class="cat-item ">
                        <a href="/index.php?r=class/sub&amp;cid=9690" data-cid="79119">
                            <img class="lazy" src="https://img.alicdn.com/imgextra/i3/2053469401/TB26D9ytAOWBuNjSsppXXXPgpXa-2053469401.png_310x310.jpg" style="background: rgb(245, 245, 245); display: block;">基础护肤</a>
                    </li>--%>
                </ul>
                <div class="ov_h" style="height:50px;"></div>
                <span class="up-menu theme-color-1 theme-border-color-1">收起分类</span>
            </div>
        </div>
    </nav>
</body>
</body>
<script>
    $("#zhuanlian").click(function () {
        $(".t-zhuanlian").css("display","inline");
        $(".t-zhuanlian-body").val("");
    });
    $(".t-zhuanlian-header").click(function () {
        $(".t-zhuanlian").css("display","none");
        $(".t-zhuanlian-body").val("");
    });
    $(".t-zhuanlian-modelButto").click(function () {
        var zhuanlian = $(".t-zhuanlian-body").val();
        if(null == zhuanlian){
            alert("数据不能为空")
        }
        $.ajax({
            url:""+"/app/query/zhuanlian.do",
            async:false,
            data: {'zhuanlian':zhuanlian},
            dataType:'json',
            type:"post",
            success:function(data){
                if("1" == data){
                    alert("查询失败")
                }else{
                    window.location.href = domain+"/app/detail/skipProductDetail.do?numIid="+data;
                }
            }
        });
    });
</script>
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
    $(function(){
        //左侧类目滑块控制
        $("#menu-nav a").click(function(){
            $("#menu-nav a").attr("class","");
            $(this).attr("class","active");
            var top_num = $(this).attr("name");
            $("#menu-nav p").css("top", top_num+"px");
        });
        get_cat_list(1);
    })

    //页面加载时默认获取
    //获取类目元素
    function get_cat_list(catId){
        $.ajax({
            url:""+"/app/classify/getCatList.do",
            async:false,
            data: {'catId':catId},
            dataType:'json',
            type:"post",
            success:function(data){
                console.log(data);
                var arrLen = data.length;
                if(arrLen > 0){
                    var classifyListHtml = '';
                    $.each(data,function(index,item){
                        classifyListHtml+='<li style="" class="cat-item ">' +
                            '<a href='+item.skipUrl+' data-cid="79119">' +
                            '<img class="lazy" src='+item.categoryPictureUrl+' style="background: rgb(245, 245, 245); display: block;">'+item.categoryName+'</a></li>';
                    });
                    $("#classifyUI").html(classifyListHtml);
                }
            }
        });
    }
</script>
</html>