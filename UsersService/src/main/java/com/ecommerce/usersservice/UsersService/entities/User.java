package com.ecommerce.usersservice.UsersService.entities;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Users")
@Entity
public class User {
	
	@Id
	private String userId;
	private String fullName;
	private String email;
	private String password;
	
	 
}
