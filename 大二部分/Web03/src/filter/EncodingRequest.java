package filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingRequest extends HttpServletRequestWrapper {
	private String encoding;//编码
	public EncodingRequest(HttpServletRequest request,String encoding) {
		super(request);// 调用父类的构造方法(把一些需要重写的方法(并不想来改写)帮我们写好)
		this.encoding=encoding;
	}
  
	// 重写getParamter方法(改变编码)
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
