<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<style>
body{ margin:0px;}
#nav #topic{
	width:350px; font-size:25px;
	text-align:left;
	text-indent:0.3em;
}
#blk_right{
	width:auto; height:650px;
	background:white; padding:0px;
}
iframe{
	width:1294px; height:650px;
	border:none; margin:0px;
}
</style>
<link rel="stylesheet" href="${ctxPath}/css/bar.css" />
<link rel="stylesheet" href="${ctxPath}/css/left.css" />
<script src="${ctxPath}/js/jquery-1.10.2.min.js"></script>
<script src="${ctxPath}/js/menu.js"></script>
<script>
$( init );    //文档加载完自动执行该函数
function func(){
	flag = false;
}
var $last = undefined;

function gotoURL( obj, page ){
	if( $last ){
		$last.css(
			{background:'#4B5763',color:'#F2F2F2'}
		);
	}
	var $obj = $( obj );
	$last = $obj;
	$obj.css(
		{background:'#687480',color:'yellow'}
	);	
	var win = document.getElementById( "win" );
	win.src = '${ctxPath}'+ page;
}
</script>
<ul id="nav" >
	<li id="topic">便利店销售管理系统</li>	
</ul>
<div style="clear:float;"></div>
<div style="width:1950px;">
	<div id="blk_left" ">
	<ul id="left">
		<li class="item">
			<div class="title">用户管理</div>
			<ul style="display:none;">
				<li onclick="gotoURL(this,'/User/list');">用户列表</li>
				<li onclick="gotoURL(this,'/adduser.jsp');">新增用户</li>				
			</ul>
		</li>
		<li class="item">
			<div class="title">产品管理</div>
			<ul style="display:none;">
				<li onclick="gotoURL(this,'/Product/list');">产品列表</li>
				<li onclick="gotoURL(this,'/addproduct.jsp');">新增产品</li>				
			</ul>
		</li>
	</ul>
	</div>
	<div id="blk_right">
		<iframe id="win" src="index.html"></iframe>
	</div>
</div>


