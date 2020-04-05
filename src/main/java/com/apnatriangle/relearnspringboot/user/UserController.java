package com.apnatriangle.relearnspringboot.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDaoService service;

    @GetMapping ("/users")
    public List<User> retriveAllUsers() {
        return service.findAll();
    }

    @GetMapping ("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        service.save(user);
    }

}
