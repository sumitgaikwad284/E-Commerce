package com.ecommerce.usersservice.UsersService.Services;

import java.util.List;

import com.ecommerce.usersservice.UsersService.entities.User;

public interface UserService {

	//register user
	User create(User user);
	
	//get all users
	List<User> getAllUser();

	//get user by id
	User getUserById(String userId);
	
	
	
}
