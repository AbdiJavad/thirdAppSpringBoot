package com.javad.thirdappspringboot.controller;

import com.javad.thirdappspringboot.model.Product;
import com.javad.thirdappspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findProduct(){
        return productService.findProduct();
    }
    @PostMapping
    public Product save (@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);

    }
    @PutMapping({"/{id}"})
    public Product update(@PathVariable int id,@RequestBody Product product){
        return productService.update(id,product);

    }

}
