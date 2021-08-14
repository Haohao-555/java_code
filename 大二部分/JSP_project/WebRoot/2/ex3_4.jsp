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
     String sessionID=session.getId();
     String name=(String)session.getAttribute("name");    
     %>
     <div align="center">
       <%=name%><p>你的session对象ID是</p><%=sessionID%>
       <form action="../3/ex3_2.jsp" method="post">
        <input type="submit" value="欢迎访问页面ex3_2.jsp"/>
       </form>
     </div>
</body>
</html>