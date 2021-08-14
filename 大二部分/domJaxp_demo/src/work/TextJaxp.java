package work;

import javax.xml.*;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.w3c.dom.*;


public class TextJaxp {
/**
 * 	dom解析
 * （1）采用树型结构
 * （2）将所有标签封装成对象
 * （3）优点：适合对标签进行增删查改
 * （4）缺点：会导致内存溢出
 * 
 */
	
//	****************************解析xml文件（dom解析）****************************
	public static void jaxp()throws Exception{
//    	创建解析器工厂
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
//		创建解析器
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
//		解析xml返回document
		Document document=builder.parse("src/Person.xml");
//		得到name元素
		NodeList list=document.getElementsByTagName("name");
//		遍历list
		for(int i=0;i<list.getLength();i++){
			Node node=list.item(i);//得到每一个name的标签
//			得到文本内容
			String s=node.getTextContent();
			System.out.println(s);
		}
//		得到第一个name标签文本内容
		Node nod=list.item(0);
		String s1=nod.getTextContent();
		System.out.println(s1);
	}
	
	
	
//	****************************在第一个<p1>标签内添加<sex>标签****************************
	public static void addsex() throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
//		得到所有标签p1
		NodeList list=document.getElementsByTagName("p1");
//		获取第一个p1
		Node p1node=list.item(0);
//		创建<sex>标签
		Element sex=document.createElement("sex");
//		创建文本内容
		Text text=document.createTextNode("男");
//		把文本添加到标签<sex>内
		sex.appendChild(text);
//		将标签添加到<p1>下面
		p1node.appendChild(sex);
//		回写xml(直接复制代码即可)
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/Person.xml"));
	}
	
	
//	****************************修改标签内的文本内容sex****************************
	public static void updatesex() throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
		Node sex=document.getElementsByTagName("sex").item(0);
//		修改sex文本值
		sex.setTextContent("nan");
//		回写xml(直接复制代码即可)
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/Person.xml"));
	}

	

//	****************************删除某个标签****************************
	public static void deletesex()throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
		Node sex=document.getElementsByTagName("sex").item(0);
//		得到sex的父节点
		Node p1=sex.getParentNode();
//		删除sex
		p1.removeChild(sex);
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/Person.xml"));
	}

	
//	****************************遍历所有节点(标签)****************************
	public static void selectall()throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
//		递归
		listnode(document);
	}
	
    private static void listnode(Node node) {
//  判断是元素类型在打印
    if(node.getNodeType()==Node.ELEMENT_NODE){
    	System.out.println(node.getNodeName());
    }
//  得到第一层节点（p1）  	
	NodeList list=node.getChildNodes();
	for(int i=0;i<list.getLength();i++){
		Node nod=list.item(i);
//		继续遍历
		listnode(nod);
	}
}



	public static void main(String[] args) throws Exception {
		deletesex();
}
}