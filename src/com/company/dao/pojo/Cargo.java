package com.company.dao.pojo;

import java.util.Date;

//货物类型的价目
public class Cargo {
	private int cargoId;
	private String cargoType;
	private double cargoPrice;
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	public Cargo() {
		// TODO Auto-generated constructor stub
	}
	public Cargo(String cargoType, double cargoPrice, Date createTime, Date updateTime) {
		super();
		this.cargoType = cargoType;
		this.cargoPrice = cargoPrice;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getCargoId() {
		return cargoId;
	}
	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}
	public String getCargoType() {
		return cargoType;
	}
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
	public double getCargoPrice() {
		return cargoPrice;
	}
	public void setCargoPrice(double cargoPrice) {
		this.cargoPrice = cargoPrice;
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
		return "Cargo [cargoId=" + cargoId + ", cargoType=" + cargoType + ", cargoPrice=" + cargoPrice + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
}
