package com.ecommerce.ecommercealtimetrik.service;

import java.util.List;

import com.ecommerce.ecommercealtimetrik.model.Customer;
import com.ecommerce.ecommercealtimetrik.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public Customer addCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }

    public Customer getCustomerByemailId(String emailId) {
        return customerRepository.getOne(emailId);
    }

}
