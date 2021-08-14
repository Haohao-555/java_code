package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;
import dao.TestDao01Impl;
import dao.Testdao01;
public class Test {
	public static void main(String[] args) {
		//初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获取test实例
		Testdao01 t01=(Testdao01)appcon.getBean("test01");
		t01.sayHello();
		TestDao tt=(TestDao)appcon.getBean("test");
		tt.sayHello();
	}
}
