package com.ecommerce.ecommercealtimetrik.service;


import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);
}
