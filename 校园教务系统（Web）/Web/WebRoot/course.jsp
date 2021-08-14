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
    <div class="head">
        <h1 style="margin-bottom:20px">数字校园-学生平台</h1>
        <a style="color:#5dc0de">课程信息</a>
        <a href="guanzhu.jsp" onclick="guanzhu()">我的关注</a>
        <a href="UserServlet?course_type=st_full_course">我的已选</a>
        <a href="javascript:;" id="my" onclick="my_detail('${applicationScope.my}')">我的信息</a>
    </div>
    <table class="table table-hover">
       <tr>
         <th>序号 </th>
         <th>课程名称 </th>
         <th>课程学分 </th>
         <th>上课时间 </th>
         <th>授课教师</th>
         <th>课程余量 </th>
         <th>操作</th>
       </tr>
        <c:forEach items = "${applicationScope.courselist}" var="course_detail" varStatus="currentStatus">        
         <tr>
             <td>${currentStatus.index+1}</td>
             <td>${course_detail.course}</td>
             <td>${course_detail.credit}</td>
             <td>${course_detail.co_time}</td>
             <td>${course_detail.name}</td>
             <td>${course_detail.number}</td>
             <td><button type="button" id="${course_detail.co_id}" class="btn btn-info" onclick="btn('${course_detail.co_id}')">关注</button>
                 <button type="button" class="btn  btn-success">刷新余量</button>
             </td>     
          </tr>
        </c:forEach>
    </table>
       <h5 style="margin:0 auto">已经到底了</h5>
    
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
	<script>
    //更改URL并不刷新网页
    //window.history.replaceState({}, 0,  "/Web/course.jsp");
    
    //读取会话（关注的课程）
    var str=sessionStorage.getItem("clickarray"); 
    var clickarray=new Array();//保存关注的课程
    
    ///////////////////////////////////////////////////
    if(isObj(str)){
       console.log("没有关注课程");
    }else{//不为空时，将数组中对应课程id的按钮设置为禁止
       clickarray = str.split(','); //将其转为数组
       console.log("关注的课程id为"+clickarray);
       for(var i=0;i<clickarray.length;i++){
          disabled_btn(clickarray[i]);
       }
    }
    /////////////////////////////////////////////
    
    
    //关注按钮
    function btn(co_id){
       disabled_btn(co_id);
       clickarray[clickarray.length]=co_id;
    }
    //将按钮设置为禁止状态
   function disabled_btn(co_id){
        var btn=document.getElementById(co_id);
        btn.setAttribute("disabled","disabled");
        btn.innerHTML="已关注";
     }
    
    //我的关注
    function guanzhu(){
       //将点击的课程保存到会话中
       sessionStorage.setItem("clickarray",clickarray);
    }
   
</script>
  </body>
  
</html>

