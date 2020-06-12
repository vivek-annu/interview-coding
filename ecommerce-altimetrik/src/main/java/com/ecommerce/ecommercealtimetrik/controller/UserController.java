package com.ecommerce.ecommercealtimetrik.controller;


import com.ecommerce.ecommercealtimetrik.model.User;
import com.ecommerce.ecommercealtimetrik.service.CustomerService;
import com.ecommerce.ecommercealtimetrik.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private CustomerService customerService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> listOfUsers() {
        return userService.getAllUsers();
    }


    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUserById(@PathVariable("id") String id) {
        userService.deleteUser(id);
    }


}
