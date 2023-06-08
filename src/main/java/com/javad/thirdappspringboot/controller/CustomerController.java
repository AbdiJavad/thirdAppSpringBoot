package com.javad.thirdappspringboot.controller;

import com.javad.thirdappspringboot.model.Customer;
import com.javad.thirdappspringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public Customer findCustomer(){
        return customerService.findCustomer();
    }
}
