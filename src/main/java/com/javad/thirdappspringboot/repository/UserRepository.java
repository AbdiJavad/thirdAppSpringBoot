package com.javad.thirdappspringboot.repository;

import com.javad.thirdappspringboot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
