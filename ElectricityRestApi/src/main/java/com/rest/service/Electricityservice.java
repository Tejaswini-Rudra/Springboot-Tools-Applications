package com.rest.service;

import java.util.List;


import com.rest.Entity.Electricity;

public interface Electricityservice {
	public  Electricity saverecord(Electricity electricity) ;
	public Electricity updaterecord(Electricity electricity,int cid);
	public void  deleterecord (int cid);
	public Electricity getonerecord(int cid);
	public List<Electricity> getAll();
	
	

}
