package com.sushant.SpringSecDemo.controller;

import com.sushant.SpringSecDemo.model.User;
import com.sushant.SpringSecDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
