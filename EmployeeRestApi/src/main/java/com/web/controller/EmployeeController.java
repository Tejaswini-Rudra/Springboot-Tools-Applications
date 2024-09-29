package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Employee;
import com.web.service.Employeeservice;

import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class EmployeeController {
	@Autowired
	private Employeeservice employeeservice;
	@PostMapping("/save")
	public String savedata(@RequestBody Employee employee) {
		Employee e1=employeeservice.saverecord(employee);
		String message=null;
		if(e1!=null) {
			message="data inserted sucessfully";
			
		}
		else {
			message="data insertion failed";
		}
		
		return message;
	}@DeleteMapping("delete/{eid}")
	public void delete(@PathVariable int eid) {
		employeeservice.delete(eid);
		
	}
	@GetMapping("get/{eid}")
	public Employee getone(@PathVariable int eid) {
		Employee e1=employeeservice.getonerecord(eid);
		return e1;
		
	}
	@GetMapping("/getAll")
	public List<Employee>getall() {
		List<Employee>e1=employeeservice.getall();
		return e1;
	}
	@PutMapping("update/{eid}")
	public Employee update(@RequestBody Employee employee,@PathVariable int eid) {
		Employee e1=employeeservice.update(employee, eid);
		
		return e1;
	}
	

}
