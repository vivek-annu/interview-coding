package com.ecommerce.ecommercealtimetrik.repository;


import com.ecommerce.ecommercealtimetrik.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,String> {


}
