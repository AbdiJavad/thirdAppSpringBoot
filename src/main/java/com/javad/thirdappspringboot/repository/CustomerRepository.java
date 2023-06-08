package com.javad.thirdappspringboot.repository;

import com.javad.thirdappspringboot.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
