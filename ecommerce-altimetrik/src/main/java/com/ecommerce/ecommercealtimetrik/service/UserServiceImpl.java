package com.ecommerce.ecommercealtimetrik.service;

import java.util.List;
import com.ecommerce.ecommercealtimetrik.model.User;
import com.ecommerce.ecommercealtimetrik.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional
	public List<User> getAllUsers() {
	return repository.findAll();
	}

	@Transactional
	public void deleteUser(String userId) {
		repository.deleteById(userId);
	}
	@Transactional 
	public User addUser(User user){
		return repository.saveAndFlush(user);
	}
	
	public User getUserById(String userId) {
		return repository.getOne(userId);
	}

	
}
