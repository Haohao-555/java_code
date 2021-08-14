package model;

public class B {
	private int id;
	private String course;
	private String coursetime;
	private String teacher;
	private int credit;
	private String conditions;
	private int fee;
	private String grade;
	private String student;
	
	public B(int id, String course, String coursetime, String teacher,
			int credit, String conditions, int fee, String grade, String student) {
		super();
		this.id = id;
		this.course = course;
		this.coursetime = coursetime;
		this.teacher = teacher;
		this.credit = credit;
		this.conditions = conditions;
		this.fee = fee;
		this.grade = grade;
		this.student = student;
	}
	
	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCoursetime() {
		return coursetime;
	}
	public void setCoursetime(String coursetime) {
		this.coursetime = coursetime;
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
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
