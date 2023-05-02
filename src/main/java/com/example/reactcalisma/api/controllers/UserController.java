package com.example.reactcalisma.api.controllers;
import com.example.reactcalisma.business.UserService;
import com.example.reactcalisma.dataAccess.UserRepository;
import com.example.reactcalisma.entiti.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping  ("/user")
    public User createUser(@RequestBody User user){

        return  userService.save(user);

    }
}
