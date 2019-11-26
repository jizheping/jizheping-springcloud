package com.jizheping.accountFeign.fallback;

import com.jizheping.accountFeign.AccountFeign;

public class AccountFeignFallBack implements AccountFeign {
    @Override
    public String getAccountList() {
        System.out.println("出错误啦!");

        return null;
    }
}
