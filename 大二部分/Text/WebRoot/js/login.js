 //get����
function get() {
    //��������	
	var xhr=new XMLHttpRequest();
	//����������(get����д��URL����)
	xhr.open('get','../Loginservler?name=rose');
	//������
	xhr.send(null);
	//�ص�����
	xhr.onload=function(){
		//��ȡ����
		var text=xhr.responseText;
		document.getElementById("1").value=text;
	}
	}
//post����
function post(){
	//��������
	var xhr=new XMLHttpRequest();
	//����������
	xhr.open('post', '../Loginservler');
	//��������ͷ
	xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	//������������
	xhr.send('name=rose');
	//�ص�����
	xhr.onload=function(){
		//��ȡ����
		var text=xhr.responseText;
		document.getElementById("2").value=text;
	}
	
}