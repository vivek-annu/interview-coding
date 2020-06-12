package com.ecommerce.ecommercealtimetrik.service;

import com.ecommerce.ecommercealtimetrik.model.User;

import java.util.List;

public interface UserService {

	List<User> getAllUsers();
	
	void deleteUser(String userId);
	
	User addUser(User user);
	
	User getUserById(String userId);
}
