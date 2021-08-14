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
    
    <title>My JSP 'st_full_course.jsp' starting page</title>
    
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
  
  <body>
     <div class="head" style="padding-top:0px;">
        <h1 style="margin-bottom:20px">数字校园-学生平台</h1>
        <a href="javascript:;" onclick="course()">课程信息</a>
        <a href="guanzhu.jsp" >我的关注</a>
        <a href="" style="color:#5dc0de">我的已选</a>
        <a href="javascript:;" id="my" onclick="my_detail('${applicationScope.my}')">我的信息</a>
        <a href="UserServlet?course_type=select_grade">我的成绩</a>
    </div>
    <table class="table table-hover" style="margin-top:20px;">
       <tr>
         <th>课程名称 </th>
         <th>课程学分 </th>
         <th>上课地点 </th>
         <th>授课教师</th>
         <th>操作</th>
       </tr>
        <c:forEach items = "${applicationScope.st_full_course}" var="course_detail" varStatus="currentStatus">        
         <tr id="${course_detail.co_id}">
             <td>${course_detail.course}</td>
             <td>${course_detail.credit}</td>
             <td>${course_detail.co_time}</td>
             <td>${course_detail.te_name}</td>
             <td><button type="button" class="btn btn-danger" onclick="tuixuan('${course_detail.co_id}')">退选课程</button></td>
          </tr>
        </c:forEach>
    </table>
       <h5 style="margin:0 auto">已经到底了</h5>
        <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	    <script src="js/demo1.js"></script>
      
  </body>
  
</html>
 <script>
     function course(){
        window.location.href="course.jsp";
     }
     function tuixuan(co_id){
       //(1)获取异步对象
       var xmlhttp=createXMLHttpRequest();
       //(2)打开与云服务器的连接 三个参数 指定请求方法 指定请求的URL 指定是否为异步通信
       xmlhttp.open("GET", "/Web/UserServlet?course_type=deletecourse&co_id="+co_id, true);
       //(3)发送请求
       xmlhttp.send(null);//GET请求没有请求体，但也要给出null。
       //(4)给异步对象的onreadystatechange事件注册监听
       xmlhttp.onreadystatechange=function(){//当xmlhttp的状态发送变化时执行
       //双重判断 xmlhttp的状态为4(服务器响应结束)，以及服务器响应的状态码为200(响应成功)
       if(xmlhttp.readyState==4&&xmlhttp.status==200){
       //获取服务器响应的内容
       var text=xmlhttp.responseText;
          alert(text);
          delete_course(co_id);
       }
     }
     }
  </script>
