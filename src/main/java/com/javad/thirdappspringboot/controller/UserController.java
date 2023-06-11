package com.javad.thirdappspringboot.controller;

import com.javad.thirdappspringboot.model.User;
import com.javad.thirdappspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> users() {

        return (List<User>) userService.users();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }
    @PutMapping("/{id}")
    public User update(@PathVariable int id,@RequestBody User user){

        return userService.update(id,user);

    }
}