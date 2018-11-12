<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta content="telephone=no" name="format-detection"/>
    <meta name="version" version="201809291636">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <title>${optionalDo.shortTitle}</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <link rel="stylesheet" href="../../page/js/swiper-4.4.1.min.css">
    <script src="../../page/js/jquery.min.js" type="text/javascript"></script>
    <script src="../../page/js/swiper-4.4.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="../../page/js/bootstrap.min.css">
    <script src="../../page/js/bootstrap.min.js"></script>
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
                    <img src="${contextPath}/page/img/index.png" alt="">
                </p>
               首页
            </a>
        </div>
        <div class="col-12-2 text-center but" style=" position: relative; left: -.7rem;">
            <a href="javascript:;" ui-add-collection data-id="16606735">
                <p class="img">
                    <img src="${contextPath}/page/img/shart_button.png" alt="">
                </p>
                分享
            </a>
        </div>
        <!-- 领券购买 淘口令 -->
        <div class="col-12-8">
            <div class="btn btn-primary btn-block row-s">
                <a href="javascript:;" onclick="getToken()" id="tbkText" name="${optionalDo.token}" class="col-12-5 active">口令购买</a>
                <a href="https:${optionalDo.couponShareUrl}" ui-open-taobao data-money="${optionalDo.couponAmount}" data-id="16606735" class="col-12-7 getGoodsLink">领券购买</a>
            </div>
        </div>
    </div>
    <div class="goods_shop_cart_bg "  ui-show data-css=".goods_shop_cart" data-active="false" ></div>
</div>
<div class="layout row" id="anchors_info" ui-up-app data-location="top" data-top="">
    <div class="goods_swiper"  >
        <div class="swiper-container swiper-container-horizontal swiper-container1">
            <div class="swiper-wrapper" >
                <c:forEach items="${images}" var="item" varStatus="tbkCoupon">
                    <div class="swiper-slide" >
                        <a ui-open-taobao href="https:${optionalDo.couponShareUrl}">
                            <img src="${item}">
                        </a>
                    </div>
                </c:forEach>
            </div>
            <div class="swiper-pagination swiper-p1"></div>
        </div>
    </div>
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
                价格 ¥${itemDetail.zkFinalPrice}
            </div>
            <div class="col-12-6 text-right auth">
                <c:if test="${itemDetail.freeShipment == true}">
                    <span><i class="iconfont icon-detail_icon col-money"></i>包邮</span>
                </c:if>
            </div>
        </div>
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
<!-- 模态框（Modal） -->
<div style="text-align:center;"class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div style="width:320px;height:200px;margin: auto;margin-top: 100px;" class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
            </div>
            <div style="margin:auto;border:3px dashed #e35132;width:300px;height:80px;" class="modal-body">
                <p id="modalText" style="color:#e35132;"></p>
            </div>
            <div class="modal-footer" style="text-align: center">
                <button id="modelButto" onclick="cp1(document.getElementById('modalText'))" type="button" class="btn btn-primary">
                    一键复制
                </button>
            </div>
            <div class="taokaobox"><a href="javascript:;" class="taokao taokaocopy"><img src="${contextPath}/page/img/androidcopy.png" style="width:100%;max-width:650px"></a></div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<div style="display: none;"></div>
</body>
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

    function getToken() {
        $('#myModal').modal('show');
    }
    //调用模态框时动态传入参数
    $('#myModal').on('show.bs.modal', function () {
        document.getElementById("modalText").innerHTML = "复制框内整段文字，打开【手淘APP】即可领券购买。"+$("#tbkText").attr("name");
        // 执行一些动作...
        document.getElementById("modelButto").className = "modelButtonRed";
    })

    function selectText1(x) {
        if (document.selection) {
            var range = document.body.createTextRange();//ie
            range.moveToElementText(x);
            range.select();
        } else if (window.getSelection) {
            var selection = window.getSelection();
            var range = document.createRange();
            selection.removeAllRanges();
            range.selectNodeContents(x);
            selection.addRange(range);
        }
        document.getElementById("modelButto").innerHTML = "复制成功";
        document.getElementById("modelButto").className = "modelButtonOlivedrab";
    }

    function cp1(x) {
        selectText1(x);
        document.execCommand("copy");
    }
</script>
</html>