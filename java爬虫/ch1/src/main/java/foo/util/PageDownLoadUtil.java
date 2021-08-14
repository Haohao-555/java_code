package foo.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import foo.entity.Page;
import foo.service.IDownLoadService;
import foo.service.impl.HttpClientDownLoadService;
//下载页面工具类
public class PageDownLoadUtil {
	public static String getPageContent(String url){
		HttpClientBuilder builder=HttpClients.custom();
		CloseableHttpClient client=builder.build();
		HttpGet request=new HttpGet(url);
		String content=null;
		try {
			CloseableHttpResponse response=client.execute(request);
			HttpEntity entity=response.getEntity();
			content=EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}
}
