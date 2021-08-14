package work;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 * 
 * 事件处理类
 * 需要继承DefaultHandler 且需要覆写startElement（）characters（）endElement（）顺序不能改变
 * 
 *  sax解析xml文件
 *（1）不能进行对xml的标签进行增删查改，只能查询
 *（2）优点：不会造成内存溢出
 *（3）采用边读边解析 （事件处理）
 *
 */


//*********************************************打印xml文件标签*********************************************
class MyDefault extends DefaultHandler{
	@Override
	public void startElement(String uri, String localname, String qName,
			Attributes arg3) throws SAXException {
		System.out.print("<"+qName+">");//打印头标签
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		System.out.print(new String(ch,start,length));//打印文本内容
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("</"+qName+">");//打印尾标签
	}
}


//*********************************************打印name标签*********************************************
class MyDefault1 extends DefaultHandler{
	boolean flag=false;
	@Override
	public void startElement(String uri, String localname, String qName,
			Attributes arg3) throws SAXException {
		//判断是否为name
		if("name".equals(qName)){
			flag=true;
			//System.out.println(qName);
			}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//如果flag的值为true
		if(flag==true){
			System.out.println(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("name".equals(qName)){
			flag=false;
			
		}
		
	}
}

//*********************************************打印第一个name标签*********************************************
class MyDefault2 extends DefaultHandler{
	boolean flag=false;
	int index=1;
	@Override
	public void startElement(String uri, String localname, String qName,
			Attributes arg3) throws SAXException {
		//判断是否为name
		if("name".equals(qName)){
			flag=true;
			}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//如果flag的值为true
		if(flag==true&&index==1){
			System.out.println(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("name".equals(qName)){
			flag=false;
			index++;
		}
		
	}
}
//***************************************************************************************************************************************
public class TextJaxp {
	public static void main(String[] args) throws Exception{
//		创建解析工厂
		SAXParserFactory saxparaserfactory=SAXParserFactory.newInstance();
//		创建解析器
		SAXParser saxparser=saxparaserfactory.newSAXParser();
//		执行parser方法
		saxparser.parse("Person1.xml", new MyDefault2()); 
    }
}
