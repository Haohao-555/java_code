<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:useBean id="product" class="entity.Product" scope="page"></jsp:useBean>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'product3.jsp' starting page</title>
    
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
      <br/>
   输入产品名称：<input type="text" name="product_name1"/><br/>
   输入产品编号： <input type="text" name="product_id1"/><br/>
   输入产品价格：<input type="text" name="price1"/><br/>
   输入产品信息：<input type="text" name="info1"><br/>
   <input type="submit"value="提交"/>
    </form>
   </div>
   <div align="center">
   <!-- 设置property="*"所有属性 -->
    <jsp:setProperty property="product_name" name="product" param="product_name1"/>
        输入产品名称：<%=product.getProduct_name() %><br/>
    <jsp:setProperty property="product_id" name="product" param="product_id1"/>    
        输入产品编号：<%=product.getProduct_id() %><br/>
    <jsp:setProperty property="price" name="product" param="price1"/>    
        输入产品价格：<%=product.getPrice() %><br/>
    <jsp:setProperty property="info" name="product" param="info1"/>        
        输入产品信息：<%=product.getInfo() %><br/>
   </div>
  </body>
</html>
