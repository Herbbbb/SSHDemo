package com.company.service.dto.result;

import java.util.Date;

public class SalInfo {
	private String companyName;
	private String boatPrice;
	private int counts;
	private Date sTime;
	private Date eTime;
	private String startLocation;
	private String endLocation;
	private double lanePrice;
	public SalInfo() {
		// TODO Auto-generated constructor stub
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBoatPrice() {
		return boatPrice;
	}
	public void setBoatPrice(String boatPrice) {
		this.boatPrice = boatPrice;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public Date getsTime() {
		return sTime;
	}
	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}
	public Date geteTime() {
		return eTime;
	}
	public void seteTime(Date eTime) {
		this.eTime = eTime;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public double getLanePrice() {
		return lanePrice;
	}
	public void setLanePrice(double lanePrice) {
		this.lanePrice = lanePrice;
	}
	public SalInfo(String companyName, String boatPrice, int counts, Date sTime, Date eTime, String startLocation,
			String endLocation, double lanePrice) {
		super();
		this.companyName = companyName;
		this.boatPrice = boatPrice;
		this.counts = counts;
		this.sTime = sTime;
		this.eTime = eTime;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.lanePrice = lanePrice;
	}
	@Override
	public String toString() {
		return "SalInfo [companyName=" + companyName + ", boatPrice=" + boatPrice + ", counts=" + counts + ", sTime="
				+ sTime + ", eTime=" + eTime + ", startLocation=" + startLocation + ", endLocation=" + endLocation
				+ ", lanePrice=" + lanePrice + "]";
	}
	
}
