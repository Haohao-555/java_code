function createXMLHttpRequest() {
	try {
		return new XMLHttpRequest();
	} catch (e) {
		try {
			return ActvieXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				return ActvieXObject("Microsoft.XMLHTTP");
			} catch (e) {
				throw e;
			}
		}
	}
}
//我的信息
function my_detail(my) {
	var obj = document.getElementById("my");
	if (my == "true") {
		obj.href = "my_message.jsp";
	} else {
		alert("请先绑定个人信息");
		obj.href = "my.jsp";
	}
}

//判断是否为空
function isObj(obj) {
	for (var item in obj) {
		return false;
	}
	return true;
}
//删除没有被关注的课程
function delete_course(co_id){
   var obj=document.getElementById(co_id).remove();
}

//删除数组某一个特定的值ֵ
Array.prototype.remove = function(i) {
	//var i = this.indexOf(value);
	console.log("remove被调用");
	console.log("要删除的下标为"+i);
	this.splice(i, 1);
}

//返回
function back() {
	window.history.go(-1);
}

function mask(){
   var obj=document.getElementById("mask");
   obj.style.visibility="hidden";
}

function icon(){
   var obj=document.getElementById("mask");
   obj.style.visibility="visible";
}


