package com.web.service;

import java.util.List;



import com.web.entity.Product;

public interface Productservice {
	public  Product savedata(Product product);
	public void deleteproduct(int cid);
	public Product getonerecord(int cid);
	public  List<Product> getall();
	public Product updaterecord(Product product,int cid);
	
	

}
