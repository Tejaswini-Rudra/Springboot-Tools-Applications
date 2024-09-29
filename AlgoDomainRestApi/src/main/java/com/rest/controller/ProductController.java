package com.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Product;
import com.rest.service.ProductService;





@RestController
public class ProductController {
	@Autowired
	private  ProductService productService;
	@PostMapping("/save")
	public String  savedata(@RequestBody Product product) {
		Product p1=productService.savedata(product);
		String message=null;
		if(p1!=null) {
			message="data inserted sucessfully";
		}
		else {
			message="data insertion failed";
		}
		
		return message;
	}
	@GetMapping("/get/{pid}")
	public Product getone(@PathVariable int pid) {
		Product p1=productService.getone(pid);
		return p1;
	}
	@GetMapping("/getAll")
	public List<Product>getAll() {
		List<Product> p1= productService.getall();
		return p1;
	}
	@DeleteMapping("/delete/{pid}")
	public void delete(@PathVariable int pid) {
		productService.deleteone(pid);
	}
	
@PutMapping("update/{pid}")
public Product updateproduct(@RequestBody Product product,@PathVariable int pid) {
    Product p=productService.updaterecord(product, pid);
    
    return p;
}
}
