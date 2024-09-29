package com.rest.entity;

import jakarta.persistence.Embeddable;
@Embeddable
public class Calculator {
	private double gst;
	private double deliveryfee;
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(double gst, double deliveryfee) {
		super();
		this.gst = gst;
		this.deliveryfee = deliveryfee;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDeliveryfee() {
		return deliveryfee;
	}
	public void setDeliveryfee(double deliveryfee) {
		this.deliveryfee = deliveryfee;
	}
	@Override
	public String toString() {
		return "Calculator [gst=" + gst + ", deliveryfee=" + deliveryfee + "]";
	}
}
