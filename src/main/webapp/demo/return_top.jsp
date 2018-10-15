<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>无标题文档</title>
    <style>
        .panel{overflow:hidden;width:100%;height:1000px;}
        #return-top{position:fixed;bottom:10%;right:50px; width:60px;height:60px;background-color:#eee; text-align:center; display:none;}
        #return-top a{text-decoration:none; }

    </style>
    <script src="../page/js/jquery.js"></script>
</head>

<body>
<div class="panel" style="background-color:red;"></div>
<div class="panel" style="background-color:blue;"></div>
<div class="panel" style="background-color:yellow;"></div>
<div id="return-top"><a href="#">返回顶部</a></div>
<script>
    $(function(){
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

        })


    })
</script>
</body>
</html>

