package entity;

public class Full_class_grade {
  private int id;
  private int co_id;
  private float grade;
  private String course;
  private String co_time;
  private String name;
  private String xuehao;
  private String major;
  private int credit;
  private String teacher;
  private int flag;
  private int st_id;
public Full_class_grade(int id,  float grade,int coId, String course,
		int credit,String coTime, String teacher,String name, String xuehao, String major,int flag,int st_id) {
	super();
	this.id = id;
	co_id = coId;
	this.grade = grade;
	this.course = course;
	co_time = coTime;
	this.name = name;
	this.xuehao = xuehao;
	this.major = major;
	this.credit=credit;
	this.teacher=teacher;
	this.flag=flag;
	this.st_id=st_id;
}


public int getSt_id() {
	return st_id;
}


public void setSt_id(int stId) {
	st_id = stId;
}


public int getFlag() {
	return flag;
}


public void setFlag(int flag) {
	this.flag = flag;
}


public String getTeacher() {
	return teacher;
}

public void setTeacher(String teacher) {
	this.teacher = teacher;
}

public int getCredit() {
	return credit;
}

public void setCredit(int credit) {
	this.credit = credit;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCo_id() {
	return co_id;
}
public void setCo_id(int coId) {
	co_id = coId;
}
public float getGrade() {
	return grade;
}
public void setGrade(float grade) {
	this.grade = grade;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCo_time() {
	return co_time;
}
public void setCo_time(String coTime) {
	co_time = coTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getXuehao() {
	return xuehao;
}
public void setXuehao(String xuehao) {
	this.xuehao = xuehao;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}

  
}
