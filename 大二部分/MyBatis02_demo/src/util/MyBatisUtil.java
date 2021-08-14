package util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
	//����SqlSessionFactory
	public static SqlSessionFactory getsqlSessionFactory()throws Exception{
		String resource = "MyBatis.xml";//��ַ�����ݿ����ӣ�
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	//����SqlSession
	public static SqlSession getSession()throws Exception{
		SqlSessionFactory sqlSessionFactory=getsqlSessionFactory();
		return sqlSessionFactory.openSession();
	}
}
