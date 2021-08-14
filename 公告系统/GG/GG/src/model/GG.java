package model;

public class GG {
	private int gid;
	private String gtitle;
	private String gdetail;
	private String name;
	private String gtime;
	public GG(int gid, String gtitle, String gdetail, String name, String gtime) {
		super();
		this.gid = gid;
		this.gtitle = gtitle;
		this.gdetail = gdetail;
		this.name = name;
		this.gtime = gtime;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGtitle() {
		return gtitle;
	}
	public void setGtitle(String gtitle) {
		this.gtitle = gtitle;
	}
	public String getGdetail() {
		return gdetail;
	}
	public void setGdetail(String gdetail) {
		this.gdetail = gdetail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGtime() {
		return gtime;
	}
	public void setGtime(String gtime) {
		this.gtime = gtime;
	}
	
}
