package com.gec.domain;

import java.sql.SQLException;

import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class User {
    private Integer id;
    private String account;
    private String password;
    private String nickName;
    private String no;
    private String sex;
    private String roleId;
    private String createDate;
    private String roleName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", createDate=" + createDate
				+ ", id=" + id + ", nickName=" + nickName + ", no=" + no
				+ ", password=" + password + ", roleId=" + roleId
				+ ", roleName=" + roleName + ", sex=" + sex + "]";
	}
	public User(ResultSet rs)throws SQLException{
		this.id=rs.getInt("id");
		this.account=rs.getString("account");
		this.password=rs.getString("password");
		this.nickName=rs.getString("nickName");
		this.no=rs.getString("no");
		this.sex=rs.getString("sex");
		this.roleId=rs.getString("roleId");
		this.createDate=rs.getString("createDate");
		this.roleName=rs.getString("roleName");
	}
	public User(HttpServletRequest req){
		this.id=Integer.parseInt(req.getParameter("user_id"));
		this.account=req.getParameter("account");
		this.nickName=req.getParameter("nickname");
		this.sex=req.getParameter("sex");
		this.password=req.getParameter("password");
		this.roleId=req.getParameter("roleId");
	}
	
	
	public User(){}







}
