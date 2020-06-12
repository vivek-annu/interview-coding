package com.ecommerce.ecommercealtimetrik.service;

import com.ecommerce.ecommercealtimetrik.model.Cart;
import com.ecommerce.ecommercealtimetrik.model.CartItem;
import com.ecommerce.ecommercealtimetrik.model.CustomerOrder;
import com.ecommerce.ecommercealtimetrik.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    CustomerOrderRepository repository;


    @Autowired
    private CartService cartService;


    @Override
    public CustomerOrder addCustomerOrder(CustomerOrder customerOrder) {
        return repository.saveAndFlush(customerOrder);
    }

    public double getCustomerOrderGrandTotal(String cartId) {
        double grandTotal = 0;
        Cart cart = cartService.getCartByCartId(cartId);
        List<CartItem> cartItems = cart.getCartItem();

        for (CartItem item : cartItems) {
            grandTotal += item.getPrice();
        }
        return grandTotal;
    }

}
