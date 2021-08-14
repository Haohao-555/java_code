<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
  
</script>
</head>
<body>
   <button id="btn"></button>
</body>
</html>