<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
  <head>
  
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/adduser.css">
    <style>
      h1{
         font-size:30px;
         line-height:30px;
         font-weight:800;
         font:Microsoft YaHei;
      }
    </style>
  </head>  
 <body>
   <div class="dcontainer">
      <div class="head">
        <h1 class="text-primary">新增用户</h1>
      </div>
      <form class="form-horizontal" action="${ctxPath}/User/saveUser" method="post" id="addform">
        <!-- 用户名 -->
         <div class="form-group">
            <label for="text" class="col-sm-2 control-label">用户账号:</label>
              <div class="col-sm-10">
                 <input type="text" class="form-control" id="text" name="account" placeholder="请输入账号">
               </div>
          </div>
          <!-- 用户昵称 -->
         <div class="form-group">
            <label for="nickname" class="col-sm-2 control-label">用户昵称:</label>
              <div class="col-sm-10">
                 <input type="text" class="form-control" id="nickname" name="nickname" placeholder="请输入昵称">
               </div>
          </div>
           <!-- 用户工号 -->
         <div class="form-group">
            <label for="no" class="col-sm-2 control-label">用户工号:</label>
              <div class="col-sm-10">
                 <input type="text" class="form-control" id="no" name="no" placeholder="请输入工号">
               </div>
          </div>
          <!-- 用户性别 -->
          <div class="form-group">
             <label  for="sex" class="col-sm-2 control-label">用户性别:</label>
             <div class="col-sm-10">
               <select class="form-control" id="sex" name="sex" style="padding-left:6px;">
                 <option value="0" style="color:#999;">请选择性别</option>
                 <option value="男">男</option>
                 <option value="女">女</option>
               </select>
             </div>
          </div>
          <!-- 用户角色 -->
           <div class="form-group">
             <label  for="roleId" class="col-sm-2 control-label">用户角色:</label>
             <div class="col-sm-10">
               <select class="form-control" id="roleId" name="roleId" style="padding-left:6px;">
                 <option value="0" style="color:#999;">请选择角色</option>
                 <option value="r01">区域经理</option>
                 <option value="r02">门店店长</option>
                 <option value="r03">门店销售</option>
               </select>
             </div>
          </div>
        
          <!-- 用户密码 -->
           <div class="form-group">
            <label for="password" class="col-sm-2 control-label">用户密码:</label>
              <div class="col-sm-10">
                 <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
               </div>
            </div>
             <!-- 确定新增用户 -->
            <div class="form-group" >
               <div  style="padding:20px">
                  <button type="submit" class="btn btn-primary btn-lg btn-block" style="background-color:#28333f;border-color:#28333f">确定新增用户</button>
               </div>
            </div>
      </form>
   </div>
   
      <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="js/jquery.form.js"></script>
     <script>
       $(function(){
         $("#addform").ajaxForm(function(data){
            if(data=="增加用户成功"){
              window.location="${ctxPath}/User/list";
            }else if(data=="用户已经存在"){
              alert("用户已经存在");
            }
         })
       })
     </script>
	
 </body>
</html>

