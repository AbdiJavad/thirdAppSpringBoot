package com.javad.thirdappspringboot.repository;

import com.javad.thirdappspringboot.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{
}
