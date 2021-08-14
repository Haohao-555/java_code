package com.gec.service;

import com.gec.domain.PageBean;
import com.gec.domain.Product;


public interface ProductService {
	//增加产品
	public int saveProduct(Product product)throws Exception;
	//更新产品
	public int up_product(Product product)throws Exception;
	//删除产品
	public int del_product(int id)throws Exception;
	 //获取产品列表
	public PageBean<Product> getProductList(PageBean pBean)throws Exception;
}
