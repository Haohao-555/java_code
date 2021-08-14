<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="pragma" content="no-cache">
<meta content="no-cache" http-equiv="cache-control">
<title>Insert title here</title>
</head>
<body>
   <%
    String sessionID=session.getId();//获取客户端ID
    session.setAttribute("name","John");//设置对象参数
    String author=(String)session.getAttribute("author");//获取参数
    %>
</body>
    <div align="center">
      <p>你访问的页面是ex3_2.jsp</p>
      <%=author%><p>您的session对象ID是：<%=sessionID%></p>
      </br>
      <form action="ex3_3.jsp" method="post">
       <input type="submit" value="转向ex3_3.jsp"/>
      </form>
      <a href="../2/ex3_4.jsp">欢迎来到ex3_4.jsp页面</a>
    </div>
</html>