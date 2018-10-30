<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>无标题文档</title>
    <script type="text/javascript" src="../page/js/jquery.min.js"></script>
    <script type="text/javascript" src="../page/js/jquery.lazyload.min.js"></script>
</head>
<style>
    img a,img{border:0px;}
    div{ margin-bottom:10px;}
</style>
</head>
<body>
<img src="images/0.jpg" /><br />
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
<div><a href="#"><img src="/page/img/rolling.gif" data-original="https://img.alicdn.com/imgextra/i3/3021615864/O1CN011tBkztasSyxorYf_!!3021615864.jpg_310x310.jpg"></a></div>
</body>
<script type="text/javascript">
    $(document).ready(
        function($){
            $("img").lazyload({
                placeholder : "/page/img/rolling.gif", //加载图片前的占位图片
                effect      : "fadeIn" //加载图片使用的效果(淡入)
            });
        });
</script>
</html>

