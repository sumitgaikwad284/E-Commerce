package com.ecommerce.usersservice.UsersService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.usersservice.UsersService.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
  
}
