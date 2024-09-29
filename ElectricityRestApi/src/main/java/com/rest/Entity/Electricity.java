package com.rest.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electricity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int cid;
	private String cname;
	private  int previous_reading;
	private int current_reading;
	private  int units;
	private double totalbill;
	public Electricity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Electricity [cid=" + cid + ", cname=" + cname + ", previous_reading=" + previous_reading
				+ ", current_reading=" + current_reading + ", units=" + units + ", totalbill=" + totalbill + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPrevious_reading() {
		return previous_reading;
	}
	public void setPrevious_reading(int previous_reading) {
		this.previous_reading = previous_reading;
	}
	public int getCurrent_reading() {
		return current_reading;
	}
	public void setCurrent_reading(int current_reading) {
		this.current_reading = current_reading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	public Electricity(int cid, String cname, int previous_reading, int current_reading, int units, double totalbill) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.previous_reading = previous_reading;
		this.current_reading = current_reading;
		this.units = units;
		this.totalbill = totalbill;
	}

	

}
