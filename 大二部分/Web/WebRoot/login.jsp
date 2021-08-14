<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	  <link rel="stylesheet" type="text/css" href="css/login_register.css">
    <style>
    body{
      background-color:#f5f5f5;
    }
    
    </style>
  </head>
  
  <body>
    <div class="container">
         
     	  <a href="resgiter.jsp">注册用户信息</a>
     	  <h3 style="margin-bottom:14px">用户登录</h3>
     	  <form class="form-horizontal" action="/Web/UserServlet" method="post">
     	   <input type="text" name="type" value="login" style="display:none">
     	    <!-- 用户名 -->
            <div class="form-group">
               <label for="text" class="col-sm-2 control-label">账号:</label>
               <div class="col-sm-10">
                  <input type="text" class="form-control" id="text" name="account" placeholder="请输入账号">
               </div>
            </div>
            <!-- 密码 -->
            <div class="form-group">
               <label for="Password" class="col-sm-2 control-label">密码:</label>
               <div class="col-sm-10">
                   <input type="password" class="form-control" id="Password" name="password" placeholder="请输入密码">
               </div>
            </div>
            <!-- 登录 -->
            <div class="form-group" >
               <div  style="padding:20px">
                  <button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
               </div>
            </div>
         </form>
     </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
  </body>
  <script>
  //获取错误信息
   var error='<%=request.getSession().getAttribute("loginError")%>';
   if(error=='true'){
      alert("账号或密码错误");
      //清空错误信息
       <%request.getSession().setAttribute("loginError","false");%> 
   }
   
</script>
</html>

