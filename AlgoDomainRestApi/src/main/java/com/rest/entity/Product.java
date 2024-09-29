package com.rest.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pname;
	private String ptype;
	private String pcategory;
	private double price;
	public double discount;
	public double finalbill;
	@Embedded
	private Calculator charges;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, String ptype, String pcategory, double price, double discount,
			double finalbill, Calculator  charges) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pcategory = pcategory;
		this.price = price;
		this.discount = discount;
		this.finalbill = finalbill;
		this.charges = charges;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinalbill() {
		return finalbill;
	}
	public void setFinalbill(double finalbill) {
		this.finalbill = finalbill;
	}
	public Calculator getCharges() {
		return charges;
	}
	public void setCharges( Calculator charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory + ", price="
				+ price + ", discount=" + discount + ", finalbill=" + finalbill + ", charges=" + charges + "]";
	}
}