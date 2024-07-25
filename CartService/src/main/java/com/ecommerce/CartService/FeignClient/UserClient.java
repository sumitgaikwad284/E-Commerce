package com.ecommerce.CartService.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.CartService.Model.User;

@FeignClient(name="USER-SERVICE")
public interface UserClient {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") String userId);

}
