package com.gec.service;

import com.gec.domain.PageBean;
import com.gec.domain.Product;


public interface ProductService {
	//���Ӳ�Ʒ
	public int saveProduct(Product product)throws Exception;
	//���²�Ʒ
	public int up_product(Product product)throws Exception;
	//ɾ����Ʒ
	public int del_product(int id)throws Exception;
	 //��ȡ��Ʒ�б�
	public PageBean<Product> getProductList(PageBean pBean)throws Exception;
}
