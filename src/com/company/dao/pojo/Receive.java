package com.company.dao.pojo;

import java.util.Date;

public class Receive {
	private int receiveId;
	private String receiveName;
	private String tel;
	private Login login;
	private Date createTime;
	private Date updateTime;
	public Receive() {
		// TODO Auto-generated constructor stub
	}
	public Receive(String receiveName, String tel) {
		super();
		this.receiveName = receiveName;
		this.tel = tel;
	}
	public int getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(int receiveId) {
		this.receiveId = receiveId;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
		return "Receive [receiveId=" + receiveId + ", receiveName=" + receiveName + ", tel=" + tel + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
}
