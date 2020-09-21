package com.ll.controller;

import com.ll.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    @ResponseBody
    public User getUer(){
        return new User(123L,"name","www.name.com");
    }
}
