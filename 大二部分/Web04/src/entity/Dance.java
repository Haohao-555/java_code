package entity;

import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Dance {
   private String dancename;
   private String singer;
public String getDance() {
	return dancename;
}
public void setDance(String dancename) {
	this.dancename = dancename;
}
public String getSinger() {
	return singer;
}
public void setSinger(String singer) {
	this.singer = singer;
}
public Dance(String dancename, String singer) {
	super();
	this.dancename = dancename;
	this.singer = singer;
}
}
