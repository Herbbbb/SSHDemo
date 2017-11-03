package com.company.dao.pojo;

import java.util.Date;

public class Company {
	private int companyId;//公司id
	private String companyName;//公司名称
	private Login login;//公司的所属法人
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String companyName, Date createTime, Date updateTime) {
		super();
		this.companyName = companyName;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
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
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
}
