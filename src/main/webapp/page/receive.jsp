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

    <script src="/page/js/clipboard.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/page/js/common.css">
    <link href="/page/js/wap_common.css" rel="stylesheet">
    <script src="/page/js/jquery.js" type="text/javascript"></script>

</head>

<body data-appid="489217" data-in="1">
<div class="main-title clearfix theme-bg-color-1" style="height: 8%;">
    <a href="javascript:void(0);" onclick="window.location.href=document.referrer;" class="main-back" style="margin-left: 0%;"></a>
    <div class="menu-detail">
        <span>提现记录</span>
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
        margin-top: 48px;
    }
    .layout .receive-heard{
        width: 100%;
        position: fixed;
        padding-top: 1px;
        text-align: center;
        background: #fff;
    }
    .layout .receive-heard img{
        width: 66px;
        padding-top: 2px;
    }
    .layout .receive-heard .receive-heard-p1{
         color: #FF9933;
         font-size: 30px;
     }
    .layout .receive-heard .receive-heard-p2{
        font-size: 12px;
        padding-bottom: 10px;
    }
    .layout .receive-body{
        width: 100%;
        position: fixed;
        margin-top: 36%;
        background: #fff;
    }

    .layout .receive-body button{
        width: 30%;
        line-height: 32px;
        border-radius: 24px;
        border: 0px;
        margin-top: 3%;
        margin-bottom: 10px;
        text-align: center;
        margin-left: 12%;
        border: 1px solid #FF9900;
        background: #fff;
        color: #FF9900;
    }

    .layout .receive-body .receive-body-01{
        width: 100%;
        margin-left: 2%;
        font-size: 15px;
        border-bottom: 1px solid #E0E0E0;
        line-height: 32px;
    }

    .layout .receive-body .receive-body-p1{
        font-size: 15px;
        margin-top: 12px;
        color: #D8D8D8;
        margin-left: 7px;
        padding-bottom: 2px;
        color: #FF9933;
    }
    .layout .receive-body .receive-body-p2{
        font-size: 15px;
        color: #D8D8D8;
    }

    .layout .receive-bottom{
        width: 100%;
        margin-top: 302px;
    }
</style>
<div class="layout">
    <div class="receive-heard">
            <img src="../../page/img/gold.png">
            <p class="receive-heard-p1">¥${canReceAmt}</p>
            <p class="receive-heard-p2">可提现余额</p>
    </div>
    <div class="receive-body">
        <div class="receive-body-01">
            <span>本次提现:</span><input id="receiveAmt" type="text" placeholder="请输入提现金额" style="text-align: center;">
        </div>
        <p class="receive-body-p1" id="bindAccount" dataValue="${bindAccount}">支付宝账号:${bindAccount}</p>
        <p class="receive-body-p2">【说明】每1天可提现一次,到账时间请联系客服!</p>
        <p class="receive-body-p2">QQ：462264038</p>
        <button class="receive-body-modelButto1"  type="button">
            我要提现
        </button>
        <button class="update-card-button-01"  type="button">
            修改支付宝号
        </button>
    </div>
    <style>
        .receive-bottom{
            width: 100%;
            background: #fff;
            text-align: center;
            font-size: 15px;
        }
        .receive-bottom table{
            width: 100%;
            border:1px solid #E0E0E0;
        }
        .receive-bottom .receive-bottom-table th{
            border-left:1px solid #E0E0E0;
            border-bottom: 1px solid #E0E0E0;
        }
        .receive-bottom .receive-bottom-table td{
            border-left:1px solid #E0E0E0;
            border-bottom: 1px solid #E0E0E0;
        }
    </style>
    <div class="receive-bottom">
        <p>提现记录</p>
        <table class="receive-bottom-table" cellspacing="0" cellpadding="0">
            <tr>
                <th>提现账号</th>
                <th>提现金额</th>
                <th>提现时间</th>
            </tr>
            <c:forEach items="${receiveDos}" var="item" varStatus="tbk">
                <tr>
                    <td>${item.account}</td>
                    <td>${item.amount}</td>
                    <td>${item.createTime}</td>
                </tr>
            </c:forEach>
        </table>
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
            <i class="iconfont"><img src="/page/img/footimages/shouye.png"></i>
            <span style="color: rgb(102, 102, 102);
">首页</span>
        </a>

        <a data-mold="1" data-el="2" href="/app/choiceness" class="col-10-2 ">
            <em class="num" style="background-image: -webkit-gradient(linear, left 20, right 0, from(#DC143C), to(	#FF0000));-webkit-background-clip: text;-webkit-text-fill-color: transparent;">新</em>
            <i class="iconfont"><img src="/page/img/footimages/99.png"></i>
            <span style="color: rgb(102, 102, 102);">9.9包邮</span>
        </a>

        <a data-mold="1" data-el="4" id="zhuanlian" href="javascript:void(0);" class="col-10-2 ">
            <i class="iconfont"><img src="/page/img/footimages/zhuanlian.png"></i>
            <span style="color: rgb(102, 102, 102);">转链</span>
        </a>

        <a data-mold="1" data-el="3" href="/app/classify" class="col-10-2 ">
            <i class="iconfont"><img src="/page/img/footimages/fenlei.png"></i>
            <span style="color: rgb(102, 102, 102);
">分类</span>
        </a>

        <a data-mold="1" data-el="5" href="/app/user/centre.do" class="col-10-2 ">
            <i class="iconfont"><img src="/page/img/footimages/wode.png"></i>
            <span style="color: rgb(253, 87, 92);
">我的</span>
        </a>
    </div>
</div>
<style>
    .update-card{
        position: fixed;
        left: 6%;
        top: 25%;
        background: #999;
        width: 86%;
        height: 35%;
        border-radius: 7px;
        z-index: 10000;
        display: none;
    }
    .update-card .update-card-header{
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
    .update-card .update-card-body{
        margin: auto;
        border: 1px solid #999;
        width: 260px;
        height: 30px;
        margin-top: 6%;
        margin-left: 18px;
    }
    .update-card {
        text-align: center;
        font-size: 15px;
        padding-top: 30px;
    }
    .update-card .update-card-footer{
        text-align: center;
        margin-top: 7%
    }
    .update-card .update-card-footer .update-card-button-02 {
        width: 36%;
        line-height: 32px;
        background-color: #ff3300;
        border-radius: 24px;
        color: #F5F5F5;
        border: 0px;
    }
</style>
<div class="update-card">
    <div class="update-card-header">
    </div>
    <p>请输入新的提现账号</p>
    <input id="accountNo" class="update-card-body" style="color:#e35132;">
    </input>
    <div class="update-card-footer">
        <button class="update-card-button-02"  type="button">
            确定
        </button>
    </div>
</div>
</body>
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
<!--提现点击事件-->
<script>
    $(".receive-body-modelButto1").click(function () {
        var receiveAmt = $("#receiveAmt").val();
        var bindAccount = $("#bindAccount").attr("dataValue");
        var reg = /^(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$/;
        if (!reg.test(receiveAmt)) {
            alert("提现金额必须大于0！")
            return false;
        }
        $.ajax({
            url:""+"/app/receive/receive.do",
            async:false,
            data: {'amount':receiveAmt,'account':bindAccount},
            dataType:'json',
            type:"post",
            success:function(data){
                if(data == 1){
                    alert("提现金额，大于可提现余额！");
                }
                if(data == 2){
                    alert("提现成功，24小时内到账！");
                }
                if(data == 3){
                    alert("提现失败，请从新尝试");
                }
                window.location.reload();
            }
        });
    });
</script>
<!--换绑事件点击事件-->
<script>
    $(".update-card-button-01").click(function () {
        $(".update-card").css("display","inline");
        $(".update-card-body").val("");
    });
    $(".update-card-header").click(function () {
        $(".update-card").css("display","none");
        $(".update-card-body").val("");
    });
    $(".update-card-button-02").click(function () {
        var tel = $("#accountNo").val(); //获取手机号
        //如果手机号码不能通过验证
        if(!(/^1[34578]\d{9}$/.test(tel))){
            alert("请输入正确的手机号");
            return;
        }
        $.ajax({
            url:""+"/app/user/resetAccount.do",
            async:false,
            data: {'bindAccount':tel},
            dataType:'json',
            type:"post",
            success:function(data){
                if(data == tel){
                    $("#bindAccount").val(data);
                    alert("换绑账号成功！");
                    window.location.reload();
                    $(".update-card").css("display","none");
                }else {
                    alert("绑定失败，请重新绑定！");
                }
            }
        });
    });
</script>
</html>