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
        <a href="course.jsp">课程信息</a>
        <a href="guanzhu.jsp" >我的关注</a>
        <a href="guanzhu.jsp">我的已选</a>
        <a href="javascript:;" id="my" onclick="my_detail('${applicationScope.my}')">我的信息</a>
        <a href="UserServlet?course_type=select_grade" style="color:#5dc0de">我的成绩</a>
    </div>
    <table class="table table-hover" style="margin-top:20px;">
       <tr>
         <th>课程名称 </th>
         <th>课程学分 </th>
         <th>上课地点 </th>
         <th>授课教师</th>
         <th>成绩</th>
       </tr>
        <c:forEach items = "${applicationScope.select_grade}" var="select_grade" varStatus="currentStatus">        
         <tr id="${select_grade.co_id}">
             <td>${select_grade.course}</td>
             <td>${select_grade.credit}</td>
             <td>${select_grade.co_time}</td>
             <td>${select_grade.te_name}</td>
             <td>
             <c:choose>
                        <c:when test="${select_grade.grade =='0.0'}">
                          <p style="color:red;">未录入成绩</p>      
                        </c:when>
                        
                        <c:otherwise>
                              ${select_grade.grade}                      
                        </c:otherwise>
                     </c:choose>
             
             </td>
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
     
  </script>
