package com.ecommerce.ecommercealtimetrik.service;

import com.ecommerce.ecommercealtimetrik.model.Product;

import java.util.List;



public interface ProductService {

	public List<Product> getAllProducts();

	Product getProductById(String productId);

	void deleteProduct(String productId);
	
	Product addProduct(Product product);
	
	Product editProduct(Product product);
}
