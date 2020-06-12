package com.ecommerce.ecommercealtimetrik.repository;

import com.ecommerce.ecommercealtimetrik.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {


}
