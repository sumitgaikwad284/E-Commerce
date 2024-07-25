package com.ecommerce.productservice.ProductService.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 

import com.ecommerce.productservice.ProductService.entities.*;

 
public interface ProductRepository extends JpaRepository<Product,String>{

       
}
