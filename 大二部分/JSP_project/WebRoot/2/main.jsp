<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
   <%request.setCharacterEncoding("utf-8");%>
   
   <jsp:forward page="getParameter.jsp">
    <jsp:param value="小明" name="name"/>
    <jsp:param value="北京" name="city"/>
    </jsp:forward>
     
</body>
</html>