package com.ecommerce.CartService.Service.Impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.ecommerce.CartService.Controller.AddToCartRequest;
import com.ecommerce.CartService.Entities.Cart;
import com.ecommerce.CartService.FeignClient.ProductClient;
import com.ecommerce.CartService.FeignClient.UserClient;
import com.ecommerce.CartService.Model.Product;
import com.ecommerce.CartService.Model.User;
import com.ecommerce.CartService.Repo.CartRepository;
import com.ecommerce.CartService.Service.CartService;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepo;

    @Autowired
    ProductClient productClient;

    @Autowired
    UserClient userClient;
    Logger logger = LoggerFactory.getLogger(CartService.class);

    @Override
    public Cart addToCart(AddToCartRequest request) {
       
        logger.info(String.valueOf(request.getUserId()));
        logger.info(String.valueOf(request.getProductList()));
        
      
  //      Product product1 = productClient.getProductById("fb256c0d-9eb4-4c48-8c9b-b200b7e497e8");
    //    logger.info(String.valueOf(product1));

        try{
            User user = userClient.getUserById(request.getUserId());
            logger.info(String.valueOf(user));

            if(user!=null)
             {
                Cart cart = cartRepo.findByUserId(request.getUserId());
                if(cart==null)
                {
                   cart = new Cart();
                } 
                cart.setUserId(request.getUserId());
                cart.getProductList().addAll(request.getProductList());
                logger.info(String.valueOf(cart));
                return cartRepo.save(cart);
            }
            else{
                throw new RuntimeException("User not found");
            }
        } catch (HttpClientErrorException e) {
            logger.error("Error while calling UserService", e);
            throw new RuntimeException("Error while calling UserService: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error", e);
            throw new RuntimeException("Unexpected error: " + e.getMessage());
        }
    }
}

