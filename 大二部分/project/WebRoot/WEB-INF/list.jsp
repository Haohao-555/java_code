<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
    <table border=1 width="500">
      <c:forEach items="${users}" var="u">
        <tr>
          <td>${u.id }</td>
          <td>${u.stuID}</td>
          <td>${u.stuName }</td>
          <td>${u.stuClass }</td>
           <td>${u.homeAddress }</td>
          <td>
            <a href="/project/Controller?type=edit&id=${u.stuID}">编辑</a>
          
          </td>
          <td>  <a href="/project/Controller?type=delete&id=${u.stuID}">删除</a></td>
        </tr>
      </c:forEach>
      
    </table>
    <p>
    	<a href="/project/add.jsp">添加</a>
    </p>
  </body>
</html>
