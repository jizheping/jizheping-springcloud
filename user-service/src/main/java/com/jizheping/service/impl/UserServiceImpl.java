package com.jizheping.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jizheping.accountFeign.AccountFeign;
import com.jizheping.mapper.UserMapper;
import com.jizheping.service.UserService;
import netscape.javascript.JSObject;
import org.bouncycastle.tsp.TSPUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountFeign accountFeign;

    @Override
    public String getUserList(){
        List<Map> userList = userMapper.getUserList();

        List<Map> accountList = JSONArray.parseObject(accountFeign.getAccountList(), List.class);

        for (Map user : userList) {
            for (Map account : accountList) {
                if (user.get("id").equals(account.get("id"))) {
                    user.put("createTime", account.get("createTime"));
                    user.put("usableAmount", account.get("usableAmount"));
                    user.put("freezeAmount", account.get("freezeAmount"));
                }
            }
        }

        return JSONArray.toJSONString(userList);
    }
}
