<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%  // http://localhost:8080/JSP03_project/3.1/getParameter.jsp?name=john&city=beijing
		    request.setCharacterEncoding("utf-8");
			String name = request.getParameter("name");//获取请求参数
			String city = request.getParameter("city");
			if (name != null && city != null) {
		%>
		<div align="center">
			Welcome,<%=name%>,你所在的城市是<%=city%></div>
		<%
			} else {
		%>
		<p>
			欢迎访问！
		</p>
		<%
			}
		%>
		<jsp:include page="John.html"></jsp:include>
	</body>
</html>