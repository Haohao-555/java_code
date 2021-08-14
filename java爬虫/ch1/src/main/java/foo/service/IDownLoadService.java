package foo.service;

import foo.entity.Page;
//页面下载接口
public interface IDownLoadService {
  public Page downLoad(String url);
}
