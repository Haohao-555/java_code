<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <form action="getParameter.jsp" method="post">
    <table align="center">
     <tr>
       <td>姓名</td>
       <td><input type="text" name="name" value=""/></td>
     </tr>
     <tr>
      <td>城市</td>
      <td><input type="text" name="city" value=""/></td>
     </tr>
     <tr>
      <td><input type="submit" value="提交"/></td>
      <td><input type="reset" value="重置"/></td>
     </tr>
    </table>
    </form>
</body>
</html>