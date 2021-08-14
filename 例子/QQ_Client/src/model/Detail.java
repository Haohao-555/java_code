package model;

public class Detail {
	private int id;
    private String detail;
    private String ctime;
    private String ip;
    private String sender;
    private String number;
	public Detail(int id, String detail, String ctime, String ip,
			String sender, String number) {
		super();
		this.id = id;
		this.detail = detail;
		this.ctime = ctime;
		this.ip = ip;
		this.sender = sender;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public String getDetail() {
		return detail;
	}
	public String getCtime() {
		return ctime;
	}
	public String getIp() {
		return ip;
	}
	public String getSender() {
		return sender;
	}
	public String getNumber() {
		return number;
	}
    
}
