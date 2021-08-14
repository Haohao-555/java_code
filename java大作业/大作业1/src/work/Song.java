package work;

public class Song {
    private int id;
    private String name;
    private String singer;
    private int time;
	public Song(int id, String name, String singer, int time) {
		super();
		this.id = id;//序号
		this.name = name;//歌名
		this.singer = singer;//歌手
		this.time = time;//歌的播放时间
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
 }
