<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 导入类 -->
<jsp:useBean id="product" class="entity.Product" scope="page"></jsp:useBean>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'product1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!--property对应属性名字 name对应id值 -->
  <body>
    <div align="center">
     <jsp:setProperty property="product_name" name="product" value="Struts教程"/><br/>
          产品名称是：<%=product.getProduct_name()%><br/>
     <jsp:setProperty property="product_id" name="product" value="111100123689"/><br/>
         产品编号是：<%=product.getProduct_id()%><br/>
     <jsp:setProperty property="price" name="product" value="91.9"/><br/>
         产品价格是：<%=product.getPrice()%><br/>
     <jsp:setProperty property="info" name="product" value="Struts教程是一本介绍如何开发Struts的书籍"/><br/>
         产品描述是:<%=product.getInfo() %><br/>
    </div>
  </body>
</html>
