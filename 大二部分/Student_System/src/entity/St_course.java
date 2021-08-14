package entity;

public class St_course {
   private int id;
   private int st_id;//抢课学生id
   private int co_id;//课程id
   private int tea_id;//授课老师id
   private float grade;//分数
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSt_id() {
	return st_id;
}
public void setSt_id(int stId) {
	st_id = stId;
}
public int getCo_id() {
	return co_id;
}
public void setCo_id(int coId) {
	co_id = coId;
}
public int getTea_id() {
	return tea_id;
}
public void setTea_id(int teaId) {
	tea_id = teaId;
}
public float getGrade() {
	return grade;
}
public void setGrade(float grade) {
	this.grade = grade;
}
public St_course(int id, int stId, int coId, int teaId, float grade) {
	super();
	this.id = id;
	st_id = stId;
	co_id = coId;
	tea_id = teaId;
	this.grade = grade;
}
   
}
