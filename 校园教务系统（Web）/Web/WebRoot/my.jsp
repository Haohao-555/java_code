<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'my.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>
    <style>
      .container{
         width:1200px;
         height:600px;
         background-color:#f5f5f5;
         text-align:center;
         padding-top:40px;
         box-sizing:border-box;
      }
      h1{
        margin-bottom:40px;
      }
      a{
          font-size:20px;
          color:#000;
          text-decoration:none;
        }
        a:hover{
           color:#286090;
           text-decoration:none;
        }
    </style>
  <body>
  <!--  -->
     <div class="container">
       <a href="javascript:;" onclick="back()">返回</a>
       <h1>我的个人信息</h1>
     <form class="form-horizontal" action="/Web/UserServlet" method="post">
         <input type="text" name="type" value="my" style="display:none">
         <input type="text" name="account" value="${sessionScope.account}" style="display:none">
         <div class="form-group">
              <label for="text" class="col-sm-2 control-label" name="name">姓名</label>
              <div class="col-sm-10">
                 <input type="text" name="name" class="form-control" id="text" placeholder="请输入姓名">
              </div>
         </div>
         <div class="form-group">
              <label for="xuehao" class="col-sm-2 control-label" name="name">学号</label>
              <div class="col-sm-10">
                 <input type="text" name="xuehao" class="form-control" id="xuehao" placeholder="请输入学号">
              </div>
         </div>
         <div class="form-group">
              <label for="majory" class="col-sm-2 control-label" name="name">专业</label>
              <div class="col-sm-10">
                 <input type="text" name="majory" class="form-control" id="majory" placeholder="请输入专业">
              </div>
         </div>
         <div class="form-group">
              <label for="colleage" class="col-sm-2 control-label" name="colleage">院系</label>
              <div class="col-sm-10">
                 <input type="text" name="colleage" class="form-control" id="colleage" placeholder="请输入院系">
              </div>
         </div>
         <div class="form-group">
              <label for="nianji" class="col-sm-2 control-label" name="nianji">年级</label>
              <div class="col-sm-10">
                 <input type="text" name="nianji" class="form-control" id="nianji" placeholder="请输入年级">
              </div>
         </div>
         <div class="form-group" >
               <div  style="padding:20px">
                  <button type="submit" class="btn btn-warning btn-lg btn-block">绑定个人信息</button>
               </div>
            </div>
       </form>
     
     </div>
   
    
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
  </body>
</html>
