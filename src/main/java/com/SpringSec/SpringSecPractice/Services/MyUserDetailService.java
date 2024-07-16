package com.SpringSec.SpringSecPractice.Services;

import com.SpringSec.SpringSecPractice.Model.Entity.User;
import com.SpringSec.SpringSecPractice.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private Repo myRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      User user =   myRepo.findByUsername(username);
      if(user == null) {
          System.out.println("User 404");
          throw new UsernameNotFoundException("User 404");
      }
        return new UserPrincipal(user);
    }
}
