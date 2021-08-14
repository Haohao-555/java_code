 //get请求
function get() {
    //创建对象	
	var xhr=new XMLHttpRequest();
	//设置请求行(get请求写在URL后面)
	xhr.open('get','../Loginservler?name=rose');
	//请求发送
	xhr.send(null);
	//回调函数
	xhr.onload=function(){
		//获取数据
		var text=xhr.responseText;
		document.getElementById("1").value=text;
	}
	}
//post请求
function post(){
	//创建对象
	var xhr=new XMLHttpRequest();
	//设置请求行
	xhr.open('post', '../Loginservler');
	//设置请求头
	xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	//发送请求主体
	xhr.send('name=rose');
	//回调函数
	xhr.onload=function(){
		//获取数据
		var text=xhr.responseText;
		document.getElementById("2").value=text;
	}
	
}