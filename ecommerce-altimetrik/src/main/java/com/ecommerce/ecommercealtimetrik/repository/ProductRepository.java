package com.ecommerce.ecommercealtimetrik.repository;

import com.ecommerce.ecommercealtimetrik.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Product,String> {

	
}
