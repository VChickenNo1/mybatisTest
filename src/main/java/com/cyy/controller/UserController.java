package com.cyy.controller;

import com.cyy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/hello")
    public String hello() {
        return userService.findAll();
    }

}
