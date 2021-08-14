package com.gec.dao;

import java.sql.SQLException;
import java.util.List;

import com.gec.domain.Product;

public interface ProductDao {
	//���Ӳ�Ʒ
	public void insert_product(Product product)throws SQLException;
	//�жϲ�Ʒ�Ƿ����
	public int is_product(String pro_name)throws SQLException;
	//��ȡ��Ʒ�б�
	public List<Product> getAllProduct(Integer offset,Integer pageSize)throws SQLException;
	//��ȡ��Ʒ����
	public Integer getProductCount()throws SQLException;
	//ɾ����Ʒ
	public int delete_product(int pro_id)throws SQLException;
	//���²�Ʒ��Ϣ
	public int update_product(Product product)throws SQLException;
}
