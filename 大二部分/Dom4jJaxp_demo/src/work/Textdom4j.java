package work;

import java.io.FileOutputStream;
import java.util.List;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


public class Textdom4j {
//	********************************查询xml下的所有name值********************************
     public static void select() throws Exception{
//    	 创建解析器
    	 SAXReader saxreader=new SAXReader();
//    	 返回document
    	 Document document=saxreader.read("src/Person.xml");
//    	 得到根结点
    	 Element root=document.getRootElement();
//    	 得到p1
    	 List<Element>list=root.elements("p1");
//       遍历p1
    	 for(Element element:list){
    		 Element name=element.element("name");
    		 System.out.println(name.getText());
    	 }
    }

     
//   ********************************查询xml下的所有name值(XPath)********************************
     public static void selectx() throws Exception{
    	 SAXReader saxreader=new SAXReader(); 
    	 Document document=saxreader.read("src/Person.xml");
    	 List<Node> list=document.selectNodes("//name");//xPath表达式规则 看图片13
    	 for(Node node:list){
    		 System.out.println(node.getText());
    	 }
     }
     
//   ********************************获取第一个p1下的name值********************************
     public static void select_firstname() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 得到第一个p1
    	 Element p1=root.element("p1");
//    	 得到p1下的name
    	 Element name=p1.element("name");
    	 System.out.println(name.getText());
    }
     
     
//   ********************************获取第二个p1下的name值********************************
     public static void select_twoname() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 得到p1
    	 List<Element>list=root.elements("p1");
//       得到第二个p1
    	 Element p1=list.get(1);
//    	 得到name
    	 Element name=p1.element("name");
    	 System.out.println(name.getText());
    }
     
//    ********************************在第一个<p1>标签下添加<nev>********************************
     public static void addnev() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 得到第一个p1
    	 Element p1=root.element("p1");
//    	 在p1下添加<nev>
    	 Element nev=p1.addElement("nev");
//    	 添加文本
    	 nev.addText("nan");
//    	 回写xml
    	 OutputFormat format=OutputFormat.createPrettyPrint();//格式化
//    	 OutPutFormat format=OutputFormat.createCompactFormat();压缩
    	 XMLWriter xmlwriter=new XMLWriter(new FileOutputStream("src/Person.xml"),format);
    	 xmlwriter.write(document);
    	 xmlwriter.close();
     }
     
//   ********************************在特定位置添加标签(在第一个p1下的age之前添加school)********************************
     public static void addschool() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 得到第一个p1
    	 Element p1=root.element("p1");
//    	 获取p1下所有标签
    	 List<Element>list=p1.elements();
//    	 创建标签
    	 Element school=DocumentHelper.createElement("school");
    	 school.setText("dax");
//    	 在特定位置添加
    	 list.add(1,school);
//    	 回写xml
    	 OutputFormat format=OutputFormat.createPrettyPrint();
    	 XMLWriter xmlwriter=new XMLWriter(new FileOutputStream("src/Person.xml"),format);
    	 xmlwriter.write(document);
    	 xmlwriter.close();
     }
//   ********************************获取标签属性值********************************
     public static void select_Value() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 得到第一个p1
    	 Element p1=root.element("p1");
    	 System.out.println(p1.attributeValue("id"));
     }
     public static void main(String[] args) throws Exception {
    	 select_Value();
	}
}
