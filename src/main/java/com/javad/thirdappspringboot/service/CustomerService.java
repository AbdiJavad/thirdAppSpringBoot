package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer findCustomer(){
        Customer customer=new Customer();
        customer.setId(12);
        customer.setFirstname("Amir");
        customer.setLastname("Abdi");
        customer.setAge(34);
        customer.setPhone(915523130);
        return customer;

    }
}
