package work;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 * 
 * �¼�������
 * ��Ҫ�̳�DefaultHandler ����Ҫ��дstartElement����characters����endElement����˳���ܸı�
 * 
 *  sax����xml�ļ�
 *��1�����ܽ��ж�xml�ı�ǩ������ɾ��ģ�ֻ�ܲ�ѯ
 *��2���ŵ㣺��������ڴ����
 *��3�����ñ߶��߽��� ���¼�����
 *
 */


//*********************************************��ӡxml�ļ���ǩ*********************************************
class MyDefault extends DefaultHandler{
	@Override
	public void startElement(String uri, String localname, String qName,
			Attributes arg3) throws SAXException {
		System.out.print("<"+qName+">");//��ӡͷ��ǩ
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		System.out.print(new String(ch,start,length));//��ӡ�ı�����
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("</"+qName+">");//��ӡβ��ǩ
	}
}


//*********************************************��ӡname��ǩ*********************************************
class MyDefault1 extends DefaultHandler{
	boolean flag=false;
	@Override
	public void startElement(String uri, String localname, String qName,
			Attributes arg3) throws SAXException {
		//�ж��Ƿ�Ϊname
		if("name".equals(qName)){
			flag=true;
			//System.out.println(qName);
			}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//���flag��ֵΪtrue
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

//*********************************************��ӡ��һ��name��ǩ*********************************************
class MyDefault2 extends DefaultHandler{
	boolean flag=false;
	int index=1;
	@Override
	public void startElement(String uri, String localname, String qName,
			Attributes arg3) throws SAXException {
		//�ж��Ƿ�Ϊname
		if("name".equals(qName)){
			flag=true;
			}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//���flag��ֵΪtrue
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
//		������������
		SAXParserFactory saxparaserfactory=SAXParserFactory.newInstance();
//		����������
		SAXParser saxparser=saxparaserfactory.newSAXParser();
//		ִ��parser����
		saxparser.parse("Person1.xml", new MyDefault2()); 
    }
}
