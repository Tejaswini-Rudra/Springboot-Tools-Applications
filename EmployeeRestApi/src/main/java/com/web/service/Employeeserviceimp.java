package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.web.entity.Employee;
import com.web.repo.Employeerepo;
@Service
public class Employeeserviceimp implements Employeeservice {
	@Autowired
	private Employeerepo employeerepo;

	@Override
	public Employee saverecord(Employee employee) {
		double salary=employee.getSalary();
		double ta;
		double da;
		double hra;
		double pf;
		double gsalary;
		double nsalary;
		if(salary<30000) {
			ta=0.07*salary;
			da=0.09*salary;
			hra=0.11*salary;
			pf=0.15*salary;
		}
		else if(salary>=30000&&salary<50000) {
			ta=0.12*salary;
			da=0.13*salary;
			hra=0.17*salary;
			pf=0.22*salary;
		}
		else {
			ta=0.17*salary;
			da=0.19*salary;
			hra=0.21*salary;
			pf=0.25*salary;
		}
		gsalary=ta+da+hra;
		nsalary=gsalary-pf;
		employee.setDa(da);
		employee.setTa(ta);
		employee.setHra(hra);
		employee.setPf(pf);
		employee.setGrasssalary(gsalary);
		employee.setNetsalary(nsalary);
		Employee e1=employeerepo.save(employee);
		return e1;
	}

	@Override
	public void delete(int eid) {
		employeerepo.deleteById(eid);

	}

	@Override
	public Employee getonerecord(int eid) {
	Employee e1=employeerepo.findById(eid).get();
		
		return e1;
	}

	@Override
	public List<Employee> getall() {
		List<Employee>e1=employeerepo.findAll();
		return e1;
	}

	@Override
	public Employee update(Employee employee, int eid) {
		Employee oldrecord=employeerepo.findById(eid).get();
		oldrecord.setEname(employee.getEname());
		oldrecord.setSalary(employee.getSalary());
		double salary=employee.getSalary();
		double ta;
		double da;
		double hra;
		double pf;
		double gsalary;
		double nsalary;
		if(salary<30000) {
			ta=0.07*salary;
			da=0.09*salary;
			hra=0.11*salary;
			pf=0.15*salary;
		}
		else if(salary>=30000&&salary<50000) {
			ta=0.12*salary;
			da=0.13*salary;
			hra=0.17*salary;
			pf=0.22*salary;
		}
		else {
			ta=0.17*salary;
			da=0.19*salary;
			hra=0.21*salary;
			pf=0.25*salary;
		}
		gsalary=ta+da+hra;
		nsalary=gsalary-pf;
		oldrecord.setTa(ta);
		oldrecord.setDa(da);
		oldrecord.setHra(hra);
		oldrecord.setPf(pf);
		oldrecord.setGrasssalary(nsalary);
		oldrecord.setNetsalary(nsalary);
		Employee e1=employeerepo.save(oldrecord);
		
		return e1;
	}

}
