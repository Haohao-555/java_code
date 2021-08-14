<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
     .dcontainer{
        width:650px;
        height:380px;
        margin-right:auto;
        margin-left:auto;
        background:#E5E5E5;
        border:2px solid #666;
        text-align:center;
     }
     h1{
       font-size:25px;
       line-height:380px;
     }
     a{
       position: relative;
       top:-340px;
       text-decoration:none;
       color:#000;
     }
  </style>
</head>
<body>
    <div class="dcontainer">
        <h1>抱歉，你输入的用户信息不正确，无法登录</h1>
        <a href="login.jsp">点击重新登录</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>
