package com.zhupeng.controller;

import com.zhupeng.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("test")
    public String test(){
        redisUtil.hset("zhupeng" , "test" , "zhp");

        return "success";
    }
}
