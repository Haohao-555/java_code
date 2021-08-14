package filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingRequest extends HttpServletRequestWrapper {
	private String encoding;//����
	public EncodingRequest(HttpServletRequest request,String encoding) {
		super(request);// ���ø���Ĺ��췽��(��һЩ��Ҫ��д�ķ���(����������д)������д��)
		this.encoding=encoding;
	}
  
	// ��дgetParamter����(�ı����)
	public String getParameter(String name) {
		String value = getRequest().getParameter(name);
		try {
			if (value != null && "".equals(value))
				value = new String(value.trim().getBytes("ISO-8859-1"),encoding);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return value;
	}
}
