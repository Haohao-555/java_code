<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
  <head>
  
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
     <link rel="stylesheet" href="css/adduser.css">
    <style>
      h1{
         font-size:30px;
         line-height:30px;
         font-weight:800;
         font:Microsoft YaHei;
      }
    </style>
  </head>  
 <body>
   <div class="dcontainer">
      <div class="head">
        <h1 class="text-primary">新增产品</h1>
      </div>
      <form class="form-horizontal" action="${ctxPath}/Product/addProduct" method="post" id="addform">
        <!-- 产品名称 -->
         <div class="form-group">
            <label for="pro_name" class="col-sm-2 control-label">产品名称:</label>
              <div class="col-sm-10">
                 <input type="text" class="form-control" id="pro_name" name="pro_name" placeholder="请输入产品名称">
               </div>
          </div>
          <!-- 产品数量 -->
         <div class="form-group">
            <label for="pro_num" class="col-sm-2 control-label">产品数量:</label>
              <div class="col-sm-10">
                 <input type="text" class="form-control" id="pro_num" name="pro_num" placeholder="请输入产品数量">
               </div>
          </div>
           <!-- 产品价格-->
         <div class="form-group">
            <label for="pro_price" class="col-sm-2 control-label">产品价格:</label>
              <div class="col-sm-10">
                 <input type="text" class="form-control" id="pro_price" name="pro_price" placeholder="请输入产品价格">
               </div>
          </div>
          <!-- 产品类型-->
          <div class="form-group">
             <label  for="pro_type" class="col-sm-2 control-label">产品类型:</label>
             <div class="col-sm-10">
               <select class="form-control" id="pro_type" name="pro_type" style="padding-left:6px;">
                 <option value="0" style="color:#999;">请选择产品类型</option>
                 <option value="日常用品">日常用品</option>
                 <option value="饮品类">饮品类</option>
                 <option value="即食小吃">即食小吃</option>
                 <option value="冲饮食品">冲饮食品</option>
                 <option value="茶叶类">茶叶类</option>
                 <option value="面食类">面食类</option>
                 <option value="饼干类">饼干类</option>
               </select>
             </div>
          </div>
          <!-- 产品产地 -->
          <div class="form-group">
             <label  for="pro_situation" class="col-sm-2 control-label">产品产地:</label>
             <div class="col-sm-10">
               <input type="text" class="form-control" id="pro_situation" name="pro_situation" placeholder="请输入产品产地">
             </div>
          </div>
          <!-- 产品描述-->
           <div class="form-group">
             <label  for="pro_info" class="col-sm-2 control-label">产品描述:</label>
             <div class="col-sm-10">
               <textarea class="form-control" rows="2" name="pro_info" id="pro_info" style="resize: none;" placeholder="请输入产品介绍"></textarea>
             </div>
          </div>
            <!-- 产品单位 -->
          <div class="form-group">
             <label  for="unit" class="col-sm-2 control-label">产品单位:</label>
             <div class="col-sm-10">
               <input type="text" class="form-control" id="unit" name="unit" placeholder="请输入产品单位">
             </div>
          </div>
            <!-- 产品规格 -->
          <div class="form-group">
             <label  for="specification" class="col-sm-2 control-label">产品规格:</label>
             <div class="col-sm-10">
               <input type="text" class="form-control" id="specification" name="specification" placeholder="请输入产品规格">
             </div>
          </div>
            <!-- 产品折扣 -->
           <div class="form-group">
              <label  for="discountRate" class="col-sm-2 control-label">产品折扣:</label>
             <div class="col-sm-10">
               <input type="text" class="form-control" id="discountRate" name="discountRate" placeholder="请输入产品折扣">
             </div>
           </div>
             <!-- 确定新增产品 -->
            <div class="form-group" >
               <div  style="padding:20px">
                  <button type="submit" class="btn btn-primary btn-lg btn-block" style="background-color:#28333f;border-color:#28333f">确定新增产品</button>
               </div>
            </div>
      </form>
   </div>
   
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/jquery.form.js"></script>
    <script>
       $(function(){
         $("#addform").ajaxForm(function(data){
            if(data=="增加产品成功"){
              window.location="${ctxPath}/Product/list";
            }else if(data=="产品已经存在"){
              alert("产品已经存在");
            }
         })
       })
    </script>
	
 </body>
</html>

