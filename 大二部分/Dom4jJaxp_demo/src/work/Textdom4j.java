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
//	********************************��ѯxml�µ�����nameֵ********************************
     public static void select() throws Exception{
//    	 ����������
    	 SAXReader saxreader=new SAXReader();
//    	 ����document
    	 Document document=saxreader.read("src/Person.xml");
//    	 �õ������
    	 Element root=document.getRootElement();
//    	 �õ�p1
    	 List<Element>list=root.elements("p1");
//       ����p1
    	 for(Element element:list){
    		 Element name=element.element("name");
    		 System.out.println(name.getText());
    	 }
    }

     
//   ********************************��ѯxml�µ�����nameֵ(XPath)********************************
     public static void selectx() throws Exception{
    	 SAXReader saxreader=new SAXReader(); 
    	 Document document=saxreader.read("src/Person.xml");
    	 List<Node> list=document.selectNodes("//name");//xPath���ʽ���� ��ͼƬ13
    	 for(Node node:list){
    		 System.out.println(node.getText());
    	 }
     }
     
//   ********************************��ȡ��һ��p1�µ�nameֵ********************************
     public static void select_firstname() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 �õ���һ��p1
    	 Element p1=root.element("p1");
//    	 �õ�p1�µ�name
    	 Element name=p1.element("name");
    	 System.out.println(name.getText());
    }
     
     
//   ********************************��ȡ�ڶ���p1�µ�nameֵ********************************
     public static void select_twoname() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 �õ�p1
    	 List<Element>list=root.elements("p1");
//       �õ��ڶ���p1
    	 Element p1=list.get(1);
//    	 �õ�name
    	 Element name=p1.element("name");
    	 System.out.println(name.getText());
    }
     
//    ********************************�ڵ�һ��<p1>��ǩ�����<nev>********************************
     public static void addnev() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 �õ���һ��p1
    	 Element p1=root.element("p1");
//    	 ��p1�����<nev>
    	 Element nev=p1.addElement("nev");
//    	 ����ı�
    	 nev.addText("nan");
//    	 ��дxml
    	 OutputFormat format=OutputFormat.createPrettyPrint();//��ʽ��
//    	 OutPutFormat format=OutputFormat.createCompactFormat();ѹ��
    	 XMLWriter xmlwriter=new XMLWriter(new FileOutputStream("src/Person.xml"),format);
    	 xmlwriter.write(document);
    	 xmlwriter.close();
     }
     
//   ********************************���ض�λ����ӱ�ǩ(�ڵ�һ��p1�µ�age֮ǰ���school)********************************
     public static void addschool() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 �õ���һ��p1
    	 Element p1=root.element("p1");
//    	 ��ȡp1�����б�ǩ
    	 List<Element>list=p1.elements();
//    	 ������ǩ
    	 Element school=DocumentHelper.createElement("school");
    	 school.setText("dax");
//    	 ���ض�λ�����
    	 list.add(1,school);
//    	 ��дxml
    	 OutputFormat format=OutputFormat.createPrettyPrint();
    	 XMLWriter xmlwriter=new XMLWriter(new FileOutputStream("src/Person.xml"),format);
    	 xmlwriter.write(document);
    	 xmlwriter.close();
     }
//   ********************************��ȡ��ǩ����ֵ********************************
     public static void select_Value() throws Exception{
    	 SAXReader saxreader=new SAXReader();
    	 Document document=saxreader.read("src/Person.xml");
    	 Element root=document.getRootElement();
//    	 �õ���һ��p1
    	 Element p1=root.element("p1");
    	 System.out.println(p1.attributeValue("id"));
     }
     public static void main(String[] args) throws Exception {
    	 select_Value();
	}
}
