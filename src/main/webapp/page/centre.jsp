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
    <title>我的_搜券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,搜券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <meta itemprop="image" content="_50x50.jpg" />

    <link rel="apple-touch-icon" href="/touch-icon-iphone.png"/>
    <link href="/favicon.ico" rel="shortcut icon" />
    <link href="/favicon.ico" rel="icon">
    <link href="/touch-icon-iphone.png" rel="Bookmark" />

    <link rel="stylesheet" href="../../page/js/common.css">
    <link rel="stylesheet" href="../../page/js/main.css">
    <script src="../../page/js/jquery.js" type="text/javascript"></script>
</head>

<body data-appid="489217" data-in="1">


<link rel="stylesheet" href="../../page/js/user.css" />

<div class="ui_bot_tab" data-mta_name="首页-底部导航" ui-mta-modular>
    <div class="row-s">
        <a data-mold="1" data-el="1" href="/app" class="col-10-2 ">
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i1/2053469401/TB2GCzpnVkoBKNjSZFkXXb4tFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);
">首页</span>
        </a>

        <a data-mold="1" data-el="2" href="/index.php?r=nine/wap" class="col-10-2 ">
            <em class="num" style="background-image: -webkit-gradient(linear, left 20, right 0, from(#DC143C), to(	#FF0000));
-webkit-background-clip: text;
-webkit-text-fill-color: transparent;">新</em>
            <i class="iconfont"><img src="https://img.alicdn.com/imgextra/i4/2053469401/TB23GLTn77mBKNjSZFyXXbydFXa-2053469401.png"></i>
            <span style="color: rgb(102, 102, 102);
">9.9包邮</span>
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
                    <p class="name off"><a href="/app/user/centre.do">登录</a>/<a href="/app/login/register.do">注册</a></p>
                </div>
            </div>
        </div>
        <%--<a href="/index.php?r=user/setuser" class="iconfont icon-shez setup"></a>--%>
        <canvas ui-user-info-canvas id="canvas"></canvas>
    </div>
    <style>
        .ui_nav_list_01 li{float: left;width: 50%;padding:1rem 0;background:#fff;font-size:1rem;color:#666}
        .ui_nav_list_01 p{text-align: center;}
        .ui_nav_list_01 .text-left{text-align: center;width: 100%}
    </style>
    <ul class="ui_nav_list_01">
        <li class="row-s">
            <p>0.0</p>
            <p class="col-12-8 text-left">
                即将到账(元)
            </p>
        </li>
        <li class="row-s">
            <p>0.0</p>
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
            <a href="/app/order/order.do">
                <p class="col-12-8 text-left">
                    <%--<i class="iconfont "><img src="http://cmsstatic.dataoke.com//wap_new/user/images/icon/wode_icon_feedback.svg" alt=""></i>--%>
                    我的订单
                </p>
                <p class="col-12-4 text-right" style="font-size: 5px;">查看全部<i class="iconfont icon-youjiantou"></i></p>
            </a>
        </div>
        <ul class="ui_nav_list">
            <li class="row-s">
                <a  href="/app/order/order.do">
                    <i class="iconfont "><img src="../../page/img/quanbu.png" alt=""></i>
                    <p class="col-12-8">
                        全部
                    </p>
                </a>
            </li>
            <li class="row-s">
                <a  href="/app/order/order.do">
                    <i class="iconfont "><img src="../../page/img/daifukuan.png" alt=""></i>
                    <p class="col-12-8">
                        待结算
                    </p>
                </a>
            </li>
            <li class="row-s">
                <a  href="/app/order/order.do">
                    <i class="iconfont "><img src="../../page/img/yifukuan.png" alt=""></i>
                    <p class="col-12-8">
                        已结算
                    </p>
                </a>
            </li>
            <li class="row-s">
                <a  href="/app/order/order.do">
                    <i class="iconfont "><img src="../../page/img/quxiao.png" alt=""></i>
                    <p class="col-12-8">
                        已退款
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
                <a  href="#">
                    <i class="iconfont "><img src="../../page/img/tuijianhaoyou.png" alt=""></i>
                    <p class="col-12-8">
                        推荐好友
                    </p>
                </a>
            </li>
            <li class="row-s row-s-2">
                <a  href="#">
                    <i class="iconfont "><img src="../../page/img/czozuozhinan.png" alt=""></i>
                    <p class="col-12-8">
                        操作指南
                    </p>
                </a>
            </li>
            <li class="row-s row-s-2">
                <a  href="#">
                    <i class="iconfont "><img src="../../page/img/wodetuijian.png" alt=""></i>
                    <p class="col-12-8">
                        我的推荐
                    </p>
                </a>
            </li>
            <li class="row-s row-s-2">
                <a  href="#">
                    <i class="iconfont "><img src="../../page/img/tiqujilu.png" alt=""></i>
                    <p class="col-12-8">
                        提取记录
                    </p>
                </a>
            </li>
        </ul>
    </div>

</div>
<div style="display: none;"></div>
</body>
</html>