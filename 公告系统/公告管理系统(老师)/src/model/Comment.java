package model;

public class Comment {
	private int cid;
	private int gid;
	private String content;
	private int uid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Comment(int cid, int gid, String content, int uid, String ctime) {
		super();
		this.cid = cid;
		this.gid = gid;
		this.content = content;
		this.uid = uid;
		this.ctime = ctime;
	}
	private String ctime;
}
