package model;

/**
 * (cid) tid* cname max current
 * @author 2SXL20300
 *
 */
public class Course {
	private int cid;
	private int tid;
	private String cname;
	private int max;
	private int current;
	/**
	 * @param cid
	 * @param tid
	 * @param cname
	 * @param max
	 * @param current
	 */
	public Course(int cid, int tid, String cname, int max, int current) {
		super();
		this.cid = cid;
		this.tid = tid;
		this.cname = cname;
		this.max = max;
		this.current = current;
	}
	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}
	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	/**
	 * @return the current
	 */
	public int getCurrent() {
		return current;
	}
	/**
	 * @param current the current to set
	 */
	public void setCurrent(int current) {
		this.current = current;
	}
	
}
