package com.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.Entity.Electricity;
import com.rest.service.Electricityservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class Electricitycontroller {
	@Autowired
	private Electricityservice electricityservice;
	@PostMapping("/save")
	public String savedata(@RequestBody Electricity electricity) {
		Electricity e1=electricityservice.saverecord(electricity);
		String message=null;
		if(e1!=null) {
			message="data inserted sucessfully";
		}
		else {
			message="data inserted failed";
		}
		return message;
		
	}
	@GetMapping("get/{cid}")
	public Electricity  getone(@PathVariable int cid) {
		Electricity e2=electricityservice.getonerecord( cid);
		return e2;
	}
	@GetMapping("/getAll")
	public List<Electricity>getall() {
		List<Electricity> e3=electricityservice.getAll();
		return  e3;
	}
	@DeleteMapping("delete/{cid}")
	public void  deletebyid(@PathVariable int cid) {
		electricityservice.deleterecord(cid);
		
	}
	@PutMapping("update/{cid}")
	public Electricity  update( @RequestBody Electricity electricity,@PathVariable int cid ) {
		Electricity e=electricityservice.updaterecord(electricity, cid);
		
		return e;
	}
	
	
}
