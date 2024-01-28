package com.example.demo.controller;

import com.example.demo.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    public UserController(UserService userService) {
        this.userService = userService;

    }

    private final UserService userService;

    // Vrem sa accesam ca /user/search?name=numeleCautat
    @GetMapping("/search")
    private List<User> GetUserByName(@RequestParam String numeCautat){
        return userService.getUserByName(numeCautat);
    }

}
