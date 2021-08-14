package model;

public class GG {

	private int gid;
	private String title;
	private String context;
	private int uid;
	private String gtime;
	public GG(int gid, String title, String context, int uid, String gtime) {
		super();
		this.gid = gid;
		this.title = title;
		this.context = context;
		this.uid = uid;
		this.gtime = gtime;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getGtime() {
		return gtime;
	}
	public void setGtime(String gtime) {
		this.gtime = gtime;
	}
	
}
