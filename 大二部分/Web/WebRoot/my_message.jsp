<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@  page import="com.gec.domain.Student" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 

%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'my_message.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      *{
          margin:0px;
          padding:0px;
        }
      .container{
         width:600px;
         height:400px;
         margin:0px auto;
         background-color:#f5f5f5;
         margin-top:120px;
      }
      h1{
        width:220px;
        margin-left: auto;
        margin-right: auto;
      }
      p{
       font-size:18px;
      }
      span{
        display:inline-block;
        width:60px;
        margin-right: 100px;
      }
      .item{
        width:400px;
        margin:20px auto;
        height:200px;
      }
      button{
        margin-left: auto;
        margin-right: auto;
      }
    </style>
  </head>
  <body>
     <div class="container">
       <h1>我的个人信息</h1>
       <div class="item">
         <c:forEach items = "${applicationScope.student}" var="item" varStatus="currentStatus">
            <p class="bg-primary"><span>姓名：</span>${item.name}</p>
            <p class="bg-primary"><span>账号：</span>${item.account}</p>
            <p class="bg-primary"><span>学号：</span>${item.xuehao}</p>
            <p class="bg-primary"><span>专业：</span>${item.majory}</p>
         </c:forEach> 
          
       </div>
         <button type="button" class="btn btn-primary btn-lg btn-block" onclick="back()">返回</button>
     </div>
   <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
  </body>
</html>
