package Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import entity.Teacher;
import entity.User;

import util.MyBatisUtil;

public class Text {
//	*******************************************************查找*******************************************************
	public static void select() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User user=sqlsession.selectOne("entity.Mapper.select_User",1);//第一个参数是 UserMapper.xml中namespace值.id值  第二个参数是查询数据是的id
		System.out.println(user.getName());
		sqlsession.close();//关闭资源
	}
//	******************************************************查找全部******************************************************
	public static void selectall() throws Exception{
		List<User>lists=new ArrayList<User>();
		SqlSession sqlsession=MyBatisUtil.getSession();
		lists=sqlsession.selectList("entity.Mapper.select_All");
		sqlsession.close();
		for(User user:lists){
			System.out.println(user.getId()+" "+user.getName()+" "+user.getPw());
		}
	}
//  *******************************************************增加*******************************************************
	public static void add() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User u=new User();
		u.setName("哈哈");
		u.setPw("666");
		int result=sqlsession.insert("entity.Mapper.insert_User", u);
	    sqlsession.commit();//提交
	    System.out.println(result);
	    sqlsession.close();//关闭资源
	}
//  *******************************************************更新*******************************************************
	public static void update() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User u1=sqlsession.selectOne("entity.Mapper.selectUser",1);
		u1.setPw("999");
		sqlsession.update("entity.Mapper.update_User",u1);
		sqlsession.commit();
		sqlsession.close();//关闭资源
	}
//	*******************************************************删除*******************************************************
	public static void delete() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		sqlsession.delete("entity.Mapper.delete_User", 3);
		sqlsession.commit();
		sqlsession.close();//关闭资源
	} 
//  ******************************************************（1）分页******************************************************
	public static void fselect_o() throws Exception{
		int currentPage=1;//当前页
		int pageSize=2;//查找多少个
		Map<String,Integer> map=new HashMap<String,Integer>();
		//注意key值要跟sql语句中的参数名称一致
		map.put("startIndex",(currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		SqlSession sqlsession=MyBatisUtil.getSession();
		List<User>list=sqlsession.selectList("entity.Mapper.fselect",map);
		for(User user:list){
			System.out.println(user);
		}
		sqlsession.close();
	}
// ******************************************************（2）分页******************************************************
   public static void fselect_t() throws Exception{
	   int currentPage=1;//当前页
	   int pageSize=2;//查找多少个
	   SqlSession sqlsession=MyBatisUtil.getSession();
	   RowBounds rowBounds=new RowBounds((currentPage-1)*pageSize,pageSize);
	   List<User>list=sqlsession.selectList("entity.Mapper.select_All",null,rowBounds);
		for(User user:list){
			System.out.println(user);
		}
		sqlsession.close();
	   
   }
// *****************************************************Teacher类查找******************************************************
   public static void selectT() throws Exception{
	   SqlSession sqlsession=MyBatisUtil.getSession();
	   Teacher te=new Teacher();
	   te.setPw("444");
	   te.setTeacher("老师");
	   sqlsession.insert("entity.Mapper.insert_teacher",te);
	   sqlsession.commit();//提交
	   sqlsession.close();
   }
   public static void main(String[] args) throws Exception {
	   
  }
}
