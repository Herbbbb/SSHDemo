package com.company.dao.pojo;

import java.util.Date;
//用户详情表
public class Detail {
	private int detailId;//用户id
	private String realname;//真实姓名
	private double balance;//账户余额
	private String imgPath;//头像路径
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private Login login;
	public Detail() {
		// TODO Auto-generated constructor stub
	}
	
	public Detail(String realname, double balance, String imgPath, Date createTime) {
		super();
		this.realname = realname;
		this.balance = balance;
		this.imgPath = imgPath;
		this.createTime = createTime;
	}

	public Detail(String realname, double balance, String imgPath, Date createTime, Date updateTime) {
		super();
		this.realname = realname;
		this.balance = balance;
		this.imgPath = imgPath;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
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
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "Detail [detailId=" + detailId + ", realname=" + realname + ", balance=" + balance + ", imgPath="
				+ imgPath + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}
