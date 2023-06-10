package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.Address;
import com.javad.thirdappspringboot.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> findAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }
}
