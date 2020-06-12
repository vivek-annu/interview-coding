package com.ecommerce.ecommercealtimetrik.controller;

import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.model.Customer;
import com.ecommerce.ecommercealtimetrik.service.CartService;
import com.ecommerce.ecommercealtimetrik.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/cart")
public class CartController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CartService cartService;


	
	@RequestMapping("/emailId")
	public Customer getCartemailId(@PathVariable String emailId ){
		return customerService.getCustomerByemailId(emailId);

	}

	@PostMapping(value = "/registration")
	public Customer registerCustomer(@Valid @RequestBody Customer customer) {
		return customerService.addCustomer(customer);

	}

	@RequestMapping("/getCart/{cartId}")
	public @ResponseBody
	Cart getCartItems(@PathVariable(value="cartId")String cartId){
		return cartService.getCartByCartId(cartId);
	}
	
}
