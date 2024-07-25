package com.ecommerce.CartService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.CartService.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart,String>{

    Cart findByUserId(String userId);

}
