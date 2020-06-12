package com.ecommerce.ecommercealtimetrik.service;

import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.model.CartItem;
import com.ecommerce.ecommercealtimetrik.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemRepository cartItemRepository;

	public void addCartItem(CartItem cartItem) {
		cartItemRepository.saveAndFlush(cartItem);

	}

	public void removeCartItem(String CartItemId) {
		cartItemRepository.deleteById(CartItemId);
	}

	public void removeAllCartItems(Cart cart) {
		cartItemRepository.deleteAll(cart.getCartItem());

	}

}
