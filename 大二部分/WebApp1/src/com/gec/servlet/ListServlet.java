package com.gec.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.beans.Product;

public class ListServlet extends HttpServlet{
   private List<Product> list=new ArrayList();
   public void init() {
		String [] text = {
				"p01,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
				"p02,XBox,XBox(白金版),微软中国总经商,2100,2100",
				"p03,Switch,任天堂 Switch(便携版),中关村天堂专卖店,2500,5000",
				"p04,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
				"p05,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
				"p06,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
				"p07,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
				"p08,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
				"p09,Sony Ps II,Sont ps(家庭版),Sony中国总经商,2500,5600",
		};
		for (String p : text) {
			list.add(Product.newProduct(p));
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("list", list);
		req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);;
	}
}
