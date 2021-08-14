package util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
	//创建SqlSessionFactory
	public static SqlSessionFactory getsqlSessionFactory()throws Exception{
		String resource = "MyBatis.xml";//地址（数据库连接）
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	//创建SqlSession
	public static SqlSession getSession()throws Exception{
		SqlSessionFactory sqlSessionFactory=getsqlSessionFactory();
		return sqlSessionFactory.openSession();
	}
}
