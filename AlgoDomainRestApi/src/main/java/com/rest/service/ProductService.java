package com.rest.service;

import java.util.List;

import com.rest.entity.Product;

public interface ProductService {
	public Product savedata(Product product);
	public Product getone(int pid);
	public void deleteone(int pid);
	public List<Product> getall();
	public Product updaterecord(Product product ,int pid);

}
