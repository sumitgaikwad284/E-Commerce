package com.ecommerce.CartService.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.CartService.Model.Product;

@FeignClient(name="PRODUCT-SERVICE")
public interface ProductClient {
    
    @GetMapping("/products/{productId}")
    Product getProductById(@PathVariable("productId") String productId);

}
