<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'operate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
  
   <form action="${pageContext.request.contextPath}/Upload" method="post" enctype="multipart/form-data">
   <table border="1">
     <tr><td>姓名：</td><td><input type="text" name="sname"></td></tr>
     <tr><td>学号：</td><td><input type="text" name="sno"></td></tr>
     <tr><td>文件选择</td><td><input type="file" name="photo"></td></tr>

     <tr><td align="center" colspan="2"><input type="submit" value="文件上传"></td></tr>
     <tr><td colspan="1">对上传的文件下载</td><td><a href="${pageContext.request.contextPath}/ShowAllFiles">下载</a></td></tr>
     </table>
   </form>
  
  
  <h1 align="center"><a href="/index.jsp">返回登陆界面</a></h1>
  </body>
</html>
