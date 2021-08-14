package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public  class Student {
   public  static class myexception extends Exception{}
   public  static class myexception1 extends Exception{}
	
   private String name;
   private String number;
   
   private int id;
public Student(String name, String number) {
	super();
	this.name = name;
	this.number = number;

	this.id = id;
}
public Student(){}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
//登录
public static Student Login(String name,String number) throws Exception{
	
	String sql = "select * from Student where name='"+name+"' and number = '"+number+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception("密码或用户名出错");
	else
		return new Student(rs.getString(2),rs.getString(3));
}
//注册
public static void register(String name,String number) throws Exception,myexception{
	String sqt = "select * from Student where name='"+name+"'";
	ResultSet rt = DataConnect.getStat().executeQuery(sqt);
	if(!rt.next()){
	String sql = "insert into Student(name,number) values( '"+name+"' , '"+number+"')";
	DataConnect.getStat().executeUpdate(sql);
	}else{
		throw new myexception();
	}
	
}
//查看公告1
public static Gg checkgg(int id) throws Exception{
	String sql = "select * from Gg where id = "+id;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next())
		return new Gg(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(2));
	
	return null;
}
//查看公告2
public static ArrayList<Gg> viewAllgg() throws Exception {
	ArrayList<Gg> gg = new ArrayList<Gg>();
	String sql = "select * from gg";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		gg.add(new Gg(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(2)));
	}
	return gg;
}
//显示课表
public static ArrayList<Course> rob_course() throws Exception{
	 ArrayList<Course> course=new ArrayList<Course>();
	 String sql = "select * from Course";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while(rs.next()){
			course.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		}
		return course;
	}
//抢课
public static void rabcourse(int id,String student,String number) throws Exception,myexception{
	 A a=Student.checkother(id);
	 String course=a.getCourse();
	ArrayList<Student>d=new ArrayList<Student>();
	String sqy = "select * from studentcourse where student='"+student+"'";
	ResultSet ry = DataConnect.getStat().executeQuery(sqy);
	while(ry.next()){
		d.add(new Student(ry.getString(3),ry.getString(6)));
		}
	for(int i=0;i<d.size();i++){
		if(!course.equals(d.get(i).getName())){
			if(i==d.size()){
				String sqt = "insert into studentcourse(number,course,teacher,coursetime,student,credit)values('"+number+"','"+a.getCourse()+"','"+a.getTeacher()+"','"+a.getCoursetime()+"','"+student+"','"+a.getCredit()+"')";
				DataConnect.getStat().executeUpdate(sqt);
				 }
			
		}else{
			throw new myexception();
	}
		
	} 
	if(!ry.next()){
		 int c=Integer.parseInt(a.getCredit());
		 int fee=Payment.fee(c);
		 String feecondition="未交费";
		 String sql = "insert into studentcourse(number,course,teacher,coursetime,student,credit,fee,feecondition)values('"+number+"','"+a.getCourse()+"','"+a.getTeacher()+"','"+a.getCoursetime()+"','"+student+"','"+a.getCredit()+"','"+fee+"','"+feecondition+"')";
		 DataConnect.getStat().executeUpdate(sql);
		
	}
	}

//查看课程，老师，时间,学分
public static A checkother(int id) throws Exception{
	String sqt = "select * from course where id = "+id;
	ResultSet rs = DataConnect.getStat().executeQuery(sqt);
	if(rs.next()){
	String course=rs.getString(2);
	String teacher=rs.getString(4);
	String coursetime=rs.getString(3);
	return new A(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
}
	return null;
}
//请假
 public static void request(String teacher,String course,String coursetime,String student,String because,String condition) throws Exception {
	    boolean a=judgecourse(course,student);
	    if(a==false){
	    	
	    	throw new myexception();
	    }else{
	    	boolean b=judgecoursenews(teacher,course,coursetime);
	    if(b==false){
	    
	    	throw new myexception1();
	    }else{
	       studentrequest(student,course,teacher,coursetime,because,condition);
	    	}
	    }
	 }
	    
//判断是否抢课
public static boolean judgecourse(String course,String student) throws Exception{
	String sqt="select * from studentcourse where course='"+course+"'and student='"+student+"'";
	ResultSet rt= DataConnect.getStat().executeQuery(sqt);
	if(rt.next()){
		return true;
	}else{
		return false;
	}
}
//插入请假
public static void studentrequest(String student,String course,String teacher,String coursetime,String because,String condition) throws Exception{
	String feecondition="未交费";
	String sq2 ="insert into request(teacher,student,course,coursetime,because,conditions,feecondition)values('"+teacher+"','"+student+"','"+course+"','"+coursetime+"','"+because+"','"+condition+"','"+feecondition+"')";
    DataConnect.getStat().executeUpdate(sq2);
   
}
//判断信息是否一致
public static boolean judgecoursenews(String teacher,String course,String coursetime) throws Exception{
	String sql = "select * from course where  teacher = '"+ teacher+"' and course='"+course+"' and coursetime='"+coursetime+"'" ;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next()){
		return true;
	}else{
		return false;
	}
}
//查看成绩
public static ArrayList<B> check_grade(String student) throws Exception{
	ArrayList<B> b=new ArrayList<B>();
	String sql="select * from studentcourse where student='"+student+"'" ;
	ResultSet rs= DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		int i=0;
		b.add(new B(i++,rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(8),rs.getString(10),rs.getInt(9),rs.getString(7),rs.getString(6)));
	}
	return b;
	}
//缴费
public static void payment(){}
//查看自己的课表
public static ArrayList<Course>  checkmycourse(String student) throws Exception{
	ArrayList<Course> course=new ArrayList<Course>();
	String sql="select *from studentcourse where student='"+student+"'";
	ResultSet rs=DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		int i=0;
		i++;
		course.add(new Course(i,rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(8)));
	}
	return course;
	}
//查看请假情况
public static ArrayList<Request> checkrequest(String student) throws Exception{
	ArrayList<Request>request=new ArrayList<Request>();
	String sql="select * from request where student='"+student+"'" ;
	ResultSet rt= DataConnect.getStat().executeQuery(sql);
   while(rt.next()){
		request.add(new Request(rt.getInt(1),rt.getString(3),rt.getString(4),rt.getString(5),rt.getString(6),rt.getString(2),rt.getString(7),rt.getString(8)));
	}
    return request;
}
//查看交费项目
public static ArrayList<Courses>  checkmyfee(String student) throws Exception{
	ArrayList<Courses> course=new ArrayList<Courses>();
	String sql="select *from studentcourse where student='"+student+"'";
	ResultSet rs=DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		int i=0;
		i++;
		course.add(new Courses(i,rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(8),rs.getString(10),rs.getInt(9)));
	}
	return course;
	}
}