package com.ecommerce.ecommercealtimetrik.controller;

import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.model.Customer;
import com.ecommerce.ecommercealtimetrik.model.CustomerOrder;
import com.ecommerce.ecommercealtimetrik.service.CartService;
import com.ecommerce.ecommercealtimetrik.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private CartService cartService;

	@Autowired
	private CustomerOrderService customerOrderService;

	@GetMapping("/{cartId}")
	public String createOrder(@PathVariable("cartId") String cartId) {

		CustomerOrder customerOrder = new CustomerOrder();

		Cart cart = cartService.getCartByCartId(cartId);

		customerOrder.setCart(cart);

		Customer customer = cart.getCustomer();

		customerOrder.setCustomer(customer);

		customerOrder.setShippingAddress(customer.getShippingAddress());

		customerOrder.setBillingAddress(customer.getBillingAddress());

		customerOrderService.addCustomerOrder(customerOrder);

		return cartId;
	}
}
