
package com.ecommerce.ecommercealtimetrik.controller;

import com.ecommerce.ecommercealtimetrik.model.Product;
import com.ecommerce.ecommercealtimetrik.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;



    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }

    @RequestMapping("getProductById/{productId}")
    public Product getProductById(@PathVariable(value = "productId") String productId) {
        return productService.getProductById(productId);

    }

    @RequestMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable(value = "productId") String productId) {
        productService.deleteProduct(productId);
        return "deleted";
    }



    @PostMapping(value = "/product/addProduct")
    public Product addProduct(@Valid @RequestBody Product product) {

      return   productService.addProduct(product);


    }


    @PostMapping(value = "/product/editProduct")
    public Product editProduct(@RequestBody Product product) {
     return    productService.editProduct(product);

    }





}
