<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta content="telephone=no" name="format-detection"/>
    <meta name="version" version="201810101200">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <title>搜券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <script src="../../page/js/clipboard.min.js" type="text/javascript"></script>
    <script src="../../page/js/jquery.min.js" type="text/javascript"></script>
    <script src="../../page/js/bootstrap.min.js"></script>
    <script src="../../page/js/swiper-4.4.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="../../page/js/swiper-4.4.1.min.css">
    <link rel="stylesheet" href="../../page/js/detail.css">
</head>

<body data-appid="489217" data-in="1">
<div class="header_pr header_goods ">
    <header class="icon_header">
        <a ui-back   class="iconfont icon-zuojiantou" onclick="window.location.href=document.referrer;"></a>
        <div class="title">
            <div class="row-s">
                <a anchors="anchors_info" class="col-12-4 text-center active" ></a>
                <a anchors="anchors_title" class="col-12-4 text-center" ></a>
                <a anchors="anchors_ant" class="col-12-4 text-center" ></a>
            </div>
        </div>
        <a id="cat-action-menu" class="iconfont icon-gengduo"  ui-show data-css=".h_newlit" ></a>
        <div id="detail-top-menu" class="h_newlit">
            <div>
                <a href="/app"><i class="iconfont icon-detail_home"></i>首页</a>
                <a href="/app/query/query.do"><i class="iconfont icon-detail_search"></i>搜索</a>
                <a href="/app/user/centre.do"><i class="iconfont icon-gerenzhongxin"></i>我的</a>
            </div>
        </div>
    </header>
</div>
<!-- 购物车快捷入口 必须加在layout上面 -->
<div class="goods_shop_cart" ui-footprint data-item='goodsItem' data-type="1" >
    <div class="cent row-s">
        <div class="col-12-2 text-center but">
            <a href="/app" ui-show data-parents=".goods_shop_cart">
                <p class="img">
                    <img src="${contextPath}/page/img/index.png" alt="" style="width: 40%">
                </p>
                首页
            </a>
        </div>
        <div class="col-12-2 text-center but" style=" position: relative; left: -.7rem;">
            <a href="javascript:;"  ui-add-collection id="cou-share">
                <p class="img">
                    <img src="${contextPath}/page/img/shart_button.png" alt="" style="width: 40%">
                </p>
                分享
            </a>
        </div>
        <!-- 领券购买 淘口令 -->
        <div class="col-12-8">
            <div class="btn btn-primary btn-block row-s">
                <a href="javascript:;" id="token_buy" id="tbkText" name="${optionalDo.token}" class="col-12-5 active">口令购买</a>
                <a href="https:${optionalDo.couponShareUrl}" ui-open-taobao data-money="${optionalDo.couponAmount}" data-id="16606735" class="col-12-7 getGoodsLink">领券购买</a>
            </div>
        </div>
    </div>
    <div class="goods_shop_cart_bg "  ui-show data-css=".goods_shop_cart" data-active="false" ></div>
</div>
<div class="layout row" id="anchors_info" ui-up-app data-location="top" data-top="">
    <div class="goods_swiper"  >
        <div class="swiper-container swiper-container-horizontal swiper-container1" >
            <div class="swiper-wrapper" >
                <c:forEach items="${images}" var="item" varStatus="tbkCoupon">
                    <div class="swiper-slide" >
                        <a ui-open-taobao href="https:${optionalDo.couponShareUrl}">
                            <img src="${item}">
                        </a>
                    </div>
                </c:forEach>
            </div>
            <div class="swiper-pagination"></div>
        </div>
    </div>
    <!--banner-->
    <div class="goods_info">
        <h1 class="col-mar">
            <c:if test="${itemDetail.userType == 0}">
                <span>淘宝</span>
            </c:if>
            <c:if test="${itemDetail.userType == 1}">
                <span>天猫</span>
            </c:if>
            ${itemDetail.title}</h1>
        <div class="info row-s col-mar">
            <div class="col-12-6 text-left col-money">
                券后价 <span class=""><i>¥</i>${afterAmount}</span>
            </div>
            <div class="col-12-6 text-right">
                已售${itemDetail.volume}
            </div>
            <div class="col-12-6 text-left col-888">
                原价 ¥${itemDetail.zkFinalPrice}
            </div>
            <div class="col-12-6 text-right auth">
                <c:if test="${itemDetail.freeShipment == true}">
                    <span><i class="iconfont icon-detail_icon col-money"></i>包邮</span>
                </c:if>
            </div>
        </div>

        <div class="goods_quan row-s">
            <!--  -->
            <a class="row getGoodsLink" ui-open-taobao data-money="${optionalDo.couponAmount}" data-id="16762440" href="https:${optionalDo.couponShareUrl}" >
                <div class="col-12-8 money">
                    <p><span>${optionalDo.couponAmount}</span> 元优惠券</p>
                    使用期限:${optionalDo.couponStartTime}-${optionalDo.couponEndTime}                </div>
                <div class="col-12-4 name">
                    <span>立即领券</span>
                </div>
            </a>

            <img src="http://cmsstatic.dataoke.com//wap_new/main/images/goods_quan.png?v=201810101200" alt="">
        </div>
        <div class="goods_desc col-mar col-888">
            ${optionalDo.title}        </div>
    </div>
    <div class="hr"></div>
    <div class="ov_h" id="anchors_title" ></div>
    <div class="goods_reco"  data-goodsid = "566189190937" >
        <h3>宝贝详情</h3>
        <div class="imglist">
            <c:forEach items="${images}" var="item" varStatus="tbkCoupon">
                <img src="${item}" ui-lazyload alt="">
            </c:forEach>
        </div>
    </div>
</div>
<!--淘口令购买弹出层-->
<style>
    .t_token{
        position: fixed;
        left: 6%;
        top: 25%;
        background: white;
        width: 86%;
        height: 35%;
        border-radius: 7px;
        z-index: 10000;
         display: none;
    }
    .t_token .modal-header{
        background-image: url("/page/img/close.png");
        position:absolute;
        right:50px;width:30px;
        height: 30px;
        background-size: cover;
        background-repeat: no-repeat;
        bottom: -18px;
        margin-right: -60px;
        box-shadow: 0 2px 5px #999;
        border: 2px solid #fff;
        border-radius: 50px;
    }
    .t_token .modal-body{
        margin:auto;
        border:2px dashed #e35132;
        width:300px;
        height:88px;
        margin-top: 4%;
    }
    .t_token .modal-body p{
        color: #e35132;
        text-align: center;
        position: absolute;
        width: 89%;
        padding-top: 7%;}

    .t_token .modal-footer{
        text-align: center;
        margin-top: 8%
    }
    .t_token .modal-footer .modelButto{
        width: 73%;
        line-height: 40px;
        background-color: #ff3300;
        border-radius: 24px;
        color: #F5F5F5;
        border: 0px;
    }
</style>
<div class="t_token">
    <div class="modal-header">
    </div>
    <div class="modal-body">
        <p id="modalText" style="color:#e35132;">
            复制框内整段文字，打开【手淘APP】即可领券购买 ${optionalDo.token}。
        </p>
    </div>
    <div class="modal-footer">
        <button class="modelButto"  type="button">
            一键复制
        </button>
    </div>
</div>
<!--分享-->
<style>
    .t_share{
        position: fixed;
        left: 20%;
        top: 13%;
        background: white;
        width: 65%;
        height: 65%;
        border-radius: 7px;
        z-index: 10000;
        display: none;
    }
    .t_share .share-header{
        background-image: url("/page/img/close.png");
        position:absolute;
        right:50px;width:30px;
        height: 30px;
        background-size: cover;
        background-repeat: no-repeat;
        bottom: 356px;
        margin-right: -60px;
        box-shadow: 0 2px 5px #999;
        border: 2px solid #fff;
        border-radius: 50px;
    }
    .t_share .share-body{

    }
    .t_share .share-body img{
        padding-left: 6%;
        width: 88%;
        padding-top: 7%;
    }
    .t_share .share-body{
        font-size: small;
    }
    .t_share .share-body .share-text-1{
        width: 89%;
        padding-top: 7%;
    }
    .t_share .share-body .share-text-2{
        color: red;
    }

    .t_share .share-footer{
        text-align: center;
        margin-top: 7%
    }
    .t_share .share-footer .share-butto{
        width: 35%;
        line-height: 29px;
        background-color: #3366CC;
        color: #F5F5F5;
        border: 0px;
    }
</style>
<div class="t_share">
    <div class="share-header">
    </div>
    <div class="share-body">
        <img src="${optionalDo.pictUrl}">
            <p class="share-text-1">
                ${optionalDo.title}
            </p>
            <p class="share-text-2">
                券后价：${afterAmount}
            </p>
            <p class="share-text-3">
                搜券宝，专享优惠购买商品！！
            </p>
        </img>
        <div id="share-text" style="display: none">
            ${optionalDo.title}
            【券后价】:${afterAmount}
            ------------------------
            复制这条消息，${optionalDo.token},打开【手机淘宝】立即购买。
            数量有限！！速度买！！
        </div>
    </div>
    <div class="share-footer">
        <button class="share-butto"  type="button">
            复制文案
        </button>
    </div>
</div>
<script>
    new Swiper('.swiper-container1', {
        pagination: '.swiper-p1',
        loop: true, // 循环模式选项
        autoplay: {
            delay: 2500,
            disableOnInteraction: false,
        },
        pagination: {
            el: '.swiper-pagination',
        },
    });

    $("#cat-action-menu").click(function () {
        var tabByStyle = $("#detail-top-menu").attr("class");
        if("h_newlit" == tabByStyle){
            document.getElementById("detail-top-menu").className = "h_newlit active";
        }else {
            document.getElementById("detail-top-menu").className = "h_newlit";
        }
    });

    $("#token_buy").click(function () {
        $(".t_token").css("display","inline");
    });
    $(".modal-header").click(function () {
        $(".t_token").css("display","none");
    });

    $("#cou-share").click(function () {
        $(".t_share").css("display","inline");
    });
    $(".share-header").click(function () {
        $(".t_share").css("display","none");
    });
</script>
<script>
    var clipboard = new ClipboardJS('.modelButto', {
        text: function() {
            var text = $("#modalText").text();
            return text;
        }
    });
    clipboard.on('success', function() {
        $(".modelButto").css("background-color","#EE30A7");
        $(".modelButto").text("复制成功");
    });
    clipboard.on('error', function() {
        $(".modelButto").css("background-color","#CD6889");
        $(".modelButto").text("请再复制一次");
    });

    var clipboard = new ClipboardJS('.share-butto', {
        text: function() {
            var text = $("#share-text").text();
            return text;
        }
    });
    clipboard.on('success', function() {
        $(".share-butto").css("background-color","#EE30A7");
        $(".share-butto").text("复制成功");
    });
    clipboard.on('error', function() {
        $(".share-butto").css("background-color","#CD6889");
        $(".share-butto").text("请再复制一次");
    });
</script>
</body>
</html>