package com.company.service.dto.result;

import java.util.Date;

public class BoatInfo {
	private String comname;
	private String boatName;
	private double price;
	private Date startTime;
	private Date endTime;
	public BoatInfo() {
		// TODO Auto-generated constructor stub
	}
	public BoatInfo(String comname, String boatName, double price, Date startTime, Date endTime) {
		super();
		this.comname = comname;
		this.boatName = boatName;
		this.price = price;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "BoatInfo [comname=" + comname + ", boatName=" + boatName + ", price=" + price + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	
}
