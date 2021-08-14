<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <script type="text/javascript">
 function createXMLHttpRequest(){
       try{
         return new XMLHttpRequest();
       }catch(e){
         try{
           return ActvieXObject("Msxml2.XMLHTTP");
         }catch(e){
           try{
            return ActvieXObject("Microsoft.XMLHTTP");
           }catch(e){
              alert("你用的是什么浏览器");
              throw e;
           }
         }
       }
 }
      window.onload=function(){
        var btn=document.getElementById("btn");
        btn.onclick=function(){//给按钮添加点击事件监听
        //(1)获取异步对象
           var xmlhttp=createXMLHttpRequest();
        //(2)打开与云服务器的连接 三个参数 指定请求方法 指定请求的URL 指定是否为异步通信
           xmlhttp.open("GET", "/Web01/Aservlet", true);
        //(3)发送请求
           xmlhttp.send(null);//GET请求没有请求体，但也要给出null。
        //(4)给异步对象的onreadystatechange事件注册监听
        xmlhttp.onreadystatechange=function(){//当xmlhttp的状态发送变化时执行
        //双重判断 xmlhttp的状态为4(服务器响应结束)，以及服务器响应的状态码为200(响应成功)
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
        //获取服务器响应的内容
              var text=xmlhttp.responseText;
        //获取h1元素
             var h1=document.getElementById("h1");
             h1.innerHTML=text;      
            }
          };
        };
     };
      
 </script>
  </head>
  
  <body>
   <button id="btn">哈哈</button>
   <h1 id="h1"></h1>
  </body>
</html>
