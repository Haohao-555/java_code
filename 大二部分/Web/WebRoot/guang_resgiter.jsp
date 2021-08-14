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
    
    <title>My JSP 'admin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	-->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
     <link rel="stylesheet" type="text/css" href="css/admin.css">
  </head>
  
  <body>
      <div class="head">
	     <span class="icon" onclick="icon()"></span>
		  <h1>数字校园-管理员平台</h1>
	   </div>
       <div class="container">
	      <div class="mask" id="mask" onclick="mask()">
		     <div class="left">
                <a href="admin.jsp">课程管理</a>
                <a href="AdminServlet?type=select_student">查看学生信息</a>
		        <a href="AdminServlet?type=select_teacher">查看教师信息</a>
		        <a href="AdminServlet?type=admin_register">注册账号管理</a>
          </div>
		  </div>
          <div class="right">
	        <table class="table table-hover">
                <tr>
                   <th>账号 </th>
                   <th>密码</th>
                   <th>是否绑定个人信息</th>
                   <th>绑定的身份</th>
                   <th>操作</th>
                </tr>
              <c:forEach items = "${applicationScope.users}" var="user" varStatus="currentStatus">        
                <tr id="${user.id}">
                   <td>${user.account}</td>
                   <td>*****</td>
                   <td>
                     <c:choose>
                        <c:when test="${user.flag == '1'}">
                          <p>已绑定</p>      
                        </c:when>
                        
                        <c:when test="${user.flag == '0'}">
                          <p style="color:red;">未绑定</p>                          
                        </c:when>
                     </c:choose>
                   </td> 
                   <td>
                     <c:choose>
                        <c:when test="${user.type == '2'}">
                          <p>学生</p>      
                        </c:when>
                        <c:when test="${user.type == '3'}">
                          <p>教师</p>      
                        </c:when>
                        <c:otherwise>
                          <p>未知</p>                          
                        </c:otherwise>
                     </c:choose>
                   </td> 
                   <td>
                   <c:choose>
                        <c:when test="${user.flag == '1'}">
                           <button type="button" class="btn btn-warning" disabled="disabled">注销该账号</button>  
                        </c:when>
                     <c:otherwise>    
                         <button type="button" class="btn btn-danger" onclick="remove_account('${user.id}')">注销该账号</button>               
                     </c:otherwise>
                     </c:choose>
                   </td>     
                </tr>
              </c:forEach>
            </table>
	     </div>
	   </div> 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-transition.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-modal.js"></script>
	<script src="js/demo1.js"></script>
    <script>
        //移除元素
	  function remove(id){
	     var account=document.getElementById(id);
	     account.remove();
	  }
      function remove_account(id){
         var xmlhttp=createXMLHttpRequest();
          xmlhttp.open("Post", "/Web/AdminServlet", true);
          var req="type=del_user&"+"id="+id;
           //设置请求头
          xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
          xmlhttp.send(req);
           xmlhttp.onreadystatechange=function(){      
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
                var text=xmlhttp.responseText;
                alert(text);      
                //location.reload("admin.jsp");
                if(text == "注销账号成功"){
                  remove(id);
                }
             }
           } 
      }
    </script>
  </body>
</html>
