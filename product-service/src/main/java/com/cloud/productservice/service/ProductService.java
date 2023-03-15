package com.cloud.productservice.service;

import java.util.List;

import com.cloud.productservice.model.Product;

public interface ProductService {
	
	void saveProduct(Product product);
	
	Product findByProductId(Long id);
	
	List<Product> getAllProduct(); 
	
	void deleteProduct(Product product);

}
