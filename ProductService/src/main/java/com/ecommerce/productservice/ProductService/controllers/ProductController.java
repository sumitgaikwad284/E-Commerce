package com.ecommerce.productservice.ProductService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productservice.ProductService.entities.Product;
import com.ecommerce.productservice.ProductService.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService ProductService;
	
	
	@GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = ProductService.getAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
	

	@GetMapping("/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable String productId)
	{
		Product product = ProductService.getByProductId(productId);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}

	 @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = ProductService.create(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
	 @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable String productId, @RequestBody Product product) {
        Product updatedProduct = ProductService.updateProduct(productId, product);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

	@DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String productId) {
        ProductService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//   @GetMapping("/users/{userId}")
//     public ResponseEntity<List<Product>> getByUserId(@PathVariable String userId)
//     {
//         List<Product> products = ProductService.getByUserId(userId);
//         return ResponseEntity.ok(products);
//     }
}
	