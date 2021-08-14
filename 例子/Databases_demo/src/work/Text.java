package work;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class Text {
	static List<String> all=new ArrayList<String>();
	//**************************Statement**************************
	
	//***********更新***********
	public void update()throws Exception{
		String sql="update user set id=1 where user='name'";
		DataConnect.getcon().createStatement().executeUpdate(sql);
	}
	
	//***********删除***********
	public void delete()throws Exception{
		String sql="delete from user where id=1";
		DataConnect.getcon().createStatement().executeUpdate(sql);
	}
	
	//***********增加***********
	public void insert() throws Exception{
		String sql="insert into user(id)values(1)";
		DataConnect.getcon().createStatement().executeUpdate(sql);
	}
	
    //***********查找***********
	//(1)视图
	public static void select_one() throws Exception{
		String sql="select *from productcustomers";
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		rs.last();//移动光标到最后一行
		System.out.println(rs.getRow());//获取当前在第几行
		rs.first();//将光标移动到第一行
		
//		rs.previous();将关标先上移动一行
//		rs.next();将关标先下移动一行
//		rs.relative(5);将光标先上移动5行，负数则先下移动n行
//		rs.absolute(5);将关标移动到n行
		
//		int count=rs.getMetaData().getColumnCount();获取有多少列
//		String name=rs.getMetaData().getColumnName(1);获取指定某一列的名字
		
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}//多个记录
		
	}
	
   //(2)无参数函数
   public static void select_two() throws Exception{
	    String sql="call productcustomers()";
		CallableStatement c=DataConnect.getcon().prepareCall(sql);
		ResultSet rs =c.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		    }
		}
   
   //(3)有参数函数
   //i)in
   public static void select_three() throws Exception{
	   String sql="call productvendname(1)";
	   CallableStatement c=DataConnect.getcon().prepareCall(sql);
	   ResultSet rs =c.executeQuery();
	   if(rs.next()){
		   System.out.println(rs.getString(1)+" "+rs.getInt(2)); 
	   }
	 }
   //ii)out
   public static void select_four() throws Exception{
		
		String sql="call productallprice(?,?,?)";
		CallableStatement c=DataConnect.getcon().prepareCall(sql);
		c.registerOutParameter(1,java.sql.Types.INTEGER);
		c.registerOutParameter(2,java.sql.Types.INTEGER);
		c.registerOutParameter(3,java.sql.Types.INTEGER);
		c.execute();//此方法可以进行数据的查找和更新删除，但不返回结果集，返回boolean类型 如果要得到返回集则需要和 ResultSet getResultSet() 或 ResultSet getUpdateCount()一起使用
		System.out.println(c.getInt(1)+" "+c.getInt(2)+" "+c.getInt(3));
	}
   //iii)inout
   public static void select_five(){
	   
   }
   
   //(4)游标
   public static void select_six() throws Exception{
	   String sql="call productornum()";
	   CallableStatement c=DataConnect.getcon().prepareCall(sql);
	   c.execute();
	   c.registerOutParameter(1, java.sql.Types.INTEGER);
	   
	   int i=c.getInt(1);
	   System.out.println(i);
   }
   
   
   
   
   //**************************PreparedStatement**************************
   //插入
   public static void insert_one() throws  Exception {
	   String sq="insert into user(id,username,password)values(?,?,?)";//问号是占位符
	   PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sq);
	   pstmt.setInt(1, 2);
	   pstmt.setString(2, "hhhh");
	   pstmt.setInt(3, 123);
	   int row=pstmt.executeUpdate();//可以返回当前插入的行数
   }
   //查找
   public static void select_eight() throws  Exception{
	   String sql="select *from new";
	   PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
	  ResultSet rs=pstmt.executeQuery();
	  if(rs.next()) {}
	  while(rs.next()) {}
   }
  //更新
   public static void update_one() throws  Exception {
	   String sql="update set id=? where name=?";
	   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
	   pstmt.setInt(1, 2);
	   pstmt.setString(2, "hh");
	   pstmt.executeUpdate();
   }
   //删除类似
	
	public static void main(String[] args) {
		
		try {
			select_one();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
