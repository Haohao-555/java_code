package untity;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import entity.User;

public class Text {
   public static void main(String[] args) {
	   File file =new File("E:"+File.separator+"user.xml");
	   JAXBContext jaxbContext;
	   try {
		jaxbContext=JAXBContext.newInstance(User.class);
		Marshaller m=jaxbContext.createMarshaller();
	    User user =new User("张三","zhangsan","30","男","广州市天河区","他是一名工程师");
	    m.marshal(user,file);
	    System.out.println("测试成功");
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
}
   
}
