package com.company.dao.pojo;

import java.util.Date;
//航线信息 
public class Lane {
	private int laneId;
	private String strartLocation;
	private String endLoaction;
	private double lanePrice;
	private int flag;//如果更改航线的话更改标志位，由0变1
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	public Lane() {
		// TODO Auto-generated constructor stub
	}
	public Lane(String strartLocation, String endLoaction, double lanePrice, int flag, Date createTime,
			Date updateTime) {
		super();
		this.strartLocation = strartLocation;
		this.endLoaction = endLoaction;
		this.lanePrice = lanePrice;
		this.flag = flag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getLaneId() {
		return laneId;
	}
	public void setLaneId(int laneId) {
		this.laneId = laneId;
	}
	public String getStrartLocation() {
		return strartLocation;
	}
	public void setStrartLocation(String strartLocation) {
		this.strartLocation = strartLocation;
	}
	public String getEndLoaction() {
		return endLoaction;
	}
	public void setEndLoaction(String endLoaction) {
		this.endLoaction = endLoaction;
	}
	public double getLanePrice() {
		return lanePrice;
	}
	public void setLanePrice(double lanePrice) {
		this.lanePrice = lanePrice;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
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
		return "Lane [laneId=" + laneId + ", strartLocation=" + strartLocation + ", endLoaction=" + endLoaction
				+ ", lanePrice=" + lanePrice + ", flag=" + flag + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
}
