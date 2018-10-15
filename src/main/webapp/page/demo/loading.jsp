<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Bootstrap 实例 - 交替的进度条</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="progress" style="height: 5px">
    <div id="my_progress" class="progress-bar progress-bar-success" role="progressbar"
         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
         style="width: 0%;">
        <span class="sr-only">90% 完成（成功）</span>
    </div>
</div>
</body>
<script>
    var progress = 1;
    var initstr='';
    $(function () {
        initstr = setInterval("change()",50);
    })
    function change(){
        $("#my_progress").css({width:progress+"%"})
        if(progress > 95){
            clearInterval(initstr);
        }
        progress= progress+2;
    }
</script>
</html>
