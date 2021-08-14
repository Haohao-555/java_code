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
        btn.onclick=function(){
           var xmlhttp=createXMLHttpRequest();
           xmlhttp.open("Post", "/Web01/Aservlet", true);
           //设置请求头
           xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
           xmlhttp.send("username=张三&password=123");       
           xmlhttp.onreadystatechange=function(){      
            if(xmlhttp.readyState==4&&xmlhttp.status==200){      
              var text=xmlhttp.responseText;       
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
