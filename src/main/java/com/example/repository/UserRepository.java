package com.example.repository;

import com.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User findByUserName(String username) {
        return new User("shiley","12345");
    }
}
