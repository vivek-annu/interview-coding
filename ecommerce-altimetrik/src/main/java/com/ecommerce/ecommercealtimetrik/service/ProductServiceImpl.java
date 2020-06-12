package com.ecommerce.ecommercealtimetrik.service;

import java.util.List;


import com.ecommerce.ecommercealtimetrik.model.Product;
import com.ecommerce.ecommercealtimetrik.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;


    @Transactional
    public List<Product> getAllProducts() {
        return repository.findAll();
    }


    public Product getProductById(String productId) {
        return repository.getOne(productId);
    }


    public void deleteProduct(String productId) {
        repository.deleteById(productId);
    }

    public Product addProduct(Product product) {
        return repository.saveAndFlush(product);
    }

    public Product editProduct(Product product) {
        return
                repository.saveAndFlush(product);
    }

}
