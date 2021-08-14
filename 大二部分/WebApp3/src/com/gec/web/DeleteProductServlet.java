package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Product;
import com.gec.service.ProductService;
import com.gec.service.ProductServiceImpl;

public class DeleteProductServlet extends HttpServlet {
   private ProductService productService=new ProductServiceImpl();
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	   req.setCharacterEncoding("utf-8");//请求编码
	   resp.setContentType("text/html;charset=utf-8");//响应编码
	   int id=Integer.parseInt(req.getParameter("id"));
	   try{
		   String result="删除成功";
		   int cnt=productService.del_product(id);
		   if(cnt!=1){
			    result="删除失败";
		   }
		   resp.getWriter().print(result);
	   }catch (Exception e) {
		// TODO: handle exception
		   e.printStackTrace();
	}
	}
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	   req.setCharacterEncoding("utf-8");//请求编码
	   resp.setContentType("text/html;charset=utf-8");//响应编码
	   Product product=parseProduct(req);
	   System.out.println(product.toString());
	   try{
		   String result="更新成功";
		   int i=productService.up_product(product);
		   if(i!=1){
				result="更新失败";
			}
			resp.getWriter().print(result); 
	   }catch (Exception e) {
		e.printStackTrace();
	}
	   
	}
   protected Product parseProduct(HttpServletRequest req){
	   int pro_id=Integer.parseInt(req.getParameter("pro_id"));
	   String pro_name =req.getParameter("pro_name");
	   int pro_num =Integer.parseInt(req.getParameter("pro_num"));
	   float pro_price=Float.parseFloat(req.getParameter("pro_price"));
	   String pro_type=req.getParameter("pro_type");
	   String pro_situation=req.getParameter("pro_situation");
	   String pro_info=req.getParameter("pro_info");
	   Product product=new Product();
	   product.setPro_name(pro_name);
	   product.setPro_num(pro_num);
	   product.setPro_price(pro_price);
	   product.setPro_type(pro_type);
	   product.setPro_situation(pro_situation);
	   product.setPro_info(pro_info);
	   product.setPro_id(pro_id);
	   return product;
   }
}
