package com.SpringSec.SpringSecPractice.Controller;

import com.SpringSec.SpringSecPractice.Model.Entity.User;
import com.SpringSec.SpringSecPractice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService myUserService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return this.myUserService.saveUser(user);
    }

}
