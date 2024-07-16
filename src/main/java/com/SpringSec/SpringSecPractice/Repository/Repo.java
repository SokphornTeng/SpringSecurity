package com.SpringSec.SpringSecPractice.Repository;

import com.SpringSec.SpringSecPractice.Model.Entity.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
