package com.web.service;



import java.util.List;

import com.web.entity.Employee;

public interface Employeeservice {
	public Employee saverecord(Employee employee);
	public  void delete(int eid);
	public Employee getonerecord(int eid);
	public List<Employee> getall();
	public Employee update(Employee employee,int eid);

}
