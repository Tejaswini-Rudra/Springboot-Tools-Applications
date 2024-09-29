package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	private double Ta;
	private double Da;
	private double Hra;
	private double Pf;
	private double grasssalary;
	private double netsalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary, double ta, double da, double hra, double pf,
			double grasssalary, double netsalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		Ta = ta;
		Da = da;
		Hra = hra;
		Pf = pf;
		this.grasssalary = grasssalary;
		this.netsalary = netsalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", Ta=" + Ta + ", Da=" + Da
				+ ", Hra=" + Hra + ", Pf=" + Pf + ", grasssalary=" + grasssalary + ", netsalary=" + netsalary + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getTa() {
		return Ta;
	}
	public void setTa(double ta) {
		Ta = ta;
	}
	public double getDa() {
		return Da;
	}
	public void setDa(double da) {
		Da = da;
	}
	public double getHra() {
		return Hra;
	}
	public void setHra(double hra) {
		Hra = hra;
	}
	public double getPf() {
		return Pf;
	}
	public void setPf(double pf) {
		Pf = pf;
	}
	public double getGrasssalary() {
		return grasssalary;
	}
	public void setGrasssalary(double grasssalary) {
		this.grasssalary = grasssalary;
	}
	public double getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}
}
