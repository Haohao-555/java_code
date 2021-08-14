function getxml(){
	var xhr=new XMLHttpRequest();
	xhr.open('get', "../Servlet");
	xhr.send(null);
	xhr.onreadystatechange=function(){
		if(this.status==200&&this.readyState==4){
           getxml(this);
	}
  }
}
function getxml(x){
	var i;
	var xmlDoc=x.responseXML;
	var table="<tr><th>歌手</th><th>曲目</th></tr>";
	  var x = xmlDoc.getElementsByTagName("dance");
	  for (i = 0; i <x.length; i++) { 
	    table += "<tr><td>" +
	    x[i].getElementsByTagName("singer")[0].childNodes[0].nodeValue +
	    "</td><td>" +
	    x[i].getElementsByTagName("dancename")[0].childNodes[0].nodeValue +
	    "</td></tr>";
	  }
	  document.getElementById("demo").innerHTML = table;
}
