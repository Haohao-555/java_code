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
//	*******************************************************����*******************************************************
	public static void select() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User user=sqlsession.selectOne("entity.Mapper.select_User",1);//��һ�������� UserMapper.xml��namespaceֵ.idֵ  �ڶ��������ǲ�ѯ�����ǵ�id
		System.out.println(user.getName());
		sqlsession.close();//�ر���Դ
	}
//	******************************************************����ȫ��******************************************************
	public static void selectall() throws Exception{
		List<User>lists=new ArrayList<User>();
		SqlSession sqlsession=MyBatisUtil.getSession();
		lists=sqlsession.selectList("entity.Mapper.select_All");
		sqlsession.close();
		for(User user:lists){
			System.out.println(user.getId()+" "+user.getName()+" "+user.getPw());
		}
	}
//  *******************************************************����*******************************************************
	public static void add() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User u=new User();
		u.setName("����");
		u.setPw("666");
		int result=sqlsession.insert("entity.Mapper.insert_User", u);
	    sqlsession.commit();//�ύ
	    System.out.println(result);
	    sqlsession.close();//�ر���Դ
	}
//  *******************************************************����*******************************************************
	public static void update() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User u1=sqlsession.selectOne("entity.Mapper.selectUser",1);
		u1.setPw("999");
		sqlsession.update("entity.Mapper.update_User",u1);
		sqlsession.commit();
		sqlsession.close();//�ر���Դ
	}
//	*******************************************************ɾ��*******************************************************
	public static void delete() throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		sqlsession.delete("entity.Mapper.delete_User", 3);
		sqlsession.commit();
		sqlsession.close();//�ر���Դ
	} 
//  ******************************************************��1����ҳ******************************************************
	public static void fselect_o() throws Exception{
		int currentPage=1;//��ǰҳ
		int pageSize=2;//���Ҷ��ٸ�
		Map<String,Integer> map=new HashMap<String,Integer>();
		//ע��keyֵҪ��sql����еĲ�������һ��
		map.put("startIndex",(currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		SqlSession sqlsession=MyBatisUtil.getSession();
		List<User>list=sqlsession.selectList("entity.Mapper.fselect",map);
		for(User user:list){
			System.out.println(user);
		}
		sqlsession.close();
	}
// ******************************************************��2����ҳ******************************************************
   public static void fselect_t() throws Exception{
	   int currentPage=1;//��ǰҳ
	   int pageSize=2;//���Ҷ��ٸ�
	   SqlSession sqlsession=MyBatisUtil.getSession();
	   RowBounds rowBounds=new RowBounds((currentPage-1)*pageSize,pageSize);
	   List<User>list=sqlsession.selectList("entity.Mapper.select_All",null,rowBounds);
		for(User user:list){
			System.out.println(user);
		}
		sqlsession.close();
	   
   }
// *****************************************************Teacher�����******************************************************
   public static void selectT() throws Exception{
	   SqlSession sqlsession=MyBatisUtil.getSession();
	   Teacher te=new Teacher();
	   te.setPw("444");
	   te.setTeacher("��ʦ");
	   sqlsession.insert("entity.Mapper.insert_teacher",te);
	   sqlsession.commit();//�ύ
	   sqlsession.close();
   }
   public static void main(String[] args) throws Exception {
	   
  }
}
