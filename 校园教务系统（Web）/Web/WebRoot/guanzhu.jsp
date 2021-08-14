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
    
    <title>My JSP 'guanzhu.jsp' starting page</title>
    
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
  <div class="head">
        <h1 style="margin-bottom:20px">数字校园-学生平台</h1>
        <a href="course.jsp" onclick="save()">课程信息</a>
         <a href="guanzhu.jsp"  style="color:#5dc0de">我的关注</a>
        <a href="UserServlet?course_type=st_full_course" onclick="save()">我的已选</a>
        <a href="javascript:;" id="my" onclick="my_detail('${applicationScope.my}')">我的信息</a>
       
    </div>
  
    <table class="table table-hover">
       <tr>
         <th>课程名称 </th>
         <th>课程学分 </th>
         <th>上课地点 </th>
         <th>授课教师</th>
         <th>课程余量 </th>
         <th>操作</th>
       </tr>
        <c:forEach items = "${applicationScope.courselist}" var="course_detail" varStatus="currentStatus">        
         <tr id="${course_detail.co_id}"> 
             <td>${course_detail.course}</td>
             <td>${course_detail.credit}</td>
             <td>${course_detail.co_time}</td>
             <td>${course_detail.name}</td>
             <td>${course_detail.number}</td> 
             <td><button type="button" class="btn btn-info" onclick="emit('${course_detail.co_id}')">提交关注</button>
                 <button type="button" class="btn btn-danger" onclick="cancel_course('${course_detail.co_id}')">取消关注</button>
             </td> 
          </tr>
        </c:forEach>
    </table>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/demo1.js"></script>
  </body>
  
</html>

<script>
    //获取关注的课程id
    var str=sessionStorage.getItem("clickarray"); 
    //获取所有课程id
    var course_ids=<%=application.getAttribute("courseids")%>
    var clickarray=new Array();//关注课程的id数组
    console.log("课程id为"+course_ids);
    ///////////////////////////////////////////////////////
    if(isObj(str)==true){
       console.log("没有关注课程");
    }else{//有关注课程（删除掉没有被关注的课程）
      clickarray = str.split(',');//将其转为数组 
    }
    
     //移除掉关注的课程
      for(var i=0;i<clickarray.length;i++){
         var index=course_ids.indexOf(parseInt(clickarray[i]));
         console.log("删除课程id为"+clickarray[i]+"下标为"+index);
         course_ids.splice(index,1);
      }
      console.log("要删除的数组为"+course_ids);
      //删除掉没关注的课程
      for(var j=0;j<course_ids.length;j++){
         //console.log("删除的下标为"+course_ids[j]);
         delete_course(course_ids[j]);
      }
    ///////////////////////////////////////////////////////
    
    //课程信息
    function save(){
       sessionStorage.setItem("clickarray",clickarray);
     }
    
    //删除没有被关注的课程
    function delete_course(co_id){
      //console.log("delete_course要删除的下标为"+co_id);
      var course=document.getElementById(co_id);
      console.log(course);
      course.remove();
    }
    
     //取消关注
    function cancel_course(co_id){
     
      delete_course(co_id);
      var index =clickarray.indexOf(co_id);
      clickarray.splice(index,1);
    }
    
    //提交关注
    function emit(co_id){
      var my=<%=application.getAttribute("my")%>
      //console.log("课程id为"+co_id+"课程在数组的下标为"+index);
      if(my==true){//已经绑定信息
          //(1)获取异步对象
          var xmlhttp=createXMLHttpRequest();
          //(2)打开与云服务器的连接 三个参数 指定请求方法 指定请求的URL 指定是否为异步通信
          xmlhttp.open("GET", "/Web/UserServlet?course_type=addcourse&co_id="+co_id, true);
          //(3)发送请求
          xmlhttp.send(null);//GET请求没有请求体，但也要给出null。
          //(4)给异步对象的onreadystatechange事件注册监听
          xmlhttp.onreadystatechange=function(){//当xmlhttp的状态发送变化时执行
          //双重判断 xmlhttp的状态为4(服务器响应结束)，以及服务器响应的状态码为200(响应成功)
          if(xmlhttp.readyState==4&&xmlhttp.status==200){
          //获取服务器响应的内容
          var text=xmlhttp.responseText;
              alert(text);
              cancel_course(co_id);
             
            }
          };
         }else{
           alert("请先绑定个人信息后才能选课");
           window.location.href="my.jsp";
         }
       };
</script>
