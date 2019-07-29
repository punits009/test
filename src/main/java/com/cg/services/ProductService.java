package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.daos.ProductDAO;
import com.cg.entities.Product;
@Service
public class ProductService {
	
	@Autowired private ProductDAO dao;
	public List<Product> getAll()
	{
		return dao.getAll();
		
	}
	public void save(Product p)
	{
		dao.add(p);
		
	}
	

}
