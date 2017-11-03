package com.company.service.dto.result;

public class DetailInfo {
	private String realName;
	private double balance;
	public DetailInfo(String realName, double balance) {
		super();
		this.realName = realName;
		this.balance = balance;
	}
	public DetailInfo() {
		// TODO Auto-generated constructor stub
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "DetailInfo [realName=" + realName + ", balance=" + balance + "]";
	}
	
}
