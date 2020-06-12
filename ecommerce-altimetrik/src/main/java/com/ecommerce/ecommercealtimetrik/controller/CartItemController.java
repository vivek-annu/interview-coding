package com.ecommerce.ecommercealtimetrik.controller;

import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.model.CartItem;
import com.ecommerce.ecommercealtimetrik.model.Customer;
import com.ecommerce.ecommercealtimetrik.model.Product;
import com.ecommerce.ecommercealtimetrik.service.CartItemService;
import com.ecommerce.ecommercealtimetrik.service.CartService;
import com.ecommerce.ecommercealtimetrik.service.CustomerService;
import com.ecommerce.ecommercealtimetrik.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cartItem")
public class CartItemController {

	@Autowired
	private CartService cartService;

	@Autowired
	private CartItemService cartItemService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private ProductService productService;



	@RequestMapping("/cart/add/{productId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addCartItem(@RequestBody Cart cart		) {

		Customer customer = customerService.getCustomerByemailId(cart.getCustomer().getCustomerId());
		List<CartItem> cartItems = cart.getCartItem();
		Product product = productService.getProductById(cart.getCustomer().getCustomerId());
		for (int i = 0; i < cartItems.size(); i++) {
			CartItem cartItem = cartItems.get(i);
			if (product.getProductId().equals(cartItem.getProduct().getProductId())) {
				cartItem.setQuality(cartItem.getQuality() + 1);
				cartItem.setPrice(cartItem.getQuality() * cartItem.getProduct().getProductPrice());
				cartItemService.addCartItem(cartItem);
				return;
			}
		}
		CartItem cartItem = new CartItem();
		cartItem.setQuality(1);
		cartItem.setProduct(product);
		cartItem.setPrice(product.getProductPrice() * 1);
		cartItem.setCart(cart);
		cartItemService.addCartItem(cartItem);
	}

	@RequestMapping("/removeCartItem/{cartItemId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeCartItem(@PathVariable(value = "cartItemId") String cartItemId) {
		cartItemService.removeCartItem(cartItemId);
	}

	@RequestMapping("/removeAllItems/{cartId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeAllCartItems(@PathVariable(value = "cartId") String cartId) {
		Cart cart = cartService.getCartByCartId(cartId);
		cartItemService.removeAllCartItems(cart);
	}

}
