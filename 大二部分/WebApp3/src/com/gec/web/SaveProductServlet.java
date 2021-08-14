package com.gec.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Product;
import com.gec.service.ProductService;
import com.gec.service.ProductServiceImpl;

public class SaveProductServlet extends HttpServlet{
    private ProductService productService=new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=utf-8");//响应编码
    	String ctxPath = req.getContextPath();
    	Product product=new Product(req);
    	//System.out.println(product.toString());
    	try{
    		int cnt=productService.saveProduct(product);
    		if(cnt==2){
    			resp.getWriter().print("增加产品成功");
    			//resp.sendRedirect(ctxPath +"/Product/list");
    		}else if(cnt==1){
    			resp.getWriter().print("产品已经存在");
    			//resp.sendRedirect(ctxPath + "/addproduct.jsp");
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
		}
    }
   
    
}
