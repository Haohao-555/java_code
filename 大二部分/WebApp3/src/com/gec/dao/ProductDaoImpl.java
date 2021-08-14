package com.gec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.Untils.JdbcUtils;
import com.gec.domain.Product;

public class ProductDaoImpl implements ProductDao{

	@Override
	public int delete_product(int proId) throws SQLException {
		String sql="delete from product where pro_id=?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement pstmt= conn.prepareStatement(sql);
		pstmt.setInt(1, proId);
		int updateCnt=pstmt.executeUpdate();
		pstmt.close();
		return updateCnt;
	}

	@Override
	public List<Product> getAllProduct(Integer offset, Integer pageSize)
			throws SQLException {
		List<Product>list=new ArrayList();
		String sql="select * from product limit ?,?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		//System.out.println("数据库接收到的offset为"+offset+" pageSize为"+pageSize);
		psmt.setInt(1, offset);
		psmt.setInt(2, pageSize);
		ResultSet rs= psmt.executeQuery();
		while(rs.next()){
			Product pro=new Product(rs);
			list.add(pro);
		}
		rs.close();
		psmt.close();
		return list;
	}

	@Override
	public void insert_product(Product product) throws SQLException {
		String fields="pro_id,pro_name,pro_num,pro_price,pro_info,pro_type,pro_situation,createDate,unit,barCode,specification,discountRate,memberPrice";
		String sql="insert into product("+fields+")values(null,?,?,?,?,?,?,null,?,?,?,?,?)";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setString(1,product.getPro_name());
		psmt.setInt(2,product.getPro_num());
		psmt.setFloat(3,product.getPro_price());
		psmt.setString(4,product.getPro_info());
		psmt.setString(5,product.getPro_type());
		psmt.setString(6,product.getPro_situation());
		psmt.setString(7,product.getUnit());
		psmt.setString(8,product.getBarcode());
		psmt.setString(9,product.getSpecification());
		psmt.setFloat(10,product.getDiscountRate());
		psmt.setFloat(11,product.getMemberPrice());
		int updateCnt=psmt.executeUpdate();
		try{
			if(updateCnt!=1){
			    throw new RuntimeException("新增用户失败");	
			}
		}finally{
			psmt.close();
		}	
	}

	@Override
	public int update_product(Product product) throws SQLException {
		String sql="update product set pro_name=?,pro_num=?,pro_price=?,pro_info=?,pro_type=?,pro_situation=? where pro_id=?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setString(1,product.getPro_name());
		psmt.setInt(2,product.getPro_num());
		psmt.setFloat(3,product.getPro_price());
		psmt.setString(4,product.getPro_info());
		psmt.setString(5,product.getPro_type());
		psmt.setString(6,product.getPro_situation());
		psmt.setInt(7,product.getPro_id());
		int updateCnt=psmt.executeUpdate();
		psmt.close();
		return updateCnt;
	}

	@Override
	public Integer getProductCount() throws SQLException {
		String sql="select count(*) from product";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		ResultSet rs= psmt.executeQuery();
		rs.next();
		int cnt=rs.getInt(1);
		rs.close();
		psmt.close();
		return cnt;
	}

	@Override
	public int is_product(String proName) throws SQLException {
		int cnt=2;
		String sql="select * from product where pro_name=?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setString(1,proName);
		ResultSet rs= psmt.executeQuery();
		if(rs.next()){//存在
			return 1;
		}
		rs.close();
		psmt.close();
		return cnt;
	}


}
