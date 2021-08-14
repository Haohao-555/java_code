package foo.start;

import foo.entity.Page;
import foo.service.IDownLoadService;
import foo.service.IprocessService;
import foo.service.impl.HttpClientDownLoadService;
import foo.service.impl.ProcessService;

public class StartCount {
	private IDownLoadService DownLoadService;//����ҳ��ӿ�
	private IprocessService processService;//�����ӿ�
	
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

	//����ҳ��
    public Page downloadPage(String url){
		return this.DownLoadService.downLoad(url);	
    }
    //����ҳ��
    public void processPage(Page page){
       this.processService.process(page);
    }
public static void main(String[] args) {
	   StartCount startCount=new StartCount();
	   //��������ҳ��ӿ�
	   startCount.setDownLoadService(new HttpClientDownLoadService());
	   //�������ҳ��ӿ�
	   startCount.setProcessService(new ProcessService());
	   //ҳ��url 
	   String url="http://sece.nfu.edu.cn/get?id=103&mid=19";
	   //����ҳ��
	   Page page=startCount.downloadPage(url);
	   System.out.println(page.getContent());
	   //����ҳ��
	   startCount.processPage(page);
	   
}
}
