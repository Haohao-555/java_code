<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>登录成功页面</title>
	</head>
	<body>
		<div align="center">
			<h3>
				目前在线人数为：<%=session.getAttribute("count")%></h3>
			<h4>
				欢迎您：<%=session.getAttribute("user")%></h4>


		</div>


	</body>
</html>