package com.gec.service;

import java.sql.Connection;
import java.util.List;

import com.gec.Untils.JdbcUtils;
import com.gec.dao.ProductDao;
import com.gec.dao.ProductDaoImpl;
import com.gec.domain.PageBean;
import com.gec.domain.Product;
import com.gec.domain.User;


public class ProductServiceImpl implements ProductService{
    private ProductDao productDao=new ProductDaoImpl();
	@Override
	public PageBean<Product> getProductList(PageBean pBean) throws Exception {
		Connection conn = JdbcUtils.getConnection();
		PageBean<Product> daoBean;
		try{
		  //��ȡ��Ʒ��¼��	
			int cnt=productDao.getProductCount();
			//{3}���� PageBean��װ��ҳ���ݡ�
			daoBean=new PageBean(pBean.getPage(),pBean.getPageSize(),cnt);
			 //{4}��ȡ�û��б�
			int offset=(pBean.getPage()-1)*pBean.getPageSize();
			List<Product> list =productDao.getAllProduct(offset, pBean.getPageSize());
			//{5}�� List ���õ� PageBean ��
			daoBean.setList(list);
		}finally{
			//{6}�ر����ӡ�
			JdbcUtils.closeConnection();
		}
		//{7}���� PageBean
		return daoBean;
	}
	@Override
	public int saveProduct(Product product) throws Exception {
		Connection conn = JdbcUtils.getConnection();
		int cnt=2;
		try{
		   //�жϲ�Ʒ�Ƿ��Լ�����
			cnt=productDao.is_product(product.getPro_name());
			if(cnt==1){//����
				return cnt;
			}else{//������
				productDao.insert_product(product);
			}
		}finally{
			JdbcUtils.closeConnection();
		}
		return cnt;
		}
	@Override
	public int del_product(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = JdbcUtils.getConnection();
		conn.setAutoCommit(false);
		int cnt = 0;
		try{
			 cnt=productDao.delete_product(id);
		}catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			conn.commit();
			JdbcUtils.closeConnection();
		}
		return cnt;
	}
	@Override
	public int up_product(Product product) throws Exception {
		Connection conn = JdbcUtils.getConnection();
		conn.setAutoCommit(false);
		int cnt = 0;
		try{
			cnt=productDao.update_product(product);
		}catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			conn.commit();
			JdbcUtils.closeConnection();
		}
		return cnt;
	 }
	}
	


