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
                <a href="javascript:;" onclick="add_course()">增加课程</a>
                <a href="AdminServlet?type=select_student">查看学生信息</a>
		        <a href="AdminServlet?type=select_teacher">查看教师信息</a>
		        <a href="AdminServlet?type=admin_register">注册账号管理</a>
          </div>
		  </div>
          <div class="right">
	         <table class="table table-hover">
                <tr>
                   <th>课程名称 </th>
                   <th>课程学分 </th>
                   <th>上课时间 </th>
                   <th>授课教师</th>
                   <th>课程数量 </th>
                   <th>操作</th>
                </tr>
              <c:forEach items = "${applicationScope.a_courselist}" var="course_detail" varStatus="currentStatus">        
                <tr id="${course_detail.co_id}">
                   <td>${course_detail.course}</td>
                   <td>${course_detail.credit}</td>
                   <td>${course_detail.co_time}</td>
                   <td>${course_detail.name}</td>
                   <td>${course_detail.number}</td>
                   <td><button type="button" class="btn btn-danger" onclick="remove_course('${course_detail.co_id}')">删除课程</button>
                       <button type="button" class="btn btn-warning " onclick="alert_course('${course_detail.co_id}',
                       '${course_detail.course}','${course_detail.credit}','${course_detail.co_time}','${course_detail.name}','${course_detail.number}')">修改课程信息</button>
                   </td>
                        
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
				        <h4 class="modal-title"></h4>
			         </div>
			         
			    <div class="modal-body">
				  <form class="form-horizontal">
                       <div class="form-group">
                          <label for="course" class="col-sm-2 control-label">课程名称</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="course" placeholder="请输入课程名称"name="course" >
                          </div>
                       </div>
                      <div class="form-group">
                         <label for="credit" class="col-sm-2 control-label">课程学分</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="credit" placeholder="请输入课程学分" name="credit">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="time" class="col-sm-2 control-label">上课时间</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="time" placeholder="请输入上课时间" name="time">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="teacher" class="col-sm-2 control-label">授课教师</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="teacher" placeholder="请输入授课教师" name="teacher">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="number" class="col-sm-2 control-label">课程数量</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="number" placeholder="请输入课程数量" name="number">
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
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-transition.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-modal.js"></script>
	<script src="js/demo1.js"></script>
	
	<script>
	  var click_course_id=0; 
	  //移除元素
	  function remove(co_id){
	     var course=document.getElementById(co_id);
	     course.remove();
	  }
	  function remove_course(co_id){
	     remove(co_id);
	     var xmlhttp=createXMLHttpRequest();
         xmlhttp.open("get", "/Web/AdminServlet?type=delete_course&co_id="+co_id, true);         
         //(3)发送请求
         xmlhttp.send(null);//GET请求没有请求体，但也要给出null。       
         xmlhttp.onreadystatechange=function(){      
         if(xmlhttp.readyState==4&&xmlhttp.status==200){
            var text=xmlhttp.responseText;
            alert(text);      
            console.log("请求成功");  
             }
           }
	  }
	  //显示弹出框课程信息
	  function alert_course(co_id,course,credit,co_time,name,number){
	      click_course_id=co_id;
	      $("#mymodal").modal("toggle");
	      $("#course").val(course);
	      $("#credit").val(credit);
	      $("#time").val(co_time);
	      $("#teacher").val(name);
	      $("#number").val(number);
	      $(".modal-title").text("修改课程信息");
	  }
	  //更新课程信息
	  function update_course(type){
	      var course=$("#course").val();
	      var credit=$("#credit").val();
	      var time=$("#time").val();
	      var teacher=$("#teacher").val();
	      var number=$("#number").val();
	      var req="type="+type+"&course="+course+"&credit="+credit+"&time="+time+"&teacher="+teacher+"&number="+number+"&co_id="+click_course_id;
	      var xmlhttp=createXMLHttpRequest();
          xmlhttp.open("Post", "/Web/AdminServlet", true);
           //设置请求头
          xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
          xmlhttp.send(req);
          xmlhttp.onreadystatechange=function(){      
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
                var text=xmlhttp.responseText;
                alert(text);      
                location.reload("admin.jsp");
             }
           }        
	  }
	  
	  //保存课程信息
	  function save(){
	      var text=$(".modal-title").text();
	      if(text=="修改课程信息"){
	        update_course("update_course");
	        $("#mymodal").modal("toggle");
	      }else if(text=="请输入课程信息"){
	       update_course("add_course");
	       $("#mymodal").modal("toggle");
	      }    
	  }
	  //增加课程
	  function add_course(){
	    $("#mymodal").modal("toggle");
	    $("#course").val();
	    $("#credit").val();
	    $("#time").val();
	    $("#teacher").val();
	    $("#number").val();
	    $(".modal-title").text("请输入课程信息");
	  }
	  
	  $(function(){
        $(".onclick").click(function(){
           $("#mymodal").modal("toggle");
           
        });
      });
	</script>
	
  </body>
</html>
