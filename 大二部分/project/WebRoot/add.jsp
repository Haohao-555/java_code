<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
  
   <form action="/project/Controller?type=add" method="post">
    <table>
    	<tr><td>学号：</td><td><input type="text" name="stuID" /></td></tr>
    	<tr><td>姓名：：</td><td><input type="text" name="stuName"  /></td></tr> 
    	<tr><td>班级：</td><td><input type="text" name="stuClass" /></td></tr> 
    	<tr><td>住址：</td><td><input type="text" name="homeAddress" /> </td></tr>
    	<tr align="center"><td colspan="2"><input type="submit" value="save" /></td></tr>
   </table>
  </form>
  
  
  </body>
</html>
