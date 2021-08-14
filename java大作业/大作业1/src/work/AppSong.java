package work;

public class AppSong {
     private String SName;//歌曲名字
     private String Name;//上传人名字
     private String Singer;//歌手
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public AppSong(String SName,String Name,String Singer) {
	   super();
       this.SName=SName;
       this.Singer=Singer;
       this.Name=Name;

	}
}
