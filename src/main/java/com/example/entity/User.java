package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;

    private String email;



    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
