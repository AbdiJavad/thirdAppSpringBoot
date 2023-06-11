package com.javad.thirdappspringboot.repository;

import com.javad.thirdappspringboot.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}
