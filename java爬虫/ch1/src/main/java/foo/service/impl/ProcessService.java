package foo.service.impl;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import foo.entity.Page;
import foo.service.IprocessService;


public class ProcessService implements IprocessService {
	
	@Override
	public void process(Page page) {
		String content=page.getContent();
		HtmlCleaner htmlCleaner=new HtmlCleaner();
		TagNode rootNode= htmlCleaner.clean(content);
		//    //*/ul/li/a/@href
		//String xPathExpression="//*/audio/@src";
		String xPathExpression="//*/h4";
		String data = null;
		try {
			Object[] evaluateXPath=rootNode.evaluateXPath(xPathExpression);
			System.out.println(evaluateXPath.length);
			if(evaluateXPath.length>0){
				for(Object node:evaluateXPath){
					data=((TagNode) node).getText().toString().replaceAll("&nbsp;", " ");
					System.out.println(data);	
					
					//System.out.println(node);
				}
				
			}
		} catch (XPatherException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
