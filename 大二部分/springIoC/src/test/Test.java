package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;
import dao.TestDao01Impl;
import dao.Testdao01;
public class Test {
	public static void main(String[] args) {
		//��ʼ��Spring����ApplicationContext�����������ļ�
		ApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��������ȡtestʵ��
		Testdao01 t01=(Testdao01)appcon.getBean("test01");
		t01.sayHello();
		TestDao tt=(TestDao)appcon.getBean("test");
		tt.sayHello();
	}
}
