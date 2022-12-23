package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> create(@RequestBody User user) throws URISyntaxException {
        log.info("Rest request to create user");
        User result = userService.save(user);
        return ResponseEntity
                .created(new URI("/api/users" + result.getId()))
                .body(result);
    }

    @GetMapping("/users-id/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        log.info("Rest request to get user : {}", id);
        User result = userService.findById(id).get();
        return ResponseEntity
                .ok()
                .body(result);
    }
}
