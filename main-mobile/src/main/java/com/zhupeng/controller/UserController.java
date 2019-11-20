package com.zhupeng.controller;

import com.zhupeng.entity.vo.UserVo;
import com.zhupeng.mobile.user.service.UserService;
import com.zhupeng.utils.RedisUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Value("${username}")
    String username;

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("test")
    public String test(){
        UserVo userVo = new UserVo();
        userVo.setUsername("zhuhhh");
        userVo.setAge(100);

        userService.addUser(userVo);

        redisUtil.hset("zhupeng" , "test" , "zhp");

        return "success" + username;
    }
}
