package com.web.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private long mobile;
	private String pname;
	private double price;
	private  int quantity;
	private double TotalAmount;
	private double discount;
	private double gst;
	private double invoice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int cid, String cname, long mobile, String pname, double price, int quantity, double totalAmount,
			double discount, double gst, double invoice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		TotalAmount = totalAmount;
		this.discount = discount;
		this.gst = gst;
		this.invoice = invoice;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getInvoice() {
		return invoice;
	}
	public void setInvoice(double invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "Product [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + ", pname=" + pname + ", price="
				+ price + ", quantity=" + quantity + ", TotalAmount=" + TotalAmount + ", discount=" + discount
				+ ", gst=" + gst + ", invoice=" + invoice + "]";
	}
	

}
