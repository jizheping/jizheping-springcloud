package com.jizheping.controller;

import com.alibaba.fastjson.JSONObject;
import com.jizheping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/account" )
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping( "/getAccountList" )
    public String getAccountList(){
        return accountService.getAccountList();
    }
}
