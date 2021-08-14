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
    
    <title>My JSP 'select_student.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
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
		        <a href="javascript:;">注册账号管理</a>
          </div>
		  </div>
          <div class="right">
	         <table class="table table-hover">
                <tr>
                   <th>序号</th>
                   <th>学生账号 </th>
                   <th>学生姓名 </th>
                   <th>学生学号 </th>
                   <th>学生专业</th>
                   <th>操作</th>
                </tr>
              <c:forEach items = "${applicationScope.students}" var="students" varStatus="currentStatus">        
                <tr>
                   <td>${currentStatus.index+1}</td>
                   <td>${students.account}</td>
                   <td>${students.name}</td>
                   <td>${students.xuehao}</td>
                   <td>${students.majory}</td> 
                   <td><button type="button" class="btn btn-warning " onclick="select_detail
                   ('${students.account}','${students.name}','${students.xuehao}','${students.majory}','${students.colleage}','${students.nianji}')">查看学生详细信息</button></td>     
                </tr>
              </c:forEach>
            </table>
	     </div>
	   </div>
       
       <div class="modal fade" id="mymodal">
           <div class="modal-dialog">
               <div class="modal-content">
                    <div class="modal-header">
				      <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title">学生详细信息</h4>
			         </div>
			         
			    <div class="modal-body">
				  <form class="form-horizontal">
                       <div class="form-group">
                          <label for="account" class="col-sm-2 control-label">学生账号</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="account" name="account" disabled="disabled">
                          </div>
                       </div>
                      <div class="form-group">
                         <label for="name" class="col-sm-2 control-label">学生姓名</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="name"  name="name" disabled="disabled">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="xuehao" class="col-sm-2 control-label">学生学号</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="xuehao"  name="xuehao" disabled="disabled">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="majory" class="col-sm-2 control-label">学生专业</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="majory" name="majory" disabled="disabled">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="colleage" class="col-sm-2 control-label">所属院系</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="colleage" name="collage" disabled="disabled">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="nianji" class="col-sm-2 control-label">所属年级</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="nianji" name="nianji" disabled="disabled">
                         </div>
                      </div>
                  </form>
			    </div>
			    <div class="modal-footer">
				    <button type="button" class="btn onclick btn-default" data-dismiss="modal">关闭</button>
			     </div>
		      </div>
	       </div>
           </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
	<script>
	   function select_detail(account,name,xuehao,majory,colleage,nianji){
	      $("#mymodal").modal("toggle");
	      $("#account").val(account);
	      $("#name").val(name);
	      $("#xuehao").val(xuehao);
	      $("#majory").val(majory);
	      $("#colleage").val(colleage);
	      $("#nianji").val(nianji);
	   }
	  
	</script>
  </body>
</html>
