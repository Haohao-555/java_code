<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  <script type="text/javascript" src="${pageContext.request.contextPath}/util.js"></script>

  <script type="text/javascript">
		window.onload=function(){
			document.getElementById("id1").onblur=function(){
				if(this.value==""){
					alert("请输入用户名");
					this.focus();//恢复焦点
					return;
				}
				//发出异步请求
				var xhr = getXHR();
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4){
						if(xhr.status==200){
							
							document.getElementById("msg").innerHTML=xhr.responseText;
							
						}
					}
				}
				/*
				xhr.open("GET","${pageContext.request.contextPath}/servlet/ServletDemo2?username="+this.value+"&time="+new Date().getTime());
				xhr.send(null);
				*/
				
				xhr.open("POST","${pageContext.request.contextPath}/AjaxServlet?time="+new Date().getTime());
				//设置请求消息头：告知客户端提交的正文的MIME类型
				xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
				xhr.send("user="+this.value);
			}
		}
	</script>




  </head>
  
  <body>
   
  <form action="/project/Controller?type=login" method="post">
   <table align="center">
     <tr><td>管理员：</td><td><input type="text" name="user" id="id1"><span id="msg"></span></td></tr>
     <tr><td>密码：</td><td><input type="password" name="password" id="id2" ></td></tr>
     <tr><td><input type="submit" value="登录"></td><td><input type="reset" value="重置"></td></tr>
     
     
   </table>
  </form> 
  
  <h1 align="center"><a href="operate.jsp">学生数据系统</a></h1>
   
   
  </body>
</html>
