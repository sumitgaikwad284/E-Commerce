package com.ecommerce.CartService.Service;



import com.ecommerce.CartService.Controller.AddToCartRequest;
import com.ecommerce.CartService.Entities.Cart;

public interface CartService {
    
    Cart addToCart(AddToCartRequest request); 
}
