package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Repo.Productrepo;
import com.web.entity.Product;
@Service
public class ProductServiceImp implements Productservice {
	@Autowired
	 private Productrepo productrepo;

	@Override
	public Product savedata(Product product) {
		double total;
		double totalbill;
		double discount;
		double gst;
		double invoice;
		total=product.getPrice()*product.getQuantity();
		if(total<2500) {
			discount=total*0.1;
		}
		else if(total>=2500&&total<5000) {
			discount=total*0.15;
			
		}
		else {
			discount=total*0.30;
		}
		totalbill=total-discount;
		gst=totalbill*0.18;
		invoice=totalbill+gst;
		product.setDiscount(discount);
		product.setTotalAmount(totalbill);
		product.setGst(gst);
		product.setInvoice(invoice);
		Product p=productrepo.save(product);
		
		return p;
	}

	@Override
	public void deleteproduct(int cid) {
		productrepo.deleteById(cid);

	}

	@Override
	public Product getonerecord(int cid) {
		Product p1=productrepo.findById(cid).get();
		return p1;
	}

	@Override
	public List<Product> getall() {
		List<Product>p1=productrepo.findAll();
		return p1;
	}

	@Override
	public Product updaterecord(Product product, int cid) {
		Product oldrecord=productrepo.findById(cid).get();
		oldrecord.setCname(product.getCname());
		oldrecord.setMobile(product.getMobile());
		oldrecord.setPname(product.getPname());
		oldrecord.setPrice(product.getPrice());
		oldrecord.setQuantity(product.getQuantity());
		double total;
		double totalbill;
		double discount;
		double gst;
		double invoice;
		total=product.getPrice()*product.getQuantity();
		if(total<2500) {
			discount=total*0.1;
		}
		else if(total>=2500&&total<5000) {
			discount=total*0.15;
			
		}
		else {
			discount=total*0.30;
		}
		totalbill=total-discount;
		gst=totalbill*0.18;
		invoice=totalbill+gst;
		product.setDiscount(discount);
		product.setTotalAmount(totalbill);
		product.setGst(gst);
		product.setInvoice(invoice);
		oldrecord.setTotalAmount(totalbill);
		oldrecord.setDiscount(discount);
		oldrecord.setGst(gst);
		oldrecord.setInvoice(invoice);
		Product p=productrepo.save(oldrecord);
		return p;
	}

}
