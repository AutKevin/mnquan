<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>大狗子笔记</title>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7">
    <link href="/static/blog/css/base.css" rel="stylesheet">
    <link href="/static/blog/css/index.css" rel="stylesheet">
    <link href="/static/blog/css/m.css" rel="stylesheet">
    <link href="/static/blog/css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/modernizr.js"></script>
    <![endif]-->
    <script type="text/javascript" src="/static/blog/js/jquery.js"></script>
</head>
<body>
<div id="wrapper">
    <header>
        <div class="headtop"></div>
        <div class="contenttop">
            <div class="logo f_l">一个菜成狗的笔记</div>
            <div class="search f_r">

            </div>
            <div class="blank"></div>
            <nav>

            </nav>
            <script type="text/javascript">
                // Navigation Menu
                $(function() {
                    $(".menu ul").css({display: "none"}); // Opera Fix
                    $(".menu li").hover(function(){
                        $(this).find('ul:first').css({visibility: "visible",display: "none"}).slideDown("normal");
                    },function(){
                        $(this).find('ul:first').css({visibility: "hidden"});
                    });
                });
            </script>
        </div>
    </header>
    <div class="jztop"></div>

    <div class="container">
        <div class="con_content">
            <div class="about_box">

                <div class="f_box">
                    <p class="a_title">【转】深度学习笔记1：神经网络理解</p>
                    <p class="p_title"></p>
                    <p class="box_p">
                    <span>
                        发布时间：2018年8月27日 20:42
                    </span>
                        <span>
                        作者：Master
                    </span>
                        <span>
                        来源：转载
                    </span>
                        <span>
                        点击：52
                    </span>
                    </p>
                    <!-- 可用于内容模板 -->
                </div>
                <ul class="about_content">

                    <h2 style="background-color: transparent; box-sizing: border-box; color: rgb(79, 79, 79); font-family: -apple-system,SF UI Text,Arial,PingFang SC,Hiragino Sans GB,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif,SimHei,SimSun; font-size: 24px; font-style: normal; font-variant: normal; font-weight: 700; letter-spacing: normal; line-height: 32px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 8px; orphans: 2; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left; text-decoration: none; text-indent: 0px; text-transform: none; -webkit-text-stroke-width: 0px; white-space: normal; word-break: break-all; word-spacing: 0px;"><a style="box-sizing: border-box; color: rgb(78, 161, 219); cursor: pointer; outline-color: invert; outline-style: none; outline-width: 0px; text-decoration: none; word-break: break-all;"></a>1、神经网络简介</h2><p><span style="display: inline !important; float: none; background-color: transparent; color: rgb(51, 51, 51); font-family: -apple-system,SF UI Text,Arial,PingFang SC,Hiragino Sans GB,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif,SimHei,SimSun; font-size: 14px; font-style: normal; font-variant: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-decoration: none; text-indent: 0px; text-transform: none; -webkit-text-stroke-width: 0px; word-break: break-all; word-spacing: 0px;"></span></p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;">&nbsp; &nbsp; &nbsp; &nbsp; 神经网络是一种应用类似于大脑神经突触联接的结构进行信息处理的数学模型。神经元为神经网络中的基本组成单位，</p><p><span style="display: inline !important; float: none; background-color: transparent; color: rgb(51, 51, 51); font-family: -apple-system,SF UI Text,Arial,PingFang SC,Hiragino Sans GB,Microsoft YaHei,WenQuanYi Micro Hei,sans-serif,SimHei,SimSun; font-size: 14px; font-style: normal; font-variant: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-decoration: none; text-indent: 0px; text-transform: none; -webkit-text-stroke-width: 0px; word-break: break-all; word-spacing: 0px;"></span></p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;">常见的激活函数有sigmoid函数<img alt="" src="https://img-blog.csdn.net/20160816135341742?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center">，双曲正切函数<img alt="" src="https://img-blog.csdn.net/20160816135542944">，其函数图像如下图所示。</p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;"><br></p><h2 style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 24px; font-weight: 700; line-height: 32px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 8px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; word-break: break-all;"><a style="box-sizing: border-box; color: rgb(78, 161, 219); cursor: pointer; outline-color: invert; outline-style: none; outline-width: 0px; text-decoration: none; word-break: break-all;"></a>2、神经网络模型</h2><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;"><br></p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;">&nbsp; &nbsp; &nbsp; &nbsp; 将许多神经元连接在一起，某些神经元的输出为另一些神经元的输入，就可以构成神经网络。如下图，为一个简单的三层神经网络。</p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;"><br></p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;">&nbsp; &nbsp; &nbsp; &nbsp; 图中每一个圆代表一个神经元的输入，写有b的圆代表偏置项。图中最左边的层称为输入层，我们图中的神经网络有三个输入单元。最右边一层成为输出层，输出层可以有一个结点，也可以有多个结点，表示整个网络的输出。其他中间的层成为隐含层。 &nbsp;</p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;">&nbsp; &nbsp; &nbsp; &nbsp; 我这里用a<sub style="box-sizing: border-box; outline-color: invert; outline-style: none; outline-width: 0px; word-break: break-all;">li</sub>表示第l层第i个单元的激活值，即a<sub style="box-sizing: border-box; outline-color: invert; outline-style: none; outline-width: 0px; word-break: break-all;">22</sub>表示第二层第二个神经元的激活值；用W<sub style="box-sizing: border-box; outline-color: invert; outline-style: none; outline-width: 0px; word-break: break-all;">ij</sub><sup style="box-sizing: border-box; outline-color: invert; outline-style: none; outline-width: 0px; word-break: break-all;">l</sup>表示第l层第i个神经元和第l+1层第j个神经元之间的连接参数;用b<sup style="box-sizing: border-box; outline-color: invert; outline-style: none; outline-width: 0px; word-break: break-all;">l</sup>表示第l层的偏置参数。则在我们的网络中第2层的神经元可以如下公式计算。</p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;">&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;到这里我们发现，神经网络的计算可以表示成十分整齐的矩阵乘法运算，所以在实际神经网络的运算中一般将其表示为GPU上的矩阵运算来提高运算速度。</p><p style="box-sizing: border-box; color: rgb(79, 79, 79); font-size: 16px; font-weight: 400; line-height: 26px; margin-bottom: 16px; margin-left: 0px; margin-right: 0px; margin-top: 0px; outline-color: invert; outline-style: none; outline-width: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: justify; word-break: break-all;"><br></p><p><span style="font-size: 18px;">注：本博文为转载文章，已征得原博主同意</span></p><p><span style="font-size: 18px;">来源：https://blog.csdn.net/l691899397/article/details/52220110</span></p>

                </ul>
                <div class="nextinfos">
                </div>
                <!-- 可用于内容模板 -->
                <!-- container代码 结束 -->
            </div>
        </div>
        <div class="blank"></div>
    </div>
    <!-- container代码 结束 -->

    <!-- container代码 结束 -->
    <div class="jzend"></div>
</div>


</body></html>