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
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <meta itemprop="image" content="_50x50.jpg" />

    <link rel="apple-touch-icon" href="/touch-icon-iphone.png"/>
    <link href="/favicon.ico" rel="shortcut icon" />
    <link href="/favicon.ico" rel="icon">
    <link href="/touch-icon-iphone.png" rel="Bookmark" />

    <script type="text/javascript" src="/page/js/mobile/layer.js"></script>
    <script src="/page/js/clipboard.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/page/js/common.css">
    <link rel="stylesheet" href="/page/js/main.css">
    <script src="/page/js/jquery.js" type="text/javascript"></script>
</head>

<body data-appid="489217" data-in="1">
<link rel="stylesheet" href="/page/js/user.css" />

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



<div class="layout ">
    <div class="user_info" ui-user-info >
        <div class="cent">
            <div class="col-mar row-s">
                <a href="" class="img"><img src="http://cmsstatic.dataoke.com//wap_new/user/images/user_info_tx.png?v=201810101200" alt=""></a>
                <div class="info">
                    <c:if test="${null != userDo}">
                        <p class="name off">欢迎：${userDo.userName}</p>
                    </c:if>
                    <c:if test="${null == userDo}">
                        <p class="name off"><a href="/app/login/toLogin.do">登录</a>/<a href="/app/login/register.do">注册</a></p>
                    </c:if>
                </div>
            </div>
        </div>
        <a href="/app/user/logout.do" class="iconfont icon-shez setup">退出</a>
        <canvas ui-user-info-canvas id="canvas"></canvas>
    </div>
    <style>
        .ui_nav_list_01 li{float: left;width: 33%;padding:1rem 0;background:#fff;font-size:1rem;color:#666}
        .ui_nav_list_01 p{text-align: center;}
        .ui_nav_list_01 .text-left{text-align: center;width: 100%}
    </style>
    <ul class="ui_nav_list_01">
        <li class="row-s">
            <p style="color: red;">¥${canRecvAmt}</p>
            <p class="col-12-8 text-left">
                可提现(元)
            </p>
        </li>
        <li class="row-s">
            <p style="color: red;">¥${daiTotalAmt}</p>
            <p class="col-12-8 text-left">
                待结算(元)
            </p>
        </li>
        <li class="row-s">
            <p style="color: red;">¥${totalAmt}</p>
            <p class="col-12-8 text-left">
                累计收益(元)
            </p>
        </li>
    </ul>
    <div class="hr" style="background:#F5F5F5;height:5rem"></div>
    <style>
        .div_nav_list .text-left{float: left;margin-left: 0.2rem;}
        .div_nav_list .text-right{float: right;margin-right: 0.2rem;}
        .div_nav_list .div_nav_list_01{position: relative;width: 100%;height: 24px;border-bottom: 1px solid #F0F0F0;}
        .ui_nav_list{position: relative ;width: 100%;margin-top: 22px;}
        .ui_nav_list .row-s{float: left;width: 25%;text-align: center;padding-top: 0px;}
        .ui_nav_list .col-12-8{float:left;margin-left: 20%;}
    </style>
    <div class="div_nav_list">
        <div class="div_nav_list_01">
            <a href="javascript:void(0);" onclick="myOrder('1');">
                <p class="col-12-8 text-left">
                    我的订单
                </p>
                <p class="col-12-4 text-right" style="font-size: 10px;">查看全部<i class="iconfont icon-youjiantou"></i></p>
            </a>
        </div>
        <ul class="ui_nav_list">
            <li class="row-s">
                <a  href="javascript:void(0);" onclick="myOrder('1');">
                    <i class="iconfont "><img src="/page/img/quanbu.png" alt=""></i>
                    <p class="col-12-8">
                        全部
                    </p>
                </a>
            </li>
            <li class="row-s">
                <a  href="javascript:void(0);" onclick="myOrder('14');">
                    <i class="iconfont "><img src="/page/img/daifukuan.png" alt=""></i>
                    <p class="col-12-8">
                        待结算
                    </p>
                </a>
            </li>
            <li class="row-s">
                <a  href="javascript:void(0);" onclick="myOrder('3');">
                    <i class="iconfont "><img src="/page/img/yifukuan.png" alt=""></i>
                    <p class="col-12-8">
                        已结算
                    </p>
                </a>
            </li>
            <li class="row-s">
                <a  href="javascript:void(0);" onclick="myOrder('13');">
                    <i class="iconfont "><img src="/page/img/quxiao.png" alt=""></i>
                    <p class="col-12-8">
                        已失效
                    </p>
                </a>
            </li>

        </ul>
    </div>
    <div class="hr_2" style="height: 3.0rem;"></div>

    <style>
        .div2_nav_list{position: relative ;width: 100%;margin-top: 22px;}
        .ui_nav_list_2{position: relative ;width: 100%;}
        .ui_nav_list_2 li{padding:1rem 0;background:#fff;font-size:1rem;color:#666}
        .div2_nav_list .ui_nav_list_2 .row-s-2{float: left;width: 25%;text-align: center;}
        .div2_nav_list .col-12-8{float:left;margin-left: 20%;}
    </style>
    <div class="div2_nav_list">
        <ul class="ui_nav_list_2">
            <li class="row-s row-s-2">
                <a  href="/app/user/invite.do">
                    <i class="iconfont "><img src="/page/img/tuijianhaoyou.png" alt=""></i>
                    <p class="col-12-8">
                        推荐好友
                    </p>
                </a>
            </li>
            <%--<li class="row-s row-s-2">
                <a  href="javascript:void(0);">
                    <i class="iconfont "><img src="/page/img/czozuozhinan.png" alt=""></i>
                    <p class="col-12-8">
                        操作指南
                    </p>
                </a>
            </li>--%>
            <li class="row-s row-s-2">
                <a  href="/app/user/team.do">
                    <i class="iconfont "><img src="/page/img/wodetuijian.png" alt=""></i>
                    <p class="col-12-8">
                        我的推荐
                    </p>
                </a>
            </li>
            <li class="row-s row-s-2">
                <a id="receive" href="javascript:void(0);">
                    <i class="iconfont "><img src="/page/img/tiqujilu.png" alt=""></i>
                    <p class="col-12-8">
                        提取记录
                    </p>
                </a>
            </li>
            <li class="row-s row-s-2">
                <a  href="/app/user/contact.do">
                    <i class="iconfont "><img src="/page/img/contact.png" alt=""></i>
                    <p class="col-12-8">
                        联系我们
                    </p>
                </a>
            </li>
        </ul>
    </div>
</div>
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
                console.log(data)
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
    function myOrder(tkStatus){
        $.ajax({
            url:""+"/app/order/queryOrderCheckLoginStats.do",
            async:false,
            dataType:'json',
            type:"post",
            success:function(data){
                if("true" == data){//用户已登陆
                    window.location.href = "/app/order/skipOrderPage.do?tkStatus="+tkStatus;
                }else{//用户未登陆
                    layer_msg();
                }
            }
        });
    }

    $("#receive").click(function () {
        $.ajax({
            url:""+"/app/receive/skipRecvPage.do",
            async:false,
            dataType:'json',
            type:"post",
            success:function(data){
                if("true" == data){//用户已登陆
                    window.location.href = "/app/receive/recvPage.do";
                }else{//用户未登陆
                    layer_msg();
                }
            }
        });
    });
    
    function layer_msg() {
        layer.open({
            content: '亲，请先去登陆哦！'
            ,skin: 'msg'
            ,time: 2 //2秒后自动关闭
        });
    }
</script>
</html>