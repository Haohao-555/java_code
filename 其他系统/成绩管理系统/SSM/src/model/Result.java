package model;

/**
 * ³É¼¨: (sid* cid*) score
 * @author 2SXL20300
 *
 */
public class Result {

	private int sid;
	private int cid;
	private double score;
	/**
	 * @param sid
	 * @param cid
	 * @param score
	 */
	public Result(int sid, int cid, double score) {
		super();
		this.sid = sid;
		this.cid = cid;
		this.score = score;
	}
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
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
	 * @return the score
	 */
	public double getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}
	public void getString(){
		System.out.println(cid+"\t"+sid+"\t"+score);
	}
}
