<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
    var btn=document.getElementById("btn");//获取按钮
   
    btn.onclick=function(){//添加点击事件
       var xmlhttp=createXMLHttpRequest();//获取异步对象
       xmlhttp.open("GET","/XStream/Aservlet",true);//打开异步对象，并设置请求参数
       xmlhttp.send(null);//发送请求头 get为空
       xmlhttp.onreadystatechange=function(){//为客户端设置反应
          if(xmlhttp.readyState==4&&xmlhttp.status==200){
             alert("接收成功");
             var text="";
             //下面部分是解析xml文件，属于前端问题    
       };
       
    };
 };
</script>
</head>
<body>
   <button id="btn">点击</button>
   <h1 id="h1"></h1>
   <h1 id="h2"></h1>
   <h1 id="h3"></h1>
   
</body>
</html>