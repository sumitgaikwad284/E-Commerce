package com.ecommerce.productservice.ProductService.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductTable")
public class Product {
	
	@Id
	private String productId;
	private String productName;
	private String productDesc;
	private int productPrice;
	private int productQuantity; 
	

}
