<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'productlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
     <style>
        thead{
          background-color:#1c2935;
          color:#fff;
        }
        .dcontainer{
           margin-left:80px;
           text-align:center;
        }
        h1{
          margin-bottom:20px;
          font-size:30px;
          font-weight:800;
          font:Microsoft YaHei;
        }
     </style>
  </head>
  
  <body>
     <div class="dcontainer">
        <h1 class="text-primary">产品列表</h1>
        <table class="table table-hover">
       <thead>
         <th>ID</th>
         <th>名称</th>
         <th>类型 </th>
         <th>数量</th>
         <th>价格 </th>
         <th>单位</th>
         <th>规格 </th>
         <th>产地</th>
         <th>折扣</th>
         <th>会员价</th>
         <th>创建日期 </th>
         <th>操作</th>
       </thead>
        <c:forEach items = "${product_svBean.list}" var="product" varStatus="currentStatus">        
         <tr id="${product.pro_id}"> 
         
             <td>${product.pro_id}</td>
             <td>${product.pro_name}</td>
             <td>${product.pro_type}</td>
             <td>${product.pro_num}</td>
             <td>${product.pro_price}</td>
             <td>${product.unit}</td>
              <td>${product.specification}</td>
             <td>${product.pro_situation}</td>
             <td>${product.discountRate}</td>
             <td>${product.memberPrice}</td>
             <td>${product.createDate}</td>
             <td><button type="button" class="btn btn-info" style="background-color:#28333f;border-color:#28333f" onclick="show_product
             ('${product.pro_name}','${product.pro_num}','${product.pro_price}','${product.pro_type}','${product.pro_situation}','${product.pro_info}','${product.pro_id}')">更新产品信息</button>
                 <button type="button" class="btn btn-warning" onclick="product_info('${product.pro_info}')">查看产品介绍</button>
                 <button type="button" class="btn btn-danger" onclick="delete_product('${product.pro_id}')">删除产品</button>
             </td> 
          </tr>
        </c:forEach>
    </table>
      <span>当前页数为${product_svBean.page}</span>
      <span>总页数为${product_svBean.totalPage}</span>
      <div class="container">            
         <ul class="pagination">
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/Product/list?pageSize=8&page=${product_svBean.prevPage}">上一页</a></li>
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/Product/list?pageSize=8&page=1">第一页</a></li>
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/Product/list?pageSize=8&page=${product_svBean.totalPage}">最后页</a></li>
           <li class="page-item"><a class="page-link"  style="color:#28333f;" href="${ctxPath}/Product/list?pageSize=8&page=${product_svBean.nextPage}">下一页</a></li>
           <li class="page-item"></li>
         </ul>
       </div>
     </div>
     <!-- 更新产品信息 -->
      <div class="modal fade" id="mymodal_01">
           <div class="modal-dialog">
               <div class="modal-content">
                    <div class="modal-header">
				      <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title">更新产品信息</h4>
			         </div>
			         
			    <div class="modal-body">
				  <form class="form-horizontal" action="" method="post">
                       <div class="form-group">
                          <label for="pro_name" class="col-sm-2 control-label">产品名称</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="pro_name" placeholder="请输入产品名称"name="pro_name">
                          </div>
                       </div>
                      <div class="form-group">
                         <label for="pro_num" class="col-sm-2 control-label">产品数量</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="pro_num" placeholder="请输入产品数量" name="pro_num">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="pro_price" class="col-sm-2 control-label">产品价格</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="pro_price" placeholder="请输入产品价格" name="pro_price">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="pro_type" class="col-sm-2 control-label">产品类型</label>
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
                      <div class="form-group">
                         <label for="pro_situation" class="col-sm-2 control-label">产品产地</label>
                         <div class="col-sm-10">
                            <input type="text" class="form-control" id="pro_situation" placeholder="请输入产品产地" name="pro_situation">
                         </div>
                      </div>
                      <div class="form-group">
                         <label for="pro_info" class="col-sm-2 control-label">产品描述</label>
                         <div class="col-sm-10">
                            <textarea class="form-control" rows="3" name="pro_info" id="pro_info" style="resize: none;" placeholder="请输入产品描述"></textarea>
                         </div>
                      </div>
                  </form>
			    </div>
			    <div class="modal-footer">
				    <button type="button" class="btn onclick btn-default" data-dismiss="modal">关闭</button>
				    <button type="button" class="btn btn-primary" onclick="update_product()">保存</button>
			     </div>
		      </div>
	       </div>
           </div>
           
            <!--查看产品信息 -->
      <div class="modal fade" id="mymodal_02">
           <div class="modal-dialog">
               <div class="modal-content">
                    <div class="modal-header">
				      <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title">产品描述</h4>
			         </div> 
			         <div class="modal-body">
                         <label for="spro_info" class="col-sm-2 control-label">产品描述</label>
                         <textarea class="form-control" rows="3" name="spro_info" id="spro_info" style="resize: none;" disabled="disabled"></textarea>
			         </div>
			         <div class="modal-footer">
				         <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			         </div>
		        </div>
	          </div>
           </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="js/ajax_d.js"></script>
     <script>
       var click_id;
     //显示信息
        function show_product(pro_name,pro_num,pro_price,pro_type,pro_situation,pro_info,pro_id){
          $("#mymodal_01").modal("toggle");
          click_id=pro_id;
          $("#pro_name").val(pro_name);
          $("#pro_num").val(pro_num);
          $("#pro_price").val(pro_price);
          $("#pro_type").val(pro_type);
          $("#pro_situation").val(pro_situation);
          $("#pro_info").val(pro_info);
        }
        function update_product(){
          $("#mymodal_01").modal("toggle");
          //获取数据
          var pro_name= $("#pro_name").val();
          var pro_num= $("#pro_num").val();
          var pro_price= $("#pro_price").val();
          var pro_type= $("#pro_type").val();
          var pro_situation= $("#pro_situation").val();
          var pro_info= $("#pro_info").val();
          var req="pro_name="+pro_name+"&pro_num="+pro_num+"&pro_price="+pro_price+"&pro_type="+pro_type+"&pro_situation="+pro_situation+"&pro_info="+pro_info+"&pro_id="+click_id;
          var xmlhttp=createXMLHttpRequest();
          xmlhttp.open("Post", "${ctxPath}/Product/del", true);
          xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");          
          xmlhttp.send(req);       
          xmlhttp.onreadystatechange=function(){      
          if(xmlhttp.readyState==4&&xmlhttp.status==200){      
               var text=xmlhttp.responseText; 
               alert(text);
               window.location="${ctxPath}/Product/list"; 
             }
           };
        }
        function product_info(info){
            $("#mymodal_02").modal("toggle");
           $("#spro_info").val(info);
        }
        function delete_product(pro_id){
            var xmlhttp=createXMLHttpRequest();
           xmlhttp.open("GET", "${ctxPath}/Product/del?id="+pro_id, true);
           xmlhttp.send(null);
           xmlhttp.onreadystatechange=function(){
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
              var text=xmlhttp.responseText;
              if(text=="删除成功"){
               document.getElementById(pro_id).remove();
              }
              alert(text);      
            }
          };  
        }
        
     </script>
    
  </body>
</html>
