package com.company.dao.pojo;

import java.util.Date;

//订单表
public class Order {
	private int orderId;//订单id
	private int amount;//订够数量
	private String cargoType;//集装箱的类型
	private double allMoney;//总价
	private int loginId;
	public Order(int amount, String cargoType, double allMoney, int loginId, Date createTime) {
		super();
		this.amount = amount;
		this.cargoType = cargoType;
		this.allMoney = allMoney;
		this.loginId = loginId;
		this.createTime = createTime;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	private Receive receive;
	public Receive getReceive() {
		return receive;
	}

	public void setReceive(Receive receive) {
		this.receive = receive;
	}

	private Bb bb;
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(int amount, String cargoType, double allMoney, Date createTime, Date updateTime) {
		super();
		this.amount = amount;
		this.cargoType = cargoType;
		this.allMoney = allMoney;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCargoType() {
		return cargoType;
	}
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
	public double getAllMoney() {
		return allMoney;
	}
	public void setAllMoney(double allMoney) {
		this.allMoney = allMoney;
	}

	public Bb getBb() {
		return bb;
	}
	public void setBb(Bb bb) {
		this.bb = bb;
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
		return "Order [orderId=" + orderId + ", amount=" + amount + ", cargoType=" + cargoType + ", allMoney="
				+ allMoney + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
