<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <h1>用户登录</h1>
 <form action="/WebApp1/LoginServlet" method="post">
    <label>用户名:</label>
    <input type="text" name="username"/> 
    <br/> <br/>
    <label>密码：</label>
    <input type="password" name="password"/>
    <br/> <br/>
    <input type="submit" value="用户登录"/>
 </form>