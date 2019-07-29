package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.services.ProductService;



@RestController
@RequestMapping("/")
public class ProductController {
	@Autowired private ProductService service;
	
	@GetMapping(value="/all")
	public List<Product> getProduct()
	{
		return service.getAll();
	}
	
	
	 @PostMapping(value="/new",consumes= {"application/json"})
	    public String save(@RequestBody Product product) {
	        service.save(product);
	        return "product added!";
	    }

}
