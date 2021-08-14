package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class Encodingfilter implements Filter {
	private String encoding;
	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		if ("GET".equals(req.getMethod())) {
			req = new EncodingRequest(req, encoding);
			//ͨ��EncodingRequestȥ��дgetParameter()����
		} else {
			request.setCharacterEncoding("utf-8");
		}
		response.setCharacterEncoding(encoding);
		chain.doFilter(req, response);// ����
		

	}

	public void init(FilterConfig config) throws ServletException {
		String encoding = config.getInitParameter("ENCODING");// ��ȡ���������õı���
		if(encoding!=null&&"".equals(encoding)){
			this.encoding = encoding;
		}else{
			this.encoding="UTF-8";
		}
	
		System.out.println(encoding);

	}
}
