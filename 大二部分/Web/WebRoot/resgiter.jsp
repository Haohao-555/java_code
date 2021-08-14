<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'resgiter.jsp' starting page</title>
    
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
           <a href="login.jsp">返回到登录界面</a>
           <h3 style="margin-bottom:14px">用户注册</h3>
     	  <form class="form-horizontal" action="/Web/UserServlet" method="post">
     	  <input type="text" name="type" value="register" style="display:none">
     	    <!-- 用户名 -->
            <div class="form-group">
               <label for="text" class="col-sm-2 control-label" >账号:</label>
               <div class="col-sm-10">
                  <input type="text" class="form-control" id="text" placeholder="请输入账号" name="account">
               </div>
            </div>
            <!-- 密码 -->
            <div class="form-group">
               <label for="Password" class="col-sm-2 control-label">密码:</label>
               <div class="col-sm-10">
                   <input type="password" class="form-control" id="Password" placeholder="请输入密码" name="password">
               </div>
            </div>
            <!-- 登录 -->
            <div class="form-group">
               <div style="padding:20px">
                  <button type="submit" class="btn btn-primary btn-lg btn-block">注册</button>
               </div>
            </div>
           
         </form>
     </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
  </body>
</html>
<script>
  //获取错误信息
   var zhanghao_error='<%=request.getSession().getAttribute("zhanghaoError")%>';
   var canshu_error='<%=request.getSession().getAttribute("canshuError")%>';
   if(canshu_error=='true'){
      alert("输入的数据错误");
      //清空错误信息
       <%request.getSession().setAttribute("canshuError","false");%> 
   }else if(zhanghao_error=='true'){
       alert("账号已存在，请重新注册账号");
        <%request.getSession().setAttribute("zhanghaoError","false");%> 
   }
   
</script>
