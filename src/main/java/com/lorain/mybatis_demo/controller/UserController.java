package com.lorain.mybatis_demo.controller;

import com.lorain.mybatis_demo.dao.model.User;
import com.lorain.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo/")
@ConditionalOnProperty
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public User getUserByName(String name){
        return userService.getUserByName(name);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public int create(@RequestBody User user){
        return userService.create(user);
    }

}

