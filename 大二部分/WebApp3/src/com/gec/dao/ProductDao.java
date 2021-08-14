package com.gec.dao;

import java.sql.SQLException;
import java.util.List;

import com.gec.domain.Product;

public interface ProductDao {
	//增加产品
	public void insert_product(Product product)throws SQLException;
	//判断产品是否存在
	public int is_product(String pro_name)throws SQLException;
	//获取产品列表
	public List<Product> getAllProduct(Integer offset,Integer pageSize)throws SQLException;
	//获取产品总数
	public Integer getProductCount()throws SQLException;
	//删除产品
	public int delete_product(int pro_id)throws SQLException;
	//更新产品信息
	public int update_product(Product product)throws SQLException;
}
