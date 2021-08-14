package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.PageBean;
import com.gec.service.ProductService;
import com.gec.service.ProductServiceImpl;

public class ProductListServlet extends BaseController{
	private ProductService productService=new ProductServiceImpl();
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	

}
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	   //{1}解析并得到 PageBean 对象。
	   //System.out.println("被调用");
	  PageBean pBean=parsePageBean(req);
	  PageBean svBean=null;
	  try{
		//{2}调用service获取数据。
		svBean=productService.getProductList(pBean);
		//System.out.println(svBean.toString());
		//{3}设置到请求域。
		 req.setAttribute("product_svBean", svBean);
	  }catch (Exception e) {
		//{4}异常处理。 
		e.printStackTrace();
		req.setAttribute("errorCode", 302);
	  }
	//{5}内部转发到 "/Product/list"。  
	req.getRequestDispatcher("/WEB-INF/productlist.jsp").forward(req, resp);
	}
}
