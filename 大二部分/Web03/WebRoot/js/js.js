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
 //提交前检查
 function judge(){
   var d1=document.getElementById("d1").innerHTML;
   var d2=document.getElementById("d2").innerHTML;
   var d3=document.getElementById("d3").innerHTML;
   if(d1.length!=0||d2.length!=0||d3.length!=0){
   	  alert("您输入的数据有错误,请重新输入");
      return false;
   }
   return true;
 }
 //邮箱判断
 function isemail(){
    var email=document.getElementById("email").value;
    var regex=/^\w+@[a-z0-9]+\.[cn|com|cn.com|net|gov]+$/i;
    if(!regex.test(email)){
      document.getElementById("d3").innerHTML="邮箱格式错误";
    }else{
      document.getElementById("d3").innerHTML="";
    }
 }
 //密码判断
 function ispassword(){
 	 document.getElementById("d2").innerHTML="";
 	var t1="";
 	var t2="";
    var p1=document.getElementById("p1").value;
    var p2=document.getElementById("p2").value;
    console.log("p1"+p1+"p2:"+p2);
    if(p1!=p2||p1.length<=8){
      document.getElementById("d2").innerHTML="密码长度不能低于8位"+" "+"密码不一致";  
    }else{
      document.getElementById("d2").innerHTML="";
    }
 }
 //注册名判断
 function isusername(){
 	 var flag;
 	 var name=document.getElementById("name").value;
	 //创建异步对象
	 var xmlhttp=createXMLHttpRequest();
	 //设置请求参数
	 xmlhttp.open('post','../Servlet?method=isusername',true);
	 //设置请求头
	 xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	 //发送请求
	 var str="name="+name;
	 xmlhttp.send(str);
	 xmlhttp.onreadystatechange=function(){
	 if(xmlhttp.readyState==4&&xmlhttp.status==200){
         var text=xmlhttp.responseText;
         var h4=document.getElementById("d1").innerHTML=text;
	 };
	}
}

