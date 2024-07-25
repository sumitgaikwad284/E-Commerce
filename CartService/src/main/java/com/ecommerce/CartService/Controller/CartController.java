package com.ecommerce.CartService.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.CartService.Entities.Cart;
import com.ecommerce.CartService.Service.CartService; 

@RestController
@RequestMapping("/cart")
public class CartController {
    
    @Autowired
    private CartService cartService;
   
    Logger logger = LoggerFactory.getLogger(CartService.class);
    
    @GetMapping()
    public ResponseEntity<String> temp()
    {
        logger.info("hii");
        return ResponseEntity.ok("okk");
    }   

    @PostMapping("/add")
    public ResponseEntity<Cart> addProductsToCart(@Validated @RequestBody AddToCartRequest req,BindingResult bindingResult)
    {
        logger.info("hii");
        Cart response =cartService.addToCart(req);  
        logger.info(String.valueOf(req.getUserId()));
        logger.info(String.valueOf(req.getProductList()));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
