<%@ page language="java"import="java.util.*"contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h3 align="center">指定页面的实际路径、相对路径、当前应用路径</h3>
    <hr/>
    <table align="center" border="1" bordercolor="black">
     <tr>
       <td>当前服务器的名称和版本</td>
       <td><%=application.getServerInfo()%></td>
     </tr>
     <tr>
       <td>页面application.jsp的实际路径</td>
       <td><%=application.getRealPath("application.jsp") %></td>
     </tr>
     <tr>
       <td>当前Web程序的路径</td>
       <td><%=application.getContextPath() %></td>
     </tr>
    </table>
</body>
</html>