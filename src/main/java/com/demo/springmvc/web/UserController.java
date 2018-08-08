package com.demo.springmvc.web;

import com.demo.springmvc.entity.User;
import com.demo.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("info/{id}")
    public User getUserInfo(@PathVariable("id") Long id){
        return userService.getUser(id);
    }
}
