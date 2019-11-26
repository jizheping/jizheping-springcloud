package com.jizheping.controller;

import com.alibaba.fastjson.JSONObject;
import com.jizheping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/user" )
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping( "/getUserList" )
    public String getUserList(){
        return userService.getUserList();
    }
}
