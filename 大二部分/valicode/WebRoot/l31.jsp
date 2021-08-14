<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>随机验证码</title>
	<style type="text/css">
		.code_a{
			color:#0000ff;
			font-size: 12px;
			text-decoration: none;
			cursor: pointer;
		}
		#imgCode{
			cursor: pointer;
		}
	</style>
	<script>
	   function changeCode(){
	      var imgCode=document.getElementById("imgCode");
	      //因为每次访问的图片路径都是code21，浏览器不会进行刷新。故要产生一个随机数使其路径发生改变
	      imgCode.src="code31?"+Math.random();
	   }
	</script>
  </head>
  
  <body>
    <form action="vc31" method="post">
    	<label>验证码：</label>
		<input type="text" name="inCode" id="inCode"/>
		<img src="code31" align="center" id="imgCode" onclick="changeCode()" >
		<a class="code_a" onclick="changeCode()">换一张</a><br />
    	<input type="submit" value="登录"/>
    </form>
	<div class="" style="color: red;">
		${err}
	</div>
  </body>
</html>
