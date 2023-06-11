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
    public void delete(int id){
        addressRepository.deleteById(id);
    }

    public Address Update(int id,Address address){
        Address addressData=addressRepository.findById(id).get();

        if (address.getCountry()!=null)
            addressData.setCountry(address.getCountry());
        if (address.getCity()!=null)
            addressData.setCity(address.getCity());
         if (address.getBlock()> 0)
          addressData.setBlock(address.getBlock());
        if (address.getAlley()!=null)
            addressData.setAlley(address.getAlley());
         if (address.getUnit()>0)
            addressData.setUnit(address.getUnit());
        return addressRepository.save(addressData);
    }
}
