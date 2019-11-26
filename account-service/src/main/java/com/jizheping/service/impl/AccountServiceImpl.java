package com.jizheping.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jizheping.mapper.AccountMapper;
import com.jizheping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public String getAccountList(){
        List accountList = accountMapper.getAccountList();

        String json = JSONArray.toJSONString(accountList);

        return json;
    }
}
