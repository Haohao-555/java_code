package model;

public class Reply {

	private int rid;
	private int cid;
	private String content;
	private int uid;
	private String rtime;
	public Reply(int rid, int cid, String content, int uid, String rtime) {
		super();
		this.rid = rid;
		this.cid = cid;
		this.content = content;
		this.uid = uid;
		this.rtime = rtime;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	
}
