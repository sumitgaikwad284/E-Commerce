package com.ecommerce.productservice.ProductService.services;

import java.util.List;

import com.ecommerce.productservice.ProductService.entities.Product;

public interface ProductService {
	
	Product create(Product product);
	
	
	List<Product> getAllProduct();
	
    boolean deleteProduct(String productId);
	
	Product updateProduct(String productId,Product product);
	
	Product getByProductId(String productId);


}