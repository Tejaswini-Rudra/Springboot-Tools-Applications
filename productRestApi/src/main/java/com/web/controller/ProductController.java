package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.web.entity.Product;
import com.web.service.Productservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
public class ProductController {
	@Autowired
	private Productservice productservice;
	@PostMapping("/save")
	public String savedata(@RequestBody Product product) {
		Product p1 =productservice.savedata(product);
		String message=null;
		if(p1!=null) {
			message="data inserted sucessfully";
		}
		else {
			message="data insertion fail";
		}
		
		return message;
	}
	@DeleteMapping("delete/{cid}")
	public void delete(@PathVariable int cid) {
		productservice.deleteproduct(cid);
	}
	@GetMapping("get/{cid}")
	public Product  getone(@PathVariable int cid) {
		Product p1=productservice.getonerecord(cid);
		return p1;
		
	}
	@GetMapping("/getAll")
	public List<Product>getall() {
		List<Product>p1=productservice.getall();
		return p1;
	}
	@PutMapping("update/{cid}")
	public  Product update( @RequestBody  Product product,@PathVariable int cid) {
		Product p=productservice.updaterecord(product, cid);
		
		return p;
	}
	
	

}
