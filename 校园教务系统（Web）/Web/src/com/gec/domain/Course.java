package com.gec.domain;

public class Course {
	   private int id;
	   private String course;
	   private int credit;
	   private int tea_id;//授课教师
	   private String co_time;//上课时间
	   private int number;//上课人数
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
		public int getCredit() {
			return credit;
		}
		public void setCredit(int credit) {
			this.credit = credit;
		}
		public int getTea_id() {
			return tea_id;
		}
		public void setTea_id(int teaId) {
			this.tea_id = teaId;
		}
		public String getCo_time() {
			return co_time;
		}
		public void setCo_time(String coTime) {
			this.co_time = coTime;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public Course(int id, String course, int credit, int teaId, String coTime,
				int number) {
			super();
			this.id = id;
			this.course = course;
			this.credit = credit;
			this.tea_id = teaId;
			this.co_time = coTime;
			this.number = number;
		}
		@Override
		public String toString() {
			return "Course [co_time=" + co_time + ", course=" + course
					+ ", credit=" + credit + ", id=" + id + ", number="
					+ number + ", tea_id=" + tea_id + "]";
		}
		
}
