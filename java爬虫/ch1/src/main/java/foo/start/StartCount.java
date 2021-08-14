package foo.start;

import foo.entity.Page;
import foo.service.IDownLoadService;
import foo.service.IprocessService;
import foo.service.impl.HttpClientDownLoadService;
import foo.service.impl.ProcessService;

public class StartCount {
	private IDownLoadService DownLoadService;//下载页面接口
	private IprocessService processService;//解析接口
	
   public IDownLoadService getDownLoadService() {
		return DownLoadService;
	}

	public void setDownLoadService(IDownLoadService downLoadService) {
		DownLoadService = downLoadService;
	}
	
	public IprocessService getProcessService() {
		return processService;
	}

	public void setProcessService(IprocessService processService) {
		this.processService = processService;
	}

	//下载页面
    public Page downloadPage(String url){
		return this.DownLoadService.downLoad(url);	
    }
    //解析页面
    public void processPage(Page page){
       this.processService.process(page);
    }
public static void main(String[] args) {
	   StartCount startCount=new StartCount();
	   //传入下载页面接口
	   startCount.setDownLoadService(new HttpClientDownLoadService());
	   //传入解析页面接口
	   startCount.setProcessService(new ProcessService());
	   //页面url 
	   String url="http://sece.nfu.edu.cn/get?id=103&mid=19";
	   //下载页面
	   Page page=startCount.downloadPage(url);
	   System.out.println(page.getContent());
	   //解析页面
	   startCount.processPage(page);
	   
}
}
