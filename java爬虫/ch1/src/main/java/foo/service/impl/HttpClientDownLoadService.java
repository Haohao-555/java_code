package foo.service.impl;

import foo.entity.Page;
import foo.service.IDownLoadService;
import foo.util.PageDownLoadUtil;

public class HttpClientDownLoadService implements IDownLoadService{

	@Override
	public Page downLoad(String url) {
		Page page=new Page();
		page.setContent(PageDownLoadUtil.getPageContent(url));
		return page;
	}

}
