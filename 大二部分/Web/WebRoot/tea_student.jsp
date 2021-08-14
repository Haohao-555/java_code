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
                   <a style="color:#5dc0de">课程学生</a>
                   <a href="teacher.jsp">我的任课表</a>
        </div>
             <button type="button" class="btn btn-warning" style="margin-bottom:8px; position:relative; left:1400px;" onclick="desc()">查看成绩排名</button>
	         <table class="table table-hover" >
                <tr>
                   <th>姓名</th>
                   <th>课程名称 </th>
                   <th>上课时间 </th>
                   <th>课程学分 </th>
                   <th>成绩</th>
                   <th>操作</th>
                </tr>
              <c:forEach items = "${applicationScope.full_courselist}" var="course" varStatus="currentStatus">        
                <tr id="${course.account}">
                   <td>${course.student}</td>
                   <td>${course.course}</td>
                   <td>${course.co_time}</td>
                   <td>${course.credit}</td>
                   <td>
                    <c:choose>
                        <c:when test="${course.grade =='0.0'}">
                          <p style="color:red;">未录入成绩</p>      
                        </c:when>
                        
                        <c:otherwise>
                              ${course.grade}                      
                        </c:otherwise>
                     </c:choose>
                   </td>
                   <td><button type="button" class="btn btn-warning" onclick="view('${course.course}','${course.credit}',
                  '${course.co_time}', '${course.student}', '${course.grade}', '${course.account}', '${course.co_id}')" >录入成绩</button></td>    
                </tr>
              </c:forEach>
            </table>
      
      
       <div class="modal fade" id="mymodal">
           <div class="modal-dialog">
               <div class="modal-content">
                    <div class="modal-header">
				      <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title"></h4>
			         </div>
			         
			    <div class="modal-body">
				  <form class="form-horizontal">
                       <div class="form-group">
                          <label for="course" class="col-sm-2 control-label">课程名称</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="course" name="course" disabled>
                          </div>
                       </div>
                      <div class="form-group">
                         <label for="credit" class="col-sm-2 control-label">课程学分</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="credit" name="credit" disabled>
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="time" class="col-sm-2 control-label">上课时间</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="time" name="time" disabled>
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="student" class="col-sm-2 control-label">学生姓名</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="student" name="student" disabled>
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="grade" class="col-sm-2 control-label">学生成绩</label>
                         <div class="col-sm-10">
                            <input type="number" class="form-control" id="grade" placeholder="请输入成绩" name="grade">
                         </div>
                      </div>
                  </form>
			    </div>
			    <div class="modal-footer">
				    <button type="button" class="btn onclick btn-default" data-dismiss="modal">关闭</button>
				    <button type="button" class="btn btn-primary" onclick="save()">保存</button>
			     </div>
		      </div>
	       </div>
           </div>      
    
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
	<script type="text/javascript">
	   var g_account;
	   var g_co_id;
	   //显示成绩到弹框
	   function view(course, credit, time, student, grade, account, co_id){
	      $("#mymodal").modal("toggle");
	      $("#course").val(course);
	      $("#credit").val(credit);
	      $("#time").val(time);
	      $("#student").val(student);
	      
	      if (grade != '0.0') {
	        $("#grade").val(grade);
	      }
	      g_account = account;
	      g_co_id = co_id;
	   }
	   
	   //插入成绩
	   function save() {
	      var grade = $("#grade").val();
	      if(grade.length != 0) {
	         var req="type=update_grade&account="+g_account+"&co_id="+g_co_id+"&grade="+grade;
	         var xmlhttp=createXMLHttpRequest();
             xmlhttp.open("Post", "/Web/TeacherServlet", true);
             //设置请求头
             xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
             xmlhttp.send(req);
             xmlhttp.onreadystatechange=function(){      
             if(xmlhttp.readyState==4&&xmlhttp.status==200){
                var text=xmlhttp.responseText;
                 alert(text);      
                 location.reload("tea_student.jsp");
             }
           }        
	      }else {
	        alert("没有输入成绩");
	      } 
	   }
	   
	   function desc(){
	      var co_id ="<%=session.getAttribute("co_id")%>"
	      var req="type=select_grade&co_id="+co_id;
	      console.log("g_co_id is",co_id);
	      var xmlhttp=createXMLHttpRequest();
          xmlhttp.open("Post", "/Web/TeacherServlet", true);
          //设置请求头
          xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
          xmlhttp.send(req);
          xmlhttp.onreadystatechange=function(){      
          if(xmlhttp.readyState==4&&xmlhttp.status==200){   
                window.location.href="grade_desc.jsp"
             }
           }        
	   }
	</script>
  </body>
  
</html>
