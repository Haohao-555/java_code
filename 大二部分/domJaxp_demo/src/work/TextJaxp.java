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
 * 	dom����
 * ��1���������ͽṹ
 * ��2�������б�ǩ��װ�ɶ���
 * ��3���ŵ㣺�ʺ϶Ա�ǩ������ɾ���
 * ��4��ȱ�㣺�ᵼ���ڴ����
 * 
 */
	
//	****************************����xml�ļ���dom������****************************
	public static void jaxp()throws Exception{
//    	��������������
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
//		����������
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
//		����xml����document
		Document document=builder.parse("src/Person.xml");
//		�õ�nameԪ��
		NodeList list=document.getElementsByTagName("name");
//		����list
		for(int i=0;i<list.getLength();i++){
			Node node=list.item(i);//�õ�ÿһ��name�ı�ǩ
//			�õ��ı�����
			String s=node.getTextContent();
			System.out.println(s);
		}
//		�õ���һ��name��ǩ�ı�����
		Node nod=list.item(0);
		String s1=nod.getTextContent();
		System.out.println(s1);
	}
	
	
	
//	****************************�ڵ�һ��<p1>��ǩ�����<sex>��ǩ****************************
	public static void addsex() throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
//		�õ����б�ǩp1
		NodeList list=document.getElementsByTagName("p1");
//		��ȡ��һ��p1
		Node p1node=list.item(0);
//		����<sex>��ǩ
		Element sex=document.createElement("sex");
//		�����ı�����
		Text text=document.createTextNode("��");
//		���ı���ӵ���ǩ<sex>��
		sex.appendChild(text);
//		����ǩ��ӵ�<p1>����
		p1node.appendChild(sex);
//		��дxml(ֱ�Ӹ��ƴ��뼴��)
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/Person.xml"));
	}
	
	
//	****************************�޸ı�ǩ�ڵ��ı�����sex****************************
	public static void updatesex() throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
		Node sex=document.getElementsByTagName("sex").item(0);
//		�޸�sex�ı�ֵ
		sex.setTextContent("nan");
//		��дxml(ֱ�Ӹ��ƴ��뼴��)
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/Person.xml"));
	}

	

//	****************************ɾ��ĳ����ǩ****************************
	public static void deletesex()throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
		Node sex=document.getElementsByTagName("sex").item(0);
//		�õ�sex�ĸ��ڵ�
		Node p1=sex.getParentNode();
//		ɾ��sex
		p1.removeChild(sex);
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("src/Person.xml"));
	}

	
//	****************************�������нڵ�(��ǩ)****************************
	public static void selectall()throws Exception{
		DocumentBuilderFactory builderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderfactory.newDocumentBuilder();
		Document document=builder.parse("src/Person.xml");
//		�ݹ�
		listnode(document);
	}
	
    private static void listnode(Node node) {
//  �ж���Ԫ�������ڴ�ӡ
    if(node.getNodeType()==Node.ELEMENT_NODE){
    	System.out.println(node.getNodeName());
    }
//  �õ���һ��ڵ㣨p1��  	
	NodeList list=node.getChildNodes();
	for(int i=0;i<list.getLength();i++){
		Node nod=list.item(i);
//		��������
		listnode(nod);
	}
}



	public static void main(String[] args) throws Exception {
		deletesex();
}
}