package model;

public class visitor extends User{

	private String ID;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	//点歌
	void diangge(song s){
		diange(s);
	}
	//对点歌进行点评
	public void dianping(String comment){
		
	}
	//回复点评
	public void huifudianping(String comment){
			
	}
	//点赞
	public void dianzan(String Songname){
			
	}

}
