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
    
    <title>My JSP 'select_teacher.jsp' starting page</title>
    
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
		        <a href="javascript:;" onclick="add_teacher()">增加教师</a>
		        <a href="AdminServlet?type=admin_register">注册账号管理</a>
          </div>
		  </div>
          <div class="right">
	         <table class="table table-hover">
                <tr>
                   <th>教师姓名 </th>
                   <th>所属院系 </th>
                   <th>担任职位</th>
                   <th>操作</th>
                </tr>
              <c:forEach items = "${applicationScope.teachers}" var="teacher" varStatus="currentStatus">        
                <tr id="${teacher.te_id}">
                   <td>${teacher.te_name}</td>
                   <td>${teacher.college}</td>
                   <td>${teacher.position}</td>
                   <td><button type="button" class="btn btn-danger" onclick="remove_teacher('${teacher.te_id}')">删除该教师</button>
                       <button type="button" class="btn btn-warning " onclick="alert_teacher('${teacher.te_id}',
                       '${teacher.te_name}','${teacher.college}','${teacher.position}')">更新该教师职位</button>
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
                          <label for="te_name" class="col-sm-2 control-label">教师姓名</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="te_name" name="te_name"  disabled="disabled">
                          </div>
                       </div>
                      <div class="form-group">
                         <label for="colleage" class="col-sm-2 control-label">所属院系</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="colleage" name="colleage"  disabled="disabled">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="position" class="col-sm-2 control-label">担任职位</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="position" placeholder="请输入担任职位" name="position">
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
	<script>
	//移除元素
	  function remove(te_id){
	     var teacher=document.getElementById(te_id);
	     teacher.remove();
	  }
	  var click_te_id=0;
	  function alert_teacher(te_id,te_name,colleage,position){
	      click_te_id=te_id;
	      $("#mymodal").modal("toggle");
	      $("#te_name").val(te_name);
	      $("#colleage").val(colleage);
	      $("#position").val(position);
	      $(".modal-title").text("更新教师职位");
	   }
	   function update_teacher(type){
	     var te_name=$("#te_name").val();
	     var colleage=$("#colleage").val();
	     var position=$("#position").val();                                                             
	     var req="type="+type+"&te_name="+te_name+"&colleage="+colleage+"&position="+position+"&te_id="+click_te_id;
	      var xmlhttp=createXMLHttpRequest();
          xmlhttp.open("Post", "/Web/AdminServlet", true);
           //设置请求头
          xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
          xmlhttp.send(req);
          xmlhttp.onreadystatechange=function(){      
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
                location.reload("select_teacher.jsp");
             }
           }        
	   }
	   function save(){
	      var title=$(".modal-title").text();
	      if(title=="更新教师职位"){
	        update_teacher("update_teacher");
	      }else if(title=="增加教师"){
	        update_teacher("add_teacher");
	      }
	   }
	   //删除教师
	 function remove_teacher(te_id){
	     var xmlhttp=createXMLHttpRequest();
         xmlhttp.open("get", "/Web/AdminServlet?type=delete_teacher&te_id="+te_id, true);         
         //(3)发送请求
         xmlhttp.send(null);//GET请求没有请求体，但也要给出null。       
         xmlhttp.onreadystatechange=function(){      
         if(xmlhttp.readyState==4&&xmlhttp.status==200){
            var text=xmlhttp.responseText;
            alert(text);      
            console.log("请求成功"); 
            remove(te_id); 
             }
           }
	 }
	 //增加教师
	 function add_teacher(){
	     $("#mymodal").modal("toggle");
	     $(".modal-title").text("增加教师");
	     $("#te_name").val("");
	     $("#colleage").val("");
	     $("#position").val("");
	     
	     $("#te_name").attr("disabled",false);
	     $("#colleage").attr("disabled",false);
	     
	     $("#te_name").attr("placeholder","请输入教师姓名");
	     $("#colleage").attr("placeholder","请输入所属院系"); 
	 }
	</script>
  </body>
</html>
