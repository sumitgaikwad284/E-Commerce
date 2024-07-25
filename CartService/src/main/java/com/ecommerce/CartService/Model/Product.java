package com.ecommerce.CartService.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    
    private String productId;
	private String productName;
	private String productDesc;
	private int productPrice;
	private int productQuantity; 

}
