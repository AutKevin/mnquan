<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/page/commons.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta content="telephone=no" name="format-detection">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
    <title>搜券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝">
    <meta name="description" content="9.9包邮，白菜价，天天特价">
    <link rel="stylesheet" href="../../page/js/bootstrap.min.css">
    <script src="../../page/js/jquery.js" type="text/javascript"></script>
    <script src="../../page/js/bootstrap.min.js"></script>
    <script src="../../page/js/swiper-4.4.1.min.js" type="text/javascript"></script>
    <link href="../../page/js/wap_common.css" rel="stylesheet">
    <link href="../../page/js/wapcat.css" rel="stylesheet"/>
</head>
<body data-appid="489217" data-in="1" style="">
<div class="main-title clearfix theme-bg-color-1">
    <a href="javascript:void(0);" onclick="window.location.href=document.referrer;" class="main-back"></a>
    <div class="menu-detail">
        <span>${catName}</span>
    </div>
    <a class="mui-action-menu main-more" href="javascript:void(0)" id="cat-action-menu"></a>
</div>
<div class="progress" style="position: fixed;z-index: 9999;top: 43px;">
    <div id="my_progress" class="progress-bar progress-bar-success" role="progressbar"
         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
         style="width: 0%;position: fixed;z-index: 9999;height: 3px;">
    </div>
</div>
<nav id="detail-top-menu">
    <div class="arrow"></div>
    <div class="mask" id="menu-mask2"></div>
    <div class="detail-menu-content">
        <ul class="main-detail">
            <li>
                <a href="/app"><i class="iconfontv2 icon-detail_home"></i>首页</a>
            </li>
            <li>
                <a href="/app/query/query.do"><i class="iconfontv2 icon-detail_search"></i>搜索</a>
            </li>
            <li>
                <a href="/app/user/centre.do"><i class="iconfontv2 icon-gerenzhongxin"></i>我的</a>
            </li>
            <li>
                <a href="/app/user/logout.do"><i class="iconfontv2 icon-datail_feedback"></i>退出</a>
            </li>
        </ul>
    </div>
</nav>
<!-- 主界面具体展示内容 -->
<div class="icon_nav_tab" ui-nav-swiper="" data-active="[6]" data-callback="getGoodsListItem" data-ready="getGoodsListready" data-url="/index.php">
    <div class="swiper-container  swiper-container-horizontal swiper-container-android">
        <div class="swiper-wrapper">
            <input id="inputCatId" type="hidden" value="${catId}">
            <div id="catID_1" class="swiper-slide"><a onclick="myProgress(1,1);" href="javascript:void(0);" data-cid="1">女装</a></div>
            <div id="catID_2" class="swiper-slide"><a onclick="myProgress(2,1);" href="javascript:void(0);" data-cid="6">男装</a></div>
            <div id="catID_3" class="swiper-slide"><a onclick="myProgress(3,1);" href="javascript:void(0);" data-cid="3">鞋品</a></div>
            <div id="catID_4" class="swiper-slide"><a onclick="myProgress(4,1);" href="javascript:void(0);" data-cid="4">内衣</a></div>
            <div id="catID_5" class="swiper-slide"><a onclick="myProgress(5,1);" href="javascript:void(0);" data-cid="9">配饰</a></div>
            <div id="catID_6" class="swiper-slide"><a onclick="myProgress(6,1);" href="javascript:void(0);" data-cid="5">美妆</a></div>
            <div id="catID_7" class="swiper-slide"><a onclick="myProgress(7,1);" href="javascript:void(0);" data-cid="8">母婴</a></div>
            <div id="catID_8" class="swiper-slide"><a onclick="myProgress(8,1);" href="javascript:void(0);" data-cid="2">美食</a></div>
            <div id="catID_9" class="swiper-slide"><a onclick="myProgress(9,1);" href="javascript:void(0);" data-cid="11">箱包</a></div>
            <div id="catID_10" class="swiper-slide"><a onclick="myProgress(10,1);" href="javascript:void(0);" data-cid="10">居家日用</a></div>
            <div id="catID_11" class="swiper-slide"><a onclick="myProgress(11,1);" href="javascript:void(0);" data-cid="7">数码家电</a></div>
            <div id="catID_12" class="swiper-slide"><a onclick="myProgress(12,1);" href="javascript:void(0);" data-cid="12">文娱车品</a></div>
            <div id="catID_13" class="swiper-slide"><a onclick="myProgress(13,1);" href="javascript:void(0);" data-cid="14">家装家纺</a></div>
            <div id="catID_14" class="swiper-slide"><a onclick="myProgress(14,1);" href="javascript:void(0);" data-cid="13">户外运动</a></div>
        </div>
        <a href="javascript:;" class="tab_def_list"></a>
        <div class="load"></div>
    </div>
</div>
<div class="icon_nav_tab_bg" style="height: 88px;"></div>

<div class="cat_tab_list">
    <ul>
        <c:forEach items="${catItemDos}" var="item" varStatus="tbkCoupon">
            <li style="" class="cat-item ">
                <a onclick="myProgress('${item.skipUrl}','2')" href="javascript:void(0);">
                    <img class="lazy" src="${item.categoryPictureUrl}" style="background: rgb(245, 245, 245); display: block;"><span>${item.categoryName}</span>
                </a>
            </li>
        </c:forEach>
        <div class="ov_h"></div>
    </ul>
</div>
<div class="cat_tab_list_load" style="display: none;"></div>
<div class="order-nav" style="position: relative; top: 0px; margin-top: 0px;">
    <ul>
        <li class="">
            <span><a data-sort="shop_dsr" class="" href="javascript:void(0);" key="desc">人气</a></span>
        </li>
        <li class="theme-border-bottom-color-1 cur">
            <span><a data-sort="latest" href="javascript:void(0);" key="desc">最新</a></span>
        </li>
        <li class="">
            <span><a data-sort="volume" href="javascript:void(0);" key="desc">销量</a></span>
        </li>
        <li class="">
            <span><a data-sort="zk_final_price" href="javascript:void(0);" key="desc">价格
                <span id="price-ico" class="price-ico-down"></span>
                <!--                    ico-up 升序   ico-down降序-->
                </a></span>
        </li>
    </ul>
</div>

<div class="order-nav-bg ov_h " style="height: 0"></div>

<style>
    .scrollable{
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
    <div class="goods-list" data-page="2" style="padding-top: 0;">
        <div id="classify_product_div" class="lazy1">
            <%--<div class="goods-item">
                <a data-gid="16537009" href="/index.php?r=p/d&amp;id=16537009&amp;u=489217" class="img">
                    <span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>10</b></span>            <span class="today-wrapper"><b>NEW</b></span>                        <img class="lazy" src="https://img.alicdn.com/bao/uploaded/TB15uJ4hcjI8KJjSsppwu0byVXa.png_310x310.jpg" data-original="https://img.alicdn.com/bao/uploaded/TB15uJ4hcjI8KJjSsppwu0byVXa.png_310x310.jpg" alt="" style="background: rgb(245, 245, 245); display: inline;">
                </a>
                <a data-gid="16537009" href="/index.php?r=p/d&amp;id=16537009&amp;u=489217" class="title">
                    <div class="text">【千选】精准体重秤电子称</div>
                </a>
                <div class="price-wrapper">
                    <span class="price">￥<span>19.8</span></span><span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span><span class="sold-num">296932</span></div>        </div>
            </div>--%>
        </div>
    </div>
    <div class="pullup-goods">
        <a id="label" style="text-decoration: none;">点击加载更多</a>
        <%--<div class="label">商品加载中...</div>--%>
    </div>
</div>
</div>
<style>
    #return-top{position:fixed;bottom:10%;right:50px; width:60px;height:60px;text-align:center;display:none;z-index: 10;}
    #return-top a{text-decoration:none;}
</style>
<div id="return-top">
    <a>
        <img style="width: 45px;height: 45px;" src="../../page/img/top.png">
    </a>
</div>
</body>
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
    var pageNo = 1;
    var domain = "http://"+window.location.host;
    new Swiper('.swiper-container', {
        slidesPerView:'auto',
        spaceBetween:0,
    });

    var px = "latest desc";
    // 修改排序
    $(".order-nav li").on("click",function(){
        $(".goods-list div.goods-item").remove();
        $('#scrollable').scrollTop(0);
        pageNo = 1;
        $(".order-nav li").removeClass('cur');
        $(this).addClass('cur');
        if($(this).index()==$(".order-nav li").length-1){
            var key = $(this).attr("key") == "asc" ? "desc" : 'asc';
            if(key != "asc"){
                $("#price-ico").removeClass("price-ico-up");
                $("#price-ico").addClass("price-ico-down");
            }else{
                $("#price-ico").removeClass("price-ico-down");
                $("#price-ico").addClass("price-ico-up");
            }
            $(this).attr("key",key);
        }
        px = $(this).find("a").attr("data-sort")+" "+$(this).find("a").attr("key");
        get_list(px);
    });

    $('.pullup-goods').click(function(){
        $("#label").text("商品加载中...");
        get_list(px);
        $('#label').text('点击加载更多')
    })

    //加载页面元素
    function get_list(sort){
        var catId = $("#inputCatId").attr("value");
        if(null != catId){
            document.getElementById("catID_"+catId).className += " active";
        }
        $.ajax({
            url:""+"/app/index/getProductList.do",
            async:false,
            data: {'pageNo':pageNo,'levelOneCategoryId':catId,'sort':sort},
            dataType:'json',
            type:"post",
            success:function(data){
                var arrLen = data.length;
                if(arrLen > 0){
                    var classifyProductHtml = '';
                    $.each(data,function(index,item){
                        classifyProductHtml+='<div class="goods-item"><a data-gid="16537009" onclick="myProgress('+item.numIid+','+'3'+')" href="javascript:void(0);" class="img">' +
                            '<span class="coupon-wrapper  theme-bg-color-1">券 <i>￥</i><b>'+item.couponAmount+'</b></span>' +
                            '<span class="today-wrapper"><b>NEW</b></span>' +
                            '<img class="lazy" src='+item.pictUrl+' style="background: rgb(245, 245, 245); display: inline;"></a>' +
                            '<a data-gid="16537009" href="/index.php?r=p/d&amp;id=16537009&amp;u=489217" class="title">' +
                            '<div class="text">【千选】'+item.shortTitle+'</div></a>' +
                            '<div class="price-wrapper"><span class="price">￥<span>'+accSub(item.zkFinalPrice,item.couponAmount)+'</span></span>' +
                            '<span class="text">券后</span><div class="sold-wrapper"><span class="text">销量</span>' +
                            '<span class="sold-num">'+item.volume+'</span></div></div></div>';
                    });
                    $("#classify_product_div").before(classifyProductHtml);
                    pageNo++;
                }
            }
        });
    }

    //减法避免丢失精度
    function accSub(arg1, arg2) {
        var r1, r2, m, n;
        try { r1 = arg1.toString().split(".")[1].length } catch (e) { r1 = 0 }
        try { r2 = arg2.toString().split(".")[1].length } catch (e) { r2 = 0 }
        m = Math.pow(10, Math.max(r1, r2));
        n = (r1 >= r2) ? r1 : r2;
        return ((arg1 * m - arg2 * m) / m).toFixed(n);
    }

    $("#cat-action-menu").click(function () {
        var tabByStyle = $("#detail-top-menu").attr("class");
        if(null != tabByStyle && ""!= tabByStyle){
            document.getElementById("detail-top-menu").className = "";
        }else {
            document.getElementById("detail-top-menu").className = "show";
        }
    });

    $(function(){
        //获取商品列表
        get_list("latest desc");
    })

    //返回顶部按钮控制
    $('#return-top').hide();
    $(function(){
        $(window).scroll(function(){
            if($(window).scrollTop()>300){
                $('#return-top').fadeIn(300);
            }
            else{$('#return-top').fadeOut(200);}
        });
        $('#return-top').click(function(){
            $('body,html').animate({scrollTop:0},300);
            return false;
        })
    });
    function myProgress(item,oper_type) {
        if(oper_type == 1){
            window.location.href = domain+"/app/classify/skipProduct.do?catId="+item;
        }
        if(oper_type == 2){
            window.location.href = domain+item;
        }
        if(oper_type == 3){
            window.location.href = domain+"/app/detail/skipProductDetail.do?numIid="+item;
        }
        var progress = 40;
        var progressId = setInterval(function(){
            progress= progress+5;
            $("#my_progress").css({width:progress+"%"});
            if(progress > 95){
                clearInterval(progressId);
            }
        },50);
    }
</script>
</html>