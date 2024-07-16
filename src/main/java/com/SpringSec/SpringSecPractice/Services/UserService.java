package com.SpringSec.SpringSecPractice.Services;

import com.SpringSec.SpringSecPractice.Model.Entity.User;
import com.SpringSec.SpringSecPractice.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private Repo myRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser( User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println("This is my password : " + user.getPassword());
        return this.myRepository.save(user);
    }
}
