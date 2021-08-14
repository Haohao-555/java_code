package com.gec.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gec.Untils.JdbcUtils;


public class TestMain1 {

//	public static void main(String[] args) throws SQLException {
//        //获取数据连接
//		Connection conn = JdbcUtils.getConnection();
//	    //编写SQL代码
//		String sql = "select * from user";
//		//获取SQL执行器(操作对象)
//		PreparedStatement pstmt=conn.prepareStatement(sql);
//		//使用执行器来执行SQL代码（做查询）,拿到记过集
//		//结果集中封装了查询的数据
//		ResultSet rs = pstmt.executeQuery();
//		//迭代整个结果集
//		while(rs.next()) {
//			System.out.printf(
//					"id:%s,account:%s,password:%s,nickName:%s,no:%s,sex:%s\n",
//					rs.getString(1),rs.getString(2),
//					rs.getString(3),rs.getString(4),
//					rs.getString(5),rs.getString(6));
//		}
//	}

}


