<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:useBean id="circle"class="entity.Circle" scope="request"></jsp:useBean>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'requestScope.jsp' starting page</title>
    
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
     <%
       String radius=request.getParameter("radius");
       if(radius.equals("")||radius==null){
            radius="1";
       }
       double rad=Double.parseDouble(radius);
       circle.setRadius(rad);
      %>
      
     <div align="center">
     <h3>scope="request"</h3>
       <form action="" method="post">
               请输入圆半径：<input type="text" name="radius">
        <input type="submit" value="提交"><br/>
       </form>
        圆半径：<jsp:getProperty property="radius" name="circle"/><br/>
        圆面积：<jsp:getProperty property="circleArea" name="circle"/><br/>
        圆周长：<jsp:getProperty property="circumference" name="circle"/><br/>
    Bean对象：<%=circle.toString() %>
     </div>
  </body>
</html>
