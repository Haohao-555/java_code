<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
 <link rel="stylesheet" href="css/login.css">
</head>
<body>
   <div class="container">
    <h3 style="margin-bottom:14px">用户登录</h3>
     <form class="form-horizontal" action="${ctxPath}/Login" method="post">
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
                  <button type="submit" class="btn btn-primary btn-lg btn-block" style="background-color:#28333f;border-color:#28333f">确定登录</button>
               </div>
            </div>
         </form>
     </div>

    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>
