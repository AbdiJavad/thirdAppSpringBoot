package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.Customer;
import com.javad.thirdappspringboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);

    }
}
