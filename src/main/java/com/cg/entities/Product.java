package com.cg.entities;

public class Product {

	private String productName;
	private int productId;
	private double productPrice;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, int productId, double productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
