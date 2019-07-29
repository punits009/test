package com.cg.daos;

import java.util.List;

import com.cg.entities.Product;

public interface ProductDAO {
	
	public List<Product> getAll();
	public void add(Product p);

}
