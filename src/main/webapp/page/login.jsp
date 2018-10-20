<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="/page/commons.jsp" %>--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-dns-prefetch-control" content="on"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta content="telephone=no" name="format-detection"/>
    <meta name="version" version="201810101200">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <script src="../../page/js/jquery.js" type="text/javascript"></script>
    <title>登录_搜券宝</title>
    <meta name="keywords" content="9.9包邮，白菜价，天天特价，优惠卷,淘券宝"/>
    <meta name="description" content="9.9包邮，白菜价，天天特价"/>
    <meta itemprop="image" content="_50x50.jpg" />
    <link rel="stylesheet" href="../../page/js/common.css">
    <link rel="stylesheet" href="../../page/js/main.css">
    <link rel="stylesheet" type="text/css" href="../../page/js/xcConfirm.css"/>
    <script src="../../page/js/xcConfirm.js" type="text/javascript" charset="utf-8"></script>

</head>

<body data-appid="489217" data-in="1">

<link rel="stylesheet" href="../../page/js/login.css">
<div class="header_pr  ">
    <header class="icon_header">
        <a class="iconfont icon-zuojiantou" onclick="window.location.href=document.referrer;" ui-back  ></a>
        <div>
            登录
        </div>
    </header>
</div>

<div class="layout" >
    <h1 class="col-mar text-center">
    </h1>

    <form action="" onSubmit="return false;" id="my_login" >
        <div class="col-mar form_input_item" id="form_input_item_01" error >
            <i class="iconfont tab_fl icon-phone"></i>
            <div class="inputtext">
                <input type="text" maxLength="11" id="accountNo" name="accountNo" value="17521333602" placeholder="手机号码"  />
                <i class="iconfont icon-closecircle tab col-hr close"></i>
            </div>
            <p class="input_msg">请输入正确11位的手机号码！</p>
        </div>
        <div class="col-mar form_input_item" id="form_input_item_02">
            <i class="iconfont tab_fl icon-path"></i>
            <div class="inputtext">
                <input type="password" maxLength="18" id="pwd" name="pwd" value="mju7nhy6" placeholder="密码"  />
                <i class="iconfont icon-eyeclose tab col-text showPassword"></i>
            </div>
            <p class="input_msg">密码为8-16位的数字或字母！</p>
        </div>


        <div class="col-mar login_submit">
            <input id="my_submit" type="submit" class="btn btn-default btn-block btn-max"  value= "登录" >
        </div>

        <div class="col-mar">
            还没有账号？立即<a  href="/app/login/register.do" class="col-link">注册</a>
        </div>
    </form>
</div>
<footer class="login_footer text-center">
    <a href="/app/login/register.do" class="col-aaa">去注册</a>
    <span  class="col-hr" >&nbsp;&nbsp;|&nbsp;&nbsp;</span><a href="/index.php?r=login/findpw"  class="col-aaa" >找回密码</a>
</footer>
<div style="display: none;"></div>
</body>
<script>
    var domain = "http://"+window.location.host;
    var accountFlag = true;
    var pwdFlat = true;
    $("#accountNo").blur(function(){
        var tel = $("#accountNo").val(); //获取手机号
        //如果手机号码不能通过验证
        if(!(/^1[34578]\d{9}$/.test(tel))){
            $("#form_input_item_01").attr("error","true");
            accountFlag = false;
        }else {
            $("#form_input_item_01").attr("error","false");
            accountFlag = true;
        }
    })

    $("#pwd").blur(function(){
        var pwd = $("#pwd").val(); //密码
        if(!(/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$/.test(pwd))){
            $("#form_input_item_02").attr("error","true");
            pwdFlat = false;
        }else {
            $("#form_input_item_02").attr("error","false");
            pwdFlat = true;
        }
    })

    $(document).ready(function(){
        $("#my_submit").hover(function(){
            $("#my_submit").css("background-color","#009933");
        },function(){
            $("#my_submit").css("background-color","#eee");
        });
    });

    $('#my_submit').on('click',function(){
        if(!accountFlag){
            $("#form_input_item_01").attr("error","true");
            return;
        }
        if(!pwdFlat){
            $("#form_input_item_02").attr("error","true");
            return;
        }
        var accountNo = $("#accountNo").val(); //获取手机号
        var pwd = $("#pwd").val(); //密码
        $.ajax({
            url:""+"/app/login/login.do",
            async:false,
            data: {'account':accountNo,'pwd':pwd},
            dataType:'json',
            type:"post",
            success:function(data){
                console.log(data);
                if("1" == data){//用户名或密码不能为空！
                    var txt=  "用户名或密码不能为空,请重新登陆！";
                    window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.error);
                }
                if("2" == data){//用户名或密码错误！
                    var txt=  "用户名或密码错误,请重新登陆！";
                    window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.error);
                }
                if("3" == data){//登陆成功
                    window.location.href = domain+"/app/user/centre.do";
                }
            }
        });
    });
</script>
</html>