package com.ecommerce.ecommercealtimetrik.repository;


import com.ecommerce.ecommercealtimetrik.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CartRepository extends JpaRepository<Cart,String> {


}
