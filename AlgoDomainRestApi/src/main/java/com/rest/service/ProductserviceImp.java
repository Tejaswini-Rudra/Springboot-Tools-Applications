package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Calculator;
import com.rest.entity.Product;
import com.rest.repo.ProductRepo;
@Service
public class ProductserviceImp implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product savedata(Product product) {
		double price=product.getPrice();
		double dis=0;
		double gst = 0;
		
		double delivery=0.0;
		String cat;
		cat=product.getPcategory();
		if(cat.equalsIgnoreCase("Electroincs")) {
			dis=0.15;
			
			gst=0.18;
			delivery=350;
		}
		else if(cat.equalsIgnoreCase("home Appliances")) {
			dis=0.22;
			
			gst=0.24;
			delivery=800;
		}
		else if(cat.equalsIgnoreCase("clothing")) {
			dis=0.40;
			gst=0.12;
			delivery=0;
		}
		else if(cat.equalsIgnoreCase("furniture")){
			dis=0.15;
			gst=0.18;
			delivery=300;
			
		}
		Calculator calculator=new Calculator();
		double discount=price*dis;
		double price2=price-discount;
		double g=price*gst;
		double finallbill=price2+g;
		product.setDiscount(discount);
		calculator.setDeliveryfee(delivery);
		calculator.setGst(g);
		product.setCharges(calculator);
		product.setFinalbill(finallbill);
		
		Product p1=productRepo.save(product);
		
		return p1;
	}

	@Override
	public Product getone(int pid) {
		Product p1=productRepo.findById(pid).get();
		return p1;
	}

	@Override
	public void deleteone(int pid) {
		productRepo.deleteById(pid);
		
	}

	@Override
	public List<Product> getall() {
		List<Product>p1=productRepo.findAll();
		
		return p1;
	}

	@Override
	public Product updaterecord(Product product,int pid) {
		 Product oldrecord=productRepo.findById(pid).get();
		 oldrecord.setPname(product.getPname());
		 oldrecord.setPtype(product.getPtype());
		 oldrecord.setPcategory(product.getPcategory());
		double price=product.getPrice();
		double dis=0;
		double gst = 0;
		
		double delivery=0.0;
		String cat;
		cat=product.getPcategory();
		if(cat.equalsIgnoreCase("Electroincs")) {
			dis=0.15;
			
			gst=0.18;
			delivery=350;
		}
		else if(cat.equalsIgnoreCase("home Appliances")) {
			dis=0.22;
			
			gst=0.24;
			delivery=800;
		}
		else if(cat.equalsIgnoreCase("clothing")) {
			dis=0.40;
			gst=0.12;
			delivery=0;
		}
		else if(cat.equalsIgnoreCase("furniture")){
			dis=0.15;
			gst=0.18;
			delivery=300;
			
		}
		Calculator calculator=new Calculator();
		double discount=price*dis;
		double price2=price-discount;
		double g=price*gst;
		double finallbill=price2+g;
		product.setDiscount(discount);
		calculator.setDeliveryfee(delivery);
		calculator.setGst(g);
		product.setCharges(calculator);
		product.setFinalbill(finallbill);
		Product p1=productRepo.save(oldrecord);
		
		return p1;
	}

}
