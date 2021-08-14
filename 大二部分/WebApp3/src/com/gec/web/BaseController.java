package com.gec.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.gec.domain.PageBean;

public class BaseController extends HttpServlet{
	   protected PageBean parsePageBean(
	     HttpServletRequest req){
		  //拿到当前页
		   int page=getInt(req, "page", 1);
		  //拿到页大小
		   int pageSize=getInt(req, "pageSize", 8);
		   //返回PageBean
		   //System.out.println("当前的page为"+page+" pageSize为"+pageSize);
		   return new PageBean(page,pageSize);
		  
	   }
	   //name:参数名，defVal:默认值  
	   private int getInt(HttpServletRequest req, 
	    String name, int defVal ){
		 String _val=req.getParameter(name);
		 //System.out.println("参数为"+name+"的值为"+_val);
		 Integer ret=defVal;
		 try{
			
				if(_val!=null){
					ret=Integer.valueOf(_val);
				}
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println("{SYS}转换错误");
		}
		 return ret;
	   }
}
