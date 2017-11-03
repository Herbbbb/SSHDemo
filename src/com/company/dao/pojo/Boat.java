package com.company.dao.pojo;

import java.util.Date;
//船信息
public class Boat {
	private int boatId;//船编号
	private String boatName;//船名
	private Date startTime;//发船时间
	private Date endTiem;//到达目的地的时间
	private Double boatPrice;//票价
	private int flag;//船变换航线之后，重新生成一个船信息，标志位由0变1
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private Company company;//所属公司id
	private Lane lane;//航线id
	public Boat() {
		// TODO Auto-generated constructor stub
	}
	public Boat(int boatId, String boatName, Date startTime, Date endTiem, Double boatPrice, int flag, Date createTime,
			Date updateTime) {
		super();
		this.boatId = boatId;
		this.boatName = boatName;
		this.startTime = startTime;
		this.endTiem = endTiem;
		this.boatPrice = boatPrice;
		this.flag = flag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	public Boat(String boatName, Date startTime, Date endTiem, Double boatPrice, int flag, Date createTime,
			Date updateTime) {
		super();
		this.boatName = boatName;
		this.startTime = startTime;
		this.endTiem = endTiem;
		this.boatPrice = boatPrice;
		this.flag = flag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getBoatId() {
		return boatId;
	}
	public void setBoatId(int boatId) {
		this.boatId = boatId;
	}
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTiem() {
		return endTiem;
	}
	public void setEndTiem(Date endTiem) {
		this.endTiem = endTiem;
	}
	public Double getBoatPrice() {
		return boatPrice;
	}
	public void setBoatPrice(Double boatPrice) {
		this.boatPrice = boatPrice;
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Lane getLane() {
		return lane;
	}
	public void setLane(Lane lane) {
		this.lane = lane;
	}
	@Override
	public String toString() {
		return "Boat [boatId=" + boatId + ", boatName=" + boatName + ", startTime=" + startTime + ", endTiem=" + endTiem
				+ ", boatPrice=" + boatPrice + ", flag=" + flag + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
}
