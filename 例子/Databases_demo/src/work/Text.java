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
	
	//***********����***********
	public void update()throws Exception{
		String sql="update user set id=1 where user='name'";
		DataConnect.getcon().createStatement().executeUpdate(sql);
	}
	
	//***********ɾ��***********
	public void delete()throws Exception{
		String sql="delete from user where id=1";
		DataConnect.getcon().createStatement().executeUpdate(sql);
	}
	
	//***********����***********
	public void insert() throws Exception{
		String sql="insert into user(id)values(1)";
		DataConnect.getcon().createStatement().executeUpdate(sql);
	}
	
    //***********����***********
	//(1)��ͼ
	public static void select_one() throws Exception{
		String sql="select *from productcustomers";
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		rs.last();//�ƶ���굽���һ��
		System.out.println(rs.getRow());//��ȡ��ǰ�ڵڼ���
		rs.first();//������ƶ�����һ��
		
//		rs.previous();���ر������ƶ�һ��
//		rs.next();���ر������ƶ�һ��
//		rs.relative(5);����������ƶ�5�У������������ƶ�n��
//		rs.absolute(5);���ر��ƶ���n��
		
//		int count=rs.getMetaData().getColumnCount();��ȡ�ж�����
//		String name=rs.getMetaData().getColumnName(1);��ȡָ��ĳһ�е�����
		
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}//�����¼
		
	}
	
   //(2)�޲�������
   public static void select_two() throws Exception{
	    String sql="call productcustomers()";
		CallableStatement c=DataConnect.getcon().prepareCall(sql);
		ResultSet rs =c.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		    }
		}
   
   //(3)�в�������
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
		c.execute();//�˷������Խ������ݵĲ��Һ͸���ɾ�����������ؽ����������boolean���� ���Ҫ�õ����ؼ�����Ҫ�� ResultSet getResultSet() �� ResultSet getUpdateCount()һ��ʹ��
		System.out.println(c.getInt(1)+" "+c.getInt(2)+" "+c.getInt(3));
	}
   //iii)inout
   public static void select_five(){
	   
   }
   
   //(4)�α�
   public static void select_six() throws Exception{
	   String sql="call productornum()";
	   CallableStatement c=DataConnect.getcon().prepareCall(sql);
	   c.execute();
	   c.registerOutParameter(1, java.sql.Types.INTEGER);
	   
	   int i=c.getInt(1);
	   System.out.println(i);
   }
   
   
   
   
   //**************************PreparedStatement**************************
   //����
   public static void insert_one() throws  Exception {
	   String sq="insert into user(id,username,password)values(?,?,?)";//�ʺ���ռλ��
	   PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sq);
	   pstmt.setInt(1, 2);
	   pstmt.setString(2, "hhhh");
	   pstmt.setInt(3, 123);
	   int row=pstmt.executeUpdate();//���Է��ص�ǰ���������
   }
   //����
   public static void select_eight() throws  Exception{
	   String sql="select *from new";
	   PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
	  ResultSet rs=pstmt.executeQuery();
	  if(rs.next()) {}
	  while(rs.next()) {}
   }
  //����
   public static void update_one() throws  Exception {
	   String sql="update set id=? where name=?";
	   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
	   pstmt.setInt(1, 2);
	   pstmt.setString(2, "hh");
	   pstmt.executeUpdate();
   }
   //ɾ������
	
	public static void main(String[] args) {
		
		try {
			select_one();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
