package com.ecommerce.ecommercealtimetrik.service;

import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository repository;


	public Cart getCartByCartId(String CartId) {

		return repository.getOne(CartId);
	}

}
