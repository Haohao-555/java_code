<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
       table{
       border :2px solid #666;
       border-collapse:collapse;
       margin:0 auto;
       }
       table th{
         border:2px solid #666;
         background:orange;
       }
       table td{
         border:1px solid #666;
         padding:10px 15px;
         text-index:0.5em;
       }
    </style>
    <table>
       <tr>
         <th>产品编号 </th>
         <th>产品名称 </th>
         <th>产品描述 </th>
         <th>供应商 </th>
         <th>价格</th>
         <th>销售数量 </th>
       </tr>
       <c:forEach items = "${list}" var="p">        
         <tr>
             <td>${p.id}</td>
             <td>${p.productName}</td>
             <td>${p.detail}</td>
             <td>${p.provider}</td>
             <td>${p.price}</td>
             <td>${p.sellTimes}</td>
          </tr>
        </c:forEach>
    </table>
