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

<h1>新增用户</h1>
<form action="${ctxPath}/User/saveUser" method="post">
 <label>用户名</label>
 <input type="text" name="account"/>
 <br/><br/>
 
 <label>用户昵称</label> 
 <input type="text" name="nickname" />
 <br/><br/>
 
  <label>工号</label> 
 <input type="text" name="no" />
 <br/><br/>
 
  <label>性别</label> 
 <select name="sex">
 <option value="0">请选择性别</option>
 <option value="男">男</option>
 <option value="女">女</option>
 </select>
 <br/><br/>
 
  <label>用户角色</label> 
 <select name="roleId">
 <option value="0">请选择角色</option>
 <option value="r01">区域经理</option>
 <option value="r02">门店店长</option>
  <option value="r03">门店销售</option>
 </select>
 <br/><br/>
 
  <label>密码</label> 
 <input type="text" name="password" />
 <br/><br/>
 <input type="submit" value="确认新增"/>
</form>