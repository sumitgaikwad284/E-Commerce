package com.ecommerce.usersservice.UsersService.Services.Impl;

 
import java.util.List;
import java.util.UUID; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.usersservice.UsersService.Exception.ResourceNotFoundException;
import com.ecommerce.usersservice.UsersService.Repository.UserRepository;
import com.ecommerce.usersservice.UsersService.Services.UserService;
import com.ecommerce.usersservice.UsersService.entities.User;
 

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userrepo;

    Logger logger = LoggerFactory.getLogger(UserService.class);
    
    @Autowired
    RestTemplate restTemplate;

    @Override
    public User create(User user) { 
        logger.info("query");
        String radomUserId = UUID.randomUUID().toString();
        user.setUserId(radomUserId);
        return userrepo.save(user);
     }

    @Override
    public List<User> getAllUser() {
      List<User> users = userrepo.findAll();
       logger.info(String.valueOf(users));
       return userrepo.findAll();
        
    }

   
    @Override
    public User getUserById(String user_Id) {
      User user = userrepo.findById(user_Id).orElseThrow(()->new ResourceNotFoundException("id not found"));

      // logger.info("",user);
      // ArrayList<Product> productsOfUser = restTemplate.getForObject("http://localhost:8081/products/users/"+user.getUserId(), ArrayList.class);
      // logger.info("{}",productsOfUser);
      // user.setProducts(productsOfUser);

      //List<Product> products = Arrays.stream(productsOfUser).toList();
      //user.setProducts(products);
      return user;
    }
    
}
