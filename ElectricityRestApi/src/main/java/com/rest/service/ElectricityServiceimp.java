package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.Entity.Electricity;
import com.rest.Repo.Electricityrepo;
@Service
public class ElectricityServiceimp implements Electricityservice {
	@Autowired
private Electricityrepo electricityrepo;
	@Override
	public Electricity saverecord(Electricity electricity) {
		int unts=0;
		double total=0.0;
		unts=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		if(unts<300) {
			total=unts*1.75;
		}
		else if(unts>=300&&unts<500) {
			total=unts*3.25;
		}
		else {
			total=unts*7.25;
		}
		electricity.setUnits(unts);
		electricity.setTotalbill(total);
		Electricity e=electricityrepo.save(electricity);
		return e;
	}
public Electricity updaterecord(Electricity electricity,int cid) {
		Electricity oldrecord=electricityrepo.findById( cid).get();
		oldrecord.setCname(electricity.getCname());
		oldrecord.setCurrent_reading(electricity.getCurrent_reading());
		oldrecord.setPrevious_reading(electricity.getPrevious_reading());
		int unts=0;
		double total=0.0;
		unts=electricity.getCurrent_reading()-electricity.getPrevious_reading();
		oldrecord.setUnits(unts);
		if(unts<300) {
			total=unts*1.75;
		}
		else if(unts>=300&&unts<500) {
			total=unts*3.25;
		}
		else {
			total=unts*7.25;
		}
		oldrecord.setTotalbill(total);
		Electricity e=electricityrepo.save(oldrecord);
		
		return e;
	}

	
	@Override
	public Electricity getonerecord(int cid) {
		Electricity e1=electricityrepo.findById(cid).get();
		return e1;
	}

	@Override
	public List<Electricity> getAll() {
		List<Electricity> e1=electricityrepo.findAll();
		
		return e1;
	}
	@Override
	public void deleterecord(int cid) {
		electricityrepo.deleteById( cid);


	}
	


}
