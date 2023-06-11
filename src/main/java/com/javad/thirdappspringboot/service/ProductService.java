package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.Product;
import com.javad.thirdappspringboot.model.User;
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

    public void delete(int id){
        productRepository.deleteById(id);
    }

    public Product Update(int id,Product product){
        Product productData = productRepository.findById(id).get();

        if(product.getName()!=null)
            productData.setName(product.getName());
         if (product.getCount()>0)
            productData.setCount(product.getCount());
        if (product.getPrice()>0)
            productData.setPrice(product.getPrice());

        return productRepository.save(productData);

    }

}
