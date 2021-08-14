//宽度、高度、字符大小、字符集
var w=80;
var h=24;
var fontsize=h-6;
var str ="0123456789ABCDEF"

//随机生成最大值不超过max的随机数
function randInt(max){
	return Math.floor(Math.random()*100000%max);
}

//生成随机长度的字符串验证码
function randCode(len){
	if(len<4){
		len=4;
	}
	var code="";
	for(var i=0;i<len;i++){
		code+=str.charAt(randInt(str.length));
		}
		return code;
}

//生成随机颜色
function randColor(){
	var r=randInt(256);
	var g=randInt(256);
	var b=randInt(256);
	return "rgb("+r+","+g+","+b+")"
}

//生成随机图片
function drawCode(canvas){
	var valicode=randCode(4);
	w=5+fontsize*valicode.length;
	
	if(canvas!=null && canvas.getContext && canvas.getContext("2d")){
		//设置显示区域大小
		canvas.style.width=w;
		//设置画板的宽度和高度
		canvas.setAttribute("width",w);
		canvas.setAttribute("height",h);
		//得到画笔
		var pen=canvas.getContext("2d");
		//绘制背景
		pen.fillStyle="rgb(255,255,255)";
		pen.fillRect(0,0,h,w);
		//设置水平线位置
		pen.textBaseline="top";
		//绘制内容
		for(var i=0;i<valicode.length;i++){
			pen.fillStyle=randColor();
			pen.font="bold"+(fontsize+randInt(3))+"px 微软雅黑";
			pen.fillText(valicode.charAt(i),5+fontsize*i,randInt(5));
		}
		//绘制噪音线
		for(var i=0;i<2;i++){
			pen.moveTo(randInt(w)/2,randInt(h));//设置起点
			pen.lineTo(randInt(w),randInt(h));//设置终点
			pen.strokeStyle=randColor();
			pen.lineWidth=2;//设置粗细
			pen.stroke();//绘制
		}
		return valicode;
	}
}
