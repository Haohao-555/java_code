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
		  //获取产品记录数	
			int cnt=productDao.getProductCount();
			//{3}创建 PageBean封装分页数据。
			daoBean=new PageBean(pBean.getPage(),pBean.getPageSize(),cnt);
			 //{4}获取用户列表。
			int offset=(pBean.getPage()-1)*pBean.getPageSize();
			List<Product> list =productDao.getAllProduct(offset, pBean.getPageSize());
			//{5}把 List 设置到 PageBean 中
			daoBean.setList(list);
		}finally{
			//{6}关闭连接。
			JdbcUtils.closeConnection();
		}
		//{7}返回 PageBean
		return daoBean;
	}
	@Override
	public int saveProduct(Product product) throws Exception {
		Connection conn = JdbcUtils.getConnection();
		int cnt=2;
		try{
		   //判断产品是否以及存在
			cnt=productDao.is_product(product.getPro_name());
			if(cnt==1){//存在
				return cnt;
			}else{//不存在
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
	


