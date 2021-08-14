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
       var userEle=document.getElementById("usernameEle");
       userEle.onblur=function(){
       //获取异步对象
          var xmlhttp=createXMLHttpRequest();
       //打开异步对象
          xmlhttp.open("Post","/Web01/Bservlet",true);
       //设置请求头
          xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
       //发送请求   
          xmlhttp.send("username="+userEle.value);
          xmlhttp.onreadystatechange=function(){
           if(xmlhttp.readyState==4&&xmlhttp.status==200){
             var text=xmlhttp.responseText;
             var span=document.getElementById("errorSpan");
             if(text=="1"){
                 span.innerHTML="用户名已被注册"; 
             }else{
               span.innerHTML="";
             }
          }
          };
          
       };
     };
      
 </script>
  </head>
  
  <body>
   <form action""method="post">
           用户 <input type="text" name="username" id="usernameEle"/><span id="errorSpan"></span><br/>
           密码  <input type="password" name="password"/><br/>
      <input type="submit" value="注册"/>
   </form>
  </body>
</html>
