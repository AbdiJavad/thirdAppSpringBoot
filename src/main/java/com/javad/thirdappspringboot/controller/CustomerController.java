package com.javad.thirdappspringboot.controller;

import com.javad.thirdappspringboot.model.Customer;
import com.javad.thirdappspringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> findCustomer() {
        return customerService.findCustomer();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        customerService.delete(id);
    }
    @PutMapping("/{id}")
    public Customer Update(@PathVariable int id,@RequestBody Customer customer){
        return customerService.Update(id,customer);
    }

}
