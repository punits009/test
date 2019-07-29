package com.cg.daos;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cg.entities.Product;
@Repository
public class ProductDAOImpl implements ProductDAO{
	
	List<Product> products=new LinkedList();
 
	@PostConstruct
	public void populate()
	{
		products.add(new Product("Phone",101,12500.00));
		products.add(new Product("Car",102,250000.00));
		products.add(new Product("Fan",103,2500.00));
	}
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return products;
	}

	public  void add(Product p) {
		// TODO Auto-generated method stub
	    products.add(p);
	}

}
