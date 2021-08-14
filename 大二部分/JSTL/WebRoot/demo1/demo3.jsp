<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入标签 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'demo3.jsp' starting page</title>
    
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
   <%List<String>nameList=new ArrayList<String>();
      nameList.add("Toms");
      nameList.add("Smith");
      nameList.add("John");
      nameList.add("James");
      nameList.add("Rose");
      request.setAttribute("nameLists",nameList);
    %>
   <div align="center">
     输出集合中的内容<hr/>
     <c:forEach items="${nameLists}" var="name" varStatus="currentStatus">
       当前元素：<c:out value="${name}"></c:out>&nbsp;&nbsp;
       当前元素索引号：<c:out value="${currentStatus.index}"></c:out>&nbsp;&nbsp;
       当前迭代数为：<c:out value="${currentStatus.count}"></c:out>&nbsp;&nbsp;
    <c:if test="${currentStatus.first}">第一次循环</c:if>
    <c:if test="${currentStatus.last}">最后一次循环</c:if>
    <hr/>
     </c:forEach>
   </div>

  </body>
</html>
