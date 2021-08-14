<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<style>
body{font-size:18px;}
[type="text"],[type="submit"]
{font-size:18px;}
</style>

<h1>用户登录</h1>
<form action="${ctxPath}/Login" method="post">
 <label>用户名</label>
 <input type="text" name="account"/>
 <br/><br/>
 
 <label>密码</label> 
 <input type="text" name="password" />
 <br/><br/>
 
 <input type="submit" value="确认登录"/>
</form>