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
    
    <title>My JSP 'course.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/user.css">
  </head>
  <body >
        <div class="head" style="padding-top:0px;">
                   <h1 style="margin-bottom:20px">数字校园-教师平台</h1>
                   <a style="color:#5dc0de; margin-bottom: 20px;" >我的任课表</a>
        </div>
	         <table class="table table-hover" style="margin-top:20px;">
                <tr>
                   <th>课程名称 </th>
                   <th>课程学分 </th>
                   <th>上课时间 </th>
                   <th>操作</th>
                </tr>
              <c:forEach items = "${applicationScope.t_courselist}" var="course" varStatus="currentStatus">        
                <tr id="${course.id}">
                   <td>${course.course}</td>
                   <td>${course.credit}</td>
                   <td>${course.co_time}</td>
                   <td><button type="button" class="btn btn-warning" onclick="select_full_course(${course.id})">查看该班学生</button></td>    
                </tr>
              </c:forEach>
            </table>
      
    
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
	<script type="text/javascript">
	    function select_full_course(co_id){
	         var xmlhttp=createXMLHttpRequest();
	         xmlhttp.open("Post", "/Web/TeacherServlet", true);
             //设置请求头
             xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded"); 
             var req="type=select_full_course&co_id="+co_id;
             xmlhttp.send(req);
             xmlhttp.onreadystatechange=function(){      
             if(xmlhttp.readyState==4&&xmlhttp.status==200){
                 window.location.href="tea_student.jsp"
            }
           }  
	     }
	
	</script>
  </body>
  
</html>

