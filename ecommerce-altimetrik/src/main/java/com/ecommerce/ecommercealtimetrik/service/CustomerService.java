package com.ecommerce.ecommercealtimetrik.service;

import com.ecommerce.ecommercealtimetrik.model.Customer;

import java.util.List;



public interface CustomerService {

	Customer addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
