package com.company.dao.pojo;

import java.util.Date;
//用户登录表
public class Login {
	private int loginId;//登录id
	private String username;//用户名
	private String password;//密码
	private int priority;//权限控制 0表示普通用户 1表示出租船的商家
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private Detail detail;
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Login(String username, String password, int priority, Date createTime) {
		super();
		this.username = username;
		this.password = password;
		this.priority = priority;
		this.createTime = createTime;
	}

	public Login(String username, String password, int priority, Date createTime, Date updateTime) {
		super();
		this.username = username;
		this.password = password;
		this.priority = priority;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", priority="
				+ priority + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}
