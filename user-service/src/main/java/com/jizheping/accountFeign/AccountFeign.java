package com.jizheping.accountFeign;

import com.jizheping.accountFeign.fallback.AccountFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "account-service",fallback = AccountFeignFallBack.class)
public interface AccountFeign {
    @RequestMapping( "/account/getAccountList" )
    public String getAccountList();
}
