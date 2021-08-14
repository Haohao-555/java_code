<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<style>
body{ margin:0px; }
</style>
<link rel="stylesheet" href="${ctxPath}/css/table.css"/>
<link rel="stylesheet" href="${ctxPath}/css/pagebar.css"/>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script>
var pgSize = 10;
function getPage(_page){
	var paras = "?pageSize="+ pgSize +"&page="+ _page;
	window.location = "${ctxPath}/User/list"+paras;
}
</script>

<div id="bar">用户列表</div>
<table id="tbl" class="table table-hover">
    <tr class="title">
          <td>用户ID</td>
          <td>用户账号</td>
          <td>用户密码</td>
          <td>用户昵称</td>
          <td>工号</td>
          <td>性别</td>
          <td>用户角色</td>
          <td>创建日期</td>
          <td>操作</td>
          </tr>    
     <c:forEach items="${svBean.list}" var="user">
     <tr>
        <td>${user.id}</td>
        <td>${user.account}</td>
        <td>${user.password}</td>
        <td>${user.nickName}</td>
        <td>${user.no}</td>
        <td>${user.sex}</td>
        <td>${user.roleName}</td>
        <td>${user.createDate}</td>
        <td>
        <a href="${ctxPath}/User/edit?id=${user.id}">修改</a>
        <a href="${ctxPath}/User/del?id=${user.id}">删除</a>
        </td>
     </tr>
     </c:forEach>
</table>
<div id="pageBar">
<input type="button" value="上一页" onclick="getPage(${svBean.prevPage});"/>
<input type="button" value="下一页" onclick="getPage(${svBean.nextPage});"/>
<input type="button" value="第一页" onclick="getPage(1);"/>
<input type="button" value="最后页" onclick="getPage(${svBean.totalPage});"/>
<input type="button" value="跳转到" onclick="gotoPage();"/>
<input type="text" id="reqPage"/>
<label>当前页：</label>
<span id="spPage">0</span>
<label>总页数:</label>
<span id="spTotalPage">0</span>
</div>






