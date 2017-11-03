package com.company.dao.pojo;

import java.util.Date;

//船的集装箱
public class Box {
	private int boxId;
	private double boxPrice;
	private String boxType;
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public Box(double boxPrice, String boxType, Date createTime, Date updateTime) {
		super();
		this.boxPrice = boxPrice;
		this.boxType = boxType;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public double getBoxPrice() {
		return boxPrice;
	}
	public void setBoxPrice(double boxPrice) {
		this.boxPrice = boxPrice;
	}
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
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
		return "Box [boxId=" + boxId + ", boxPrice=" + boxPrice + ", boxType=" + boxType + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
}
