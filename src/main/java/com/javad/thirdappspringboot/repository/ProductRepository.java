package com.javad.thirdappspringboot.repository;

import com.javad.thirdappspringboot.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer>{
}
