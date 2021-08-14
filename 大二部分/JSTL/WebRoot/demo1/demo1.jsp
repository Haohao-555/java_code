<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入标签 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'demo1.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<div align="center">
			<form action="" method="post">
			 请输入数值：<input type="text" name="num"/>
			 <input type="submit" value="提交">
			</form>
			
			<c:set value="${param.num}" var="num"></c:set>
			输入数为：<c:out value="${param.num}"></c:out>
			
			<c:if test="${num%2==0}" var="result"></c:if><br/>
              
			是偶数检查结果为：<c:out value="${result}"></c:out><br/>
			
			<c:if test="${num%2==1}" var="result"></c:if><br/>
            
			是奇数检查结果为：<c:out value="${result}"></c:out><br/>
		</div>


	</body>
</html>
