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
    <title>我的订单</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,淘券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <script src="../../page/js/jquery.js" type="text/javascript"></script>
    <link href="../../page/js/wap_common.css" rel="stylesheet">
    <link href="../../page/js/wap_search.css" rel="stylesheet"/>
</head>

<style>
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
<div class="main-title clearfix theme-bg-color-1" style="height: 8%;">
    <a href="javascript:void(0);" onclick="window.location.href=document.referrer;" class="main-back" style="margin-left: 0%;"></a>
    <div class="menu-detail">
        <span>我的订单</span>
    </div>
    <a class="mui-action-menu main-more" href="javascript:void(0)" id="cat-action-menu"></a>
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
        </ul>
    </div>
</nav>
<!-- 主界面具体展示内容 -->
<div class="order-nav" style="margin-top: 10%;">
    <ul>
        <li class="theme-border-bottom-color-1 cur" data-type="" key="" >
            <span><a  href="javascript:void(0);">全部</a></span>
        </li>
        <li class="" data-type="total_sales_" key="des">
            <span><a  href="javascript:void(0);"  >待结算</a></span>
        </li>
        <li class="" data-type="tk_rate_" key="des" >
            <span><a  href="javascript:void(0);" >已结算</a></span>
        </li>
        <li class="" data-type="price_" key="des" >
            <span><a href="javascript:void(0);">退款</a></span>
        </li>
    </ul>
</div>

<style>
    .scrollable{
        position: absolute;
        top: 90px;
        left: 0;
        right: 0;
        bottom: 0;
        overflow-y: scroll;
        -webkit-overflow-scrolling: touch;
        -webkit-box-flex: 1;
        background-color: #faf5f6;
    }
    .scrollable .ads-list2{width: 100%;height: 35%;background-color: #fff;border-bottom:  1px solid #F0F0F0; }
    .scrollable .ads-list2 a{text-decoration: none;font-family: Arial}
    .scrollable .ads-list2 .div_up{position: relative;padding-top: 1%;}
    .scrollable .ads-list2 .div_up .div_up_left{float: right;width: 75%;}
    .scrollable .ads-list2 .div_up img{width: 20%;padding: 5px;}
    .scrollable .ads-list2 .div_centre{position: relative;padding-top: 2%;}
    .scrollable .ads-list2 .div_centre_left{float: left;padding-left:10%;}
    .scrollable .ads-list2 p{color: #100000;font-size: 13px;text-overflow:ellipsis;white-space:nowrap; overflow: hidden;}
    .scrollable .ads-list2 .div_centre p{text-align: center;}
    .scrollable .ads-list2 .div_bottom{position: absolute;padding-top: 12%;padding-left: 4%}

</style>
<div class="scrollable" id="scrollable">
    <div class="sort_main ads-list2">
        <a href="#" >
            <div class="div_up">
                <img src="https://gd3.alicdn.com/imgextra/i1/792382564/TB2zdmdeN6I8KJjy0FgXXXXzVXa_!!792382564.jpg_310x310.jpg">
                <div class="div_up_left">
                    <p class="col-12-8 title">2018秋冬018秋冬018秋冬款018秋冬018秋冬018秋冬018秋冬018秋冬018秋冬</p>
                    <p class="col-12-8 shop">所属店铺:泰晤士小镇 </p>
                </div>
            </div>
            <div class="div_centre">
                <div class="div_centre_left">
                    <p class="col-12-8">¥17.2</p>
                    <p class="col-12-8 text-left">
                        付款金额
                    </p>
                </div>
                <div class="div_centre_left">
                    <p class="col-12-8">¥0.25</p>
                    <p class="col-12-8 text-left">
                        预估收入
                    </p>
                </div>
            </div>
            <div class="div_bottom">
                <p class="col-12-8">2018-10-10 15:33:57 创建</p>
            </div>
        </a>
    </div>

    <div class="sort_main ads-list2">
        <a href="#" >
            <div class="div_up">
                <img src="https://gd3.alicdn.com/imgextra/i1/792382564/TB2zdmdeN6I8KJjy0FgXXXXzVXa_!!792382564.jpg_310x310.jpg">
                <div class="div_up_left">
                    <p class="col-12-8 title">2018秋冬018秋冬018秋冬款018秋冬018秋冬018秋冬018秋冬018秋冬018秋冬</p>
                    <p class="col-12-8 shop">所属店铺:泰晤士小镇 </p>
                </div>
            </div>
            <div class="div_centre">
                <div class="div_centre_left">
                    <p class="col-12-8">¥17.2</p>
                    <p class="col-12-8 text-left">
                        付款金额
                    </p>
                </div>
                <div class="div_centre_left">
                    <p class="col-12-8">¥0.25</p>
                    <p class="col-12-8 text-left">
                        预估收入
                    </p>
                </div>
            </div>
            <div class="div_bottom">
                <p class="col-12-8">2018-10-10 15:33:57 创建</p>
            </div>
        </a>
    </div>

    <div class="sort_main ads-list2">
        <a href="#" >
            <div class="div_up">
                <img src="https://gd3.alicdn.com/imgextra/i1/792382564/TB2zdmdeN6I8KJjy0FgXXXXzVXa_!!792382564.jpg_310x310.jpg">
                <div class="div_up_left">
                    <p class="col-12-8 title">2018秋冬018秋冬018秋冬款018秋冬018秋冬018秋冬018秋冬018秋冬018秋冬</p>
                    <p class="col-12-8 shop">所属店铺:泰晤士小镇 </p>
                </div>
            </div>
            <div class="div_centre">
                <div class="div_centre_left">
                    <p class="col-12-8">¥17.2</p>
                    <p class="col-12-8 text-left">
                        付款金额
                    </p>
                </div>
                <div class="div_centre_left">
                    <p class="col-12-8">¥0.25</p>
                    <p class="col-12-8 text-left">
                        预估收入
                    </p>
                </div>
            </div>
            <div class="div_bottom">
                <p class="col-12-8">2018-10-10 15:33:57 创建</p>
            </div>
        </a>
    </div>
    <div class="sort_main ads-list2">
        <a href="#" >
            <div class="div_up">
                <img src="https://gd3.alicdn.com/imgextra/i1/792382564/TB2zdmdeN6I8KJjy0FgXXXXzVXa_!!792382564.jpg_310x310.jpg">
                <div class="div_up_left">
                    <p class="col-12-8 title">2018秋冬018秋冬018秋冬款018秋冬018秋冬018秋冬018秋冬018秋冬018秋冬</p>
                    <p class="col-12-8 shop">所属店铺:泰晤士小镇 </p>
                </div>
            </div>
            <div class="div_centre">
                <div class="div_centre_left">
                    <p class="col-12-8">¥17.2</p>
                    <p class="col-12-8 text-left">
                        付款金额
                    </p>
                </div>
                <div class="div_centre_left">
                    <p class="col-12-8">¥0.25</p>
                    <p class="col-12-8 text-left">
                        预估收入
                    </p>
                </div>
            </div>
            <div class="div_bottom">
                <p class="col-12-8">2018-10-10 15:33:57 创建</p>
            </div>
        </a>
    </div>


    <div  class="pullup-goods" style="position: absolute;width: 100%;background-color: #ebe;">
        <div class="label">商品加载中...</div>
    </div>
</div>
<div class="toTop">&#xe6a4;</div>
<div style="display: none;">
</div>
<ul class="search-land" >
</ul>
<style>
    .search .src-close-btn{
        right: 0!important;
    }
</style>
<!--搜索弹窗-->
</body>
<script>
    var pageSize = 30;
    var pageNo = 1;
    var px = "";
    // 修改排序
    $(".order-nav li").on("click",function(){
        $("#scrollable div.ads-list2").remove();
        $('#scrollable').scrollTop(0);
        pageNo = 1;
        $(".order-nav li").removeClass('cur');
        $(this).addClass('cur');
        if($(this).index()==$(".order-nav li").length-1){
            var key = $(this).attr("key") == "asc" ? "dec" : 'asc';
            if(key != "asc"){
                $("#price-ico").removeClass("price-ico-up");
                $("#price-ico").addClass("price-ico-down");
            }else{
                $("#price-ico").removeClass("price-ico-down");
                $("#price-ico").addClass("price-ico-up");
            }
            $(this).attr("key",key);
        }
        px = $(this).attr("data-type")+$(this).attr("key");
        get_list(px);
    });

    function get_list(sort) {
        var _q = $("#search_area").attr("value");
        $.ajax({
            url:""+"/app/query/superQueryList.do",
            async:false,
            data: {'pageSize':pageSize,'pageNo':pageNo,'sort':sort,'q':_q,'hasCoupon':"false"},
            dataType:'json',
            type:"post",
            success:function(data){
                var arrLen = data.length;
                if(arrLen > 0){
                    var superQueryListHtml = '';
                    $.each(data,function(index,item){
                        var couponAmt = 0;
                        if(null != item.couponInfo  && '' != item.couponInfo){
                            var temp = item.couponInfo;
                            var temp1 = temp.replace("满","").replace("元","").replace("元","").split("减");
                            couponAmt = temp1[1];
                        }
                        superQueryListHtml+='<div class="sort_main ads-list2">' +
                            '<div class="goods-item clearfix">' +
                            '<a data-transition="slide" href="/app/detail/skipProductDetail.do?type=1&numIid='+item.numIid+'" class="img ui-link">' +
                            '<img src="'+item.pictUrl+'"></a><div class="text"><div>' +
                            '<a data-transition="slide" href="/app/detail/skipProductDetail.do?type=1&numIid='+item.numIid+'" class="title ui-link">'+item.shortTitle+'<div class="share-wrapper">' +
                            '<img src="../../page/img/share.png"><p>分享</p><span class="coupon-wrapper  theme-bg-color-1">券<b>'+couponAmt+'</b></span></div><div class="price-wrapper1">' +
                            '<span class="price_yj">现价</span><span class="price">￥<span>'+item.zkFinalPrice+'</span></span>' +
                            '<span class="text">销量 </span><span class="sold-num">'+item.volume+'</span><div class="price-wrapper2">' +
                            '<span class="price_qh">券后</span><span class="price">￥<span>'+accSub(item.zkFinalPrice,couponAmt)+'</span></span><span class="text">剩余 </span><span class="sold-num">'+item.couponRemainCount+'</span>' +
                            '</div></div></a></div></div></div></div>';
                    });
                    $(".pullup-goods").before(superQueryListHtml);
                    pageNo++;
                }
            }
        });
    }

    //减法避免丢失精度
    function accSub(arg1, arg2) {
        if(0 == arg2){
            return arg1;
        }
        var r1, r2, m, n;
        try { r1 = arg1.toString().split(".")[1].length } catch (e) { r1 = 0 }
        try { r2 = arg2.toString().split(".")[1].length } catch (e) { r2 = 0 }
        m = Math.pow(10, Math.max(r1, r2));
        n = (r1 >= r2) ? r1 : r2;
        return ((arg1 * m - arg2 * m) / m).toFixed(n);
    }

    $(function(){
        get_list();

        $('.scrollable').scroll(function (e) {
            var h = $(this).height();//div可视区域的高度
            var st =$(this)[0].scrollTop;//滚动条的高度，即滚动条的当前位置到div顶部的距离
            var sh = $(this)[0].scrollHeight;//滚动的高度，$(this)指代jQuery对象，而$(this)[0]指代的是dom节点
            if((sh - h - st) < 10){
                get_list(px);
            }
        });
    })
</script>
<script>

    $('.sub_str_srarch').on('click',function(){
        $('#my-search').submit();
    });
</script>
</html>
