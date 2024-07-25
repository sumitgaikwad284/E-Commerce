package com.ecommerce.usersservice.UsersService.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.usersservice.UsersService.Services.UserService;
import com.ecommerce.usersservice.UsersService.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userservice;
    
    Logger logger = LoggerFactory.getLogger(UserService.class);

    @GetMapping()
    public ResponseEntity<List<User>> getAllUser() {

        
        List<User> users = userservice.getAllUser();

        logger.info(String.valueOf(users));
        
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = userservice.create(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        User userbyid = userservice.getUserById(id);

        return new ResponseEntity<>(userbyid, HttpStatus.OK);
    }

}
