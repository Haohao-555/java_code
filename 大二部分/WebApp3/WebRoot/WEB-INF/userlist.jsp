<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
     <style>
        thead{
          background-color:#1c2935;
          color:#fff;
        }
        .dcontainer{
           margin-left:80px;
           text-align:center;
        }
        h1{
          margin-bottom:20px;
          font-size:30px;
          font-weight:800;
          font:Microsoft YaHei;
        }
     </style>
     
  </head>
  
  <body>
     <div class="dcontainer">
        <h1 class="text-primary">用户列表</h1>
        <table class="table table-hover">
       <thead>
         <th>用户ID</th>
         <th>用户账号</th>
         <th>用户密码</th>
         <th>用户昵称 </th>
         <th>工号 </th>
         <th>性别</th>
         <th>用户角色 </th>
         <th>创建日期 </th>
         <th>操作</th>
       </thead>
        <c:forEach items = "${user_svBean.list}" var="user" varStatus="currentStatus">        
         <tr id="${user.id}"> 
             <td>${user.id}</td>
             <td>${user.account}</td>
             <td>${user.password}</td>
             <td>${user.nickName}</td>
             <td>${user.no}</td>
             <td>${user.sex}</td>
             <td>${user.roleName}</td> 
             <td>${user.createDate}</td>
             <td><button type="button" class="btn btn-info" style="background-color:#28333f;border-color:#28333f" onclick="show
             ('${user.account}','${user.nickName}','${user.sex}','${user.roleName}','${user.password}','${user.id}')">更新用户信息</button>
                 <button type="button" class="btn btn-danger" onclick="delete_user('${user.id}')">删除用户</button>
             </td> 
          </tr>
        </c:forEach>
    </table>
      <span>当前页数为${user_svBean.page}</span>
      <span>总页数为${user_svBean.totalPage}</span>
      <div class="container">            
         <ul class="pagination">
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/User/list?pageSize=8&page=${user_svBean.prevPage}">上一页</a></li>
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/User/list?pageSize=8&page=1">第一页</a></li>
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/User/list?pageSize=8&page=${user_svBean.totalPage}">最后页</a></li>
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/User/list?pageSize=8&page=${user_svBean.nextPage}">下一页</a></li>
           <li class="page-item"></li>
         </ul>
       </div>
     </div>
      <!-- 更新用户信息 -->
      <div class="modal fade" id="mymodal_01">
           <div class="modal-dialog">
               <div class="modal-content">
                    <div class="modal-header">
				      <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title">更新用户信息</h4>
			         </div>
			         
			    <div class="modal-body">
				  <!-- 添加主要内容 -->
				  <form class="form-horizontal" action="" method="post">
                       <div class="form-group">
                          <label for="account" class="col-sm-2 control-label">用户账号:</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="account" placeholder="请输入账号"name="account" disabled="disabled">
                          </div>
                       </div>
                       
                      <div class="form-group">
                         <label for="nickname" class="col-sm-2 control-label">用户昵称:</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="nickname" placeholder="请输入昵称" name="nickname">
                         </div>
                      </div>
                      
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
                      
                       <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">用户密码:</label>
                            <div class="col-sm-10">
                               <input type="text" class="form-control" id="password" name="password" placeholder="请输入密码">
                            </div>
                       </div>
                  </form>
			    </div>
			    <div class="modal-footer">
				    <button type="button" class="btn onclick btn-default" data-dismiss="modal">关闭</button>
				    <button type="button" class="btn btn-primary" onclick="update_user()">保存</button>
			     </div>
		      </div>
	       </div>
           </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="./js/ajax_d.js"></script>
	<script>
	  var click_id;
	  
	  function show(account,nickname,sex,roleName,password,id){
	    $("#mymodal_01").modal("toggle");
	    $("#account").val(account);
	    $("#nickname").val(nickname);
	    $("#sex").val(sex);
	    $("#password").val(password);
	    if(roleName=="区域经理"){
	       $("#roleId").val("r01");
	    }else if(roleName=="门店店长") {
	      $("#roleId").val("r02");
	    }else if(roleName=="门店销售"){
	       $("#roleId").val("r03");
	    } 
	    click_id=id;  
	  }
	  function update_user(){
	    var account=$("#account").val();
	    var nickname=$("#nickname").val();
	    var sex=$("#sex").val();
	    var password=$("#password").val();
	    var roleId=$("#roleId").val();
	    $("#mymodal_01").modal("toggle");
	    var xmlhttp=createXMLHttpRequest();
	    var req="account="+account+"&nickname="+nickname+"&sex="+sex+"&password="+password+"&roleId="+roleId+"&user_id="+click_id;
	    var xmlhttp=createXMLHttpRequest();
        xmlhttp.open("Post", "${ctxPath}/User/del", true);
        //设置请求头
        xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
        xmlhttp.send(req);       
        xmlhttp.onreadystatechange=function(){      
        if(xmlhttp.readyState==4&&xmlhttp.status==200){      
           var text=xmlhttp.responseText; 
           alert(text);
           window.location="${ctxPath}/User/list"; 
            }
          };
	  }
	  function remove_user(user_id){
	     document.getElementById(user_id).remove();
	  }
	  function delete_user(user_id){
           var xmlhttp=createXMLHttpRequest();
           xmlhttp.open("GET", "${ctxPath}/User/del?id="+user_id, true);
           xmlhttp.send(null);
           xmlhttp.onreadystatechange=function(){
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
              var text=xmlhttp.responseText;
              if(text=="删除成功"){
                remove_user(user_id);
              }
              alert(text);      
            }
          };
	  }
	</script>
  </body>
</html>





