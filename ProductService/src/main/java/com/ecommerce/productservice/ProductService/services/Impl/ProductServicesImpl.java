package com.ecommerce.productservice.ProductService.services.Impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.productservice.ProductService.Exception.ResourseNotFoundException;
import com.ecommerce.productservice.ProductService.Repository.ProductRepository;
import com.ecommerce.productservice.ProductService.entities.Product;
import com.ecommerce.productservice.ProductService.services.ProductService;


@Service
public class ProductServicesImpl implements ProductService{

	@Autowired
	private ProductRepository repo;
	 

	@Override
	public Product create(Product product) {
		String radomUserId = UUID.randomUUID().toString();
		product.setProductId(radomUserId);
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProduct() { 
		return repo.findAll();
	}

  
    @Override
	public boolean deleteProduct(String productId) {
		repo.deleteById(productId);
		return true;
	}

	public Product updateProduct(String productId, Product updatedProduct) {
       Optional<Product> newProduct = repo.findById(productId);
		
		if(newProduct.isPresent()) {
           Product product = updatedProduct;
			   return product;
            
        }
        else throw new ResourseNotFoundException("product of this id not found");// Or throw an exception
    }

	 
	@Override
	public Product getByProductId(String productId) {
		 return repo.findById(productId).orElseThrow(()->new ResourseNotFoundException("user with given id not found"));
	}

	 
}
