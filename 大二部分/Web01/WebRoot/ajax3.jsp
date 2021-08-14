<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
     function createXMLHttpRequest(){
       try{
         return new XMLHttpRequest();
       }catch(e){
         try{
           return ActvieXObject("Msxml2.XMLHTTP");
         }catch(e){
           try{
            return ActvieXObject("Microsoft.XMLHTTP");
           }catch(e){
              alert("你用的是什么浏览器");
              throw e;
           }
         }
       }
 }
         window.onload=function(){
         //获取异步对象
          var xmlhttp=createXMLHttpRequest();
       //打开异步对象
          xmlhttp.open("GET","/Web01/Cservlet",true);
       //发送请求   
          xmlhttp.send(null);
          xmlhttp.onreadystatechange=function(){
           if(xmlhttp.readyState==4&&xmlhttp.status==200){
                 var doc=xmlhttp.responseXML;
                 //查询文档下名为student的所有元素，得到数组，再取得下标为0
                 var ele=doc.getElementsByTagName("student");
                 var name;
                 var number;
                 var age;
                 if(window.addEventListener){
                   name=ele.getElementsByTagName("name")[0].textContent;//其他浏览器
                   //number=ele.getElementsByTagName("number")[0].textContent;
                   age=ele.getElementsByTagName("age")[0].textContent;
                 }else{
                   name=ele.getElementsByTagName("name")[0].text;//IE浏览器
                   //number=ele.getElementsByTagName("number")[0].text;
                   age=ele.getElementsByTagName("age")[0].text;
                 }
                
                var text=name+" "+age;
                document.getElementById("h1").innerHTML=text;
                 
           }
            
          };
          
       
     };
 
</script>
<body>
    <h1 id="h1">1</h1>
</body>
</html>