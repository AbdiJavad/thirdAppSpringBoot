package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.User;
import com.javad.thirdappspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> users() {
        return (List<User>) userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    public void  delete(int id){
        userRepository.deleteById(id);
    }

    public User update(int id,User user){
        User userData=userRepository.findById(id).get();

        if(user.getFirstname()!=null)
            userData.setFirstname(user.getFirstname());
        if (user.getLastname()!=null)
            userData.setLastname(user.getLastname());

        return userRepository.save(userData);
    }
}
