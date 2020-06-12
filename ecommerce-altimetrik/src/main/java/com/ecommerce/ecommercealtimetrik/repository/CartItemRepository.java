package com.ecommerce.ecommercealtimetrik.repository;


import com.ecommerce.ecommercealtimetrik.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,String> {



}
