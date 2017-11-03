package com.company.dao.pojo;
//船和集装箱的中间表
public class Bb {
	private int bbId;
	private Box box;
	private Boat boat;
	private int amount;
	private int salesamount;
	private int storeamount;
	public Bb() {
	}
	public Bb(int amount, int salesamount, int storeamount) {
		super();
		this.amount = amount;
		this.salesamount = salesamount;
		this.storeamount = storeamount;
	}
	public int getBbId() {
		return bbId;
	}
	public void setBbId(int bbId) {
		this.bbId = bbId;
	}
	public Box getBox() {
		return box;
	}
	public void setBox(Box box) {
		this.box = box;
	}
	public Boat getBoat() {
		return boat;
	}
	public void setBoat(Boat boat) {
		this.boat = boat;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSalesamount() {
		return salesamount;
	}
	public void setSalesamount(int salesamount) {
		this.salesamount = salesamount;
	}
	public int getStoreamount() {
		return storeamount;
	}
	public void setStoreamount(int storeamount) {
		this.storeamount = storeamount;
	}
	@Override
	public String toString() {
		return "Bb [bbId=" + bbId + ", amount=" + amount + ", salesamount=" + salesamount + ", storeamount="
				+ storeamount + "]";
	}
	
}
