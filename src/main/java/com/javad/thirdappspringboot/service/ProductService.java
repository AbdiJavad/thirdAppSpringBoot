package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.Product;
import com.javad.thirdappspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {
    public Class ProductService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> findProduct() {
        return (List<Product>) productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

}
