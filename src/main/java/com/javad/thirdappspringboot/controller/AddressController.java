package com.javad.thirdappspringboot.controller;

import com.javad.thirdappspringboot.model.Address;
import com.javad.thirdappspringboot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> findAddress(){
        return addressService.findAddress();
    }
    @PostMapping
    public Address save(@RequestBody Address address){
        return  addressService.save(address);
    }
}
