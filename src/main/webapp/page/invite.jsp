<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/page/zhuanlian.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta content="telephone=no" name="format-detection"/>
    <meta name="version" version="201810101200">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <title>我的_搜券宝</title>
    <script src="/page/js/clipboard.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="/page/js/jquery.js"></script>
    <script type="text/javascript" src="/page/js/swiper-4.4.1.min.js"></script>
    <link rel="stylesheet" href="/page/js/swiper-4.4.1.min.css">
    <link rel="stylesheet" href="/page/js/common.css">
    <link href="/page/js/wap_common.css" rel="stylesheet">
    <link rel="stylesheet" href="/page/js/mycommons.css">
    <script type="text/javascript" src="/page/js/mobile/layer.js"></script>

    <style>
        html, body {
            position: relative;
            height: 100%;
            background: white;
        }
        .swiper-container {
            width: 100%;
            height: 100%;
        }
        .swiper-slide {
            text-align: center;
            font-size: 18px;
            display: -webkit-box;
            display: -ms-flexbox;
            display: -webkit-flex;
            display: flex;
            -webkit-box-pack: center;
            -ms-flex-pack: center;
            -webkit-justify-content: center;
            justify-content: center;
            -webkit-box-align: center;
            -ms-flex-align: center;
            -webkit-align-items: center;
            align-items: center;
        }
    </style>
</head>

<body data-appid="489217" data-in="1">
<div class="main-title clearfix theme-bg-color-1" style="height: 8%;">
    <a href="javascript:void(0);" onclick="window.location.href=document.referrer;" class="main-back" style="margin-left: 0%;"></a>
    <div class="menu-detail">
        <span>邀请好友</span>
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
            <li>
                <a href="/app/user/centre.do"><i class="iconfontv2 icon-gerenzhongxin"></i>我的</a>
            </li>
            <li>
                <a href="/app/user/logout.do"><i class="iconfontv2 icon-datail_feedback"></i>退出</a>
            </li>
        </ul>
    </div>
</nav>
<style>
    .layout{
        position: absolute;
        margin-top: 15%;
    }
    .layout .swiper-slide{
        text-align: center;
    }
    .layout img{
        width: 60%;
    }
</style>
<div class="layout">
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div onclick="savePicture('http://www.mnquan.cn/page/img/share_01.jpg')" class="swiper-slide"><img src="/page/img/share_01.jpg"></div>
            <div onclick="savePicture('http://www.mnquan.cn/page/img/share_02.jpg')" class="swiper-slide"><img src="/page/img/share_02.jpg"></div>
            <div onclick="savePicture('http://www.mnquan.cn/page/img/share_01.jpg')" class="swiper-slide"><img src="/page/img/share_01.jpg"></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
    <style>
        .invite{
            width: 100%;
            line-height: 45px;
        }
        .invite .invite-div{
            width: 74%;
            margin-top: 5%;
            margin-left: 15%;
        }

        .invite .invite-div .invite-p-01{
            text-align: center;
            font-size: 15px;
            line-height: 45px;
            background-color: #FFCC99;
            border-bottom-left-radius: 25px;
            border-top-left-radius: 25px;
            color: #F5F5F5;
            position: absolute;
            width: 50%;
        }

        .invite .invite-div button{
            position: absolute;
            font-size: 15px;
            text-align: center;
            width: 29%;
            line-height: 45px;
            background-color: #FF0033;
            color: #F5F5F5;
            float: left;
            border-bottom-right-radius: 25px;
            border-top-right-radius: 25px;
            margin-left: 45%;
        }
        .invite .invite-p-02{
            font-size: 15px;
            position: relative;
            padding-top: 15%;
            line-height: 20px;
        }
    </style>
    <div class="invite">
        <div class="invite-div">
            <p class="invite-p-01">
                邀请码:<span class="fq-shareapp-code">${inviteCode}</span>
            </p>
            <button type="button" class="invite-a">
                复制邀请码</button>
        </div>
        <p class="invite-p-02">温馨提示：点击图片可立即保存到相册中，登陆获取您的专属邀请码！</p>
    </div>
</div>
<style>
    .ui_bot_tab .row-s .col-10-2{
        width: 20%;
    }
</style>
<div class="ui_bot_tab" data-mta_name="首页-底部导航" ui-mta-modular>
    <div class="row-s">
        <a data-mold="1" data-el="1" href="/app" class="col-10-2 ">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i1/2053469401/TB2GCzpnVkoBKNjSZFkXXb4tFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);
">首页</span>
        </a>

        <a data-mold="1" data-el="2" href="" class="col-10-2 ">
            <em class="num" style="background-image: -webkit-gradient(linear, left 20, right 0, from(#DC143C), to(	#FF0000));
-webkit-background-clip: text;
-webkit-text-fill-color: transparent;">新</em>
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i4/2053469401/TB23GLTn77mBKNjSZFyXXbydFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);
">准备中</span>
        </a>

        <a data-mold="1" data-el="4" id="zhuanlian" href="javascript:void(0);" class="col-10-2 ">
            <i class="iconfont"><img src="/page/img/zhuanlian.png"></i>
            <span style="color: rgb(102, 102, 102);">转链</span>
        </a>

        <a data-mold="1" data-el="3" href="/app/classify" class="col-10-2 ">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i2/2053469401/TB2nLTXn7omBKNjSZFqXXXtqVXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);
">分类</span>
        </a>

        <a data-mold="1" data-el="5" href="/app/user/centre.do" class="col-10-2 ">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i2/2053469401/TB21aHkqRsmBKNjSZFFXXcT9VXa-2053469401.png"></i>
            <span style="color: rgb(253, 87, 92);
">我的</span>
        </a>
    </div>
</div>
</body>
<script>
    var clipboard = new ClipboardJS('.invite', {
        text: function() {
            var text = $(".fq-shareapp-code").text();
            return text;
        }
    });
    clipboard.on('success', function() {
        alert("复制成功")
    });
    clipboard.on('error', function() {
        alert("复制失败")
    });
</script>
<script>
    $("#cat-action-menu").click(function () {
        var tabByStyle = $("#detail-top-menu").attr("class");
        if(null != tabByStyle && ""!= tabByStyle){
            document.getElementById("detail-top-menu").className = "";
        }else {
            document.getElementById("detail-top-menu").className = "show";
        }
    });
</script>
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
                    window.location.href = "/app/detail/skipProductDetail.do?numIid="+data;
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
    new Swiper('.swiper-container', {
        effect: 'coverflow',
        grabCursor: true,
        centeredSlides: true,
        slidesPerView: 'auto',
        coverflowEffect: {
            rotate: 50,
            stretch: 0,
            depth: 100,
            modifier: 1,
            slideShadows : true,
        },
        pagination: {
            el: '.swiper-pagination',
        },
    });
</script>
<script>
    function savePicture(url) {
        // 创建下载任务
        picurl = url;
        //图片保存到手机后的路径
        plus.nativeUI.showWaiting('保存中...')
        var dtask = plus.downloader.createDownload(picurl, {}, function (d, status) {
            // 下载完成
            if (status == 200) {
                plus.gallery.save(d.filename, function () {//保存到相册方法
                    plus.nativeUI.closeWaiting()
                    layer_msg_sucess();
                }, function () {
                    plus.nativeUI.closeWaiting()
                    layer_msg_fail();
                });
            } else {
                layer_msg_fail();
            }
        });
        dtask.start();
    }
    
    function layer_msg_sucess() {
        layer.open({
            content: '图片保存成功'
            ,skin: 'msg'
            ,time: 2 //2秒后自动关闭
        });
    }
    function layer_msg_fail() {
        layer.open({
            content: '保存失败，请重试！'
            ,skin: 'msg'
            ,time: 2 //2秒后自动关闭
        });
    }
</script>
</html>