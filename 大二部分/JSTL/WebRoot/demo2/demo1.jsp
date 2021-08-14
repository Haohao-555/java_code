<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%><!-- 引入标签 -->
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %><!-- 引入标签 -->
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
      <p> contains(sourceStr,testStr)区分大小写</p>
      <form action="" method="post">
            请输入字符串1:<input type="text"name="sourceStr"/><br/>
            请输入字符串2:<input type="text" name="testStr"><br/>
            <input type="submit" value="提交">
      </form>
      
      <c:set value="${param.sourceStr}"var="sourceStr"></c:set>
      <c:set value="${param.testStr}"var="testStr"></c:set>
      
      <c:choose>
        <c:when test="${fn:contains(sourceStr,testStr)}">
        <!--${fn:containsIgnore(sourceStr,testStr)}不区分大小写  -->
            <p>字符串1有包含字符串2</p>
        </c:when>
        <c:otherwise>
            <p>字符串1没有有包含字符串2</p>
        </c:otherwise>
      </c:choose>
      
    </div>
  </body>
</html>
