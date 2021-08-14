package com.gec.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.gec.domain.PageBean;

public class BaseController extends HttpServlet{
	   protected PageBean parsePageBean(
	     HttpServletRequest req){
		  //�õ���ǰҳ
		   int page=getInt(req, "page", 1);
		  //�õ�ҳ��С
		   int pageSize=getInt(req, "pageSize", 8);
		   //����PageBean
		   //System.out.println("��ǰ��pageΪ"+page+" pageSizeΪ"+pageSize);
		   return new PageBean(page,pageSize);
		  
	   }
	   //name:��������defVal:Ĭ��ֵ  
	   private int getInt(HttpServletRequest req, 
	    String name, int defVal ){
		 String _val=req.getParameter(name);
		 //System.out.println("����Ϊ"+name+"��ֵΪ"+_val);
		 Integer ret=defVal;
		 try{
			
				if(_val!=null){
					ret=Integer.valueOf(_val);
				}
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println("{SYS}ת������");
		}
		 return ret;
	   }
}
