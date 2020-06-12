package com.ecommerce.ecommercealtimetrik.service;


import com.ecommerce.ecommercealtimetrik.model.CustomerOrder;

public interface CustomerOrderService {

	CustomerOrder addCustomerOrder(CustomerOrder customerOrder);
	double getCustomerOrderGrandTotal(String cartId);
}
