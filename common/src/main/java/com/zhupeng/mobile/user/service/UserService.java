package com.zhupeng.mobile.user.service;

import com.zhupeng.entity.ResponseResult;
import com.zhupeng.entity.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

    @PostMapping("/addUser")
    ResponseResult addUser(@RequestBody UserVo userVo);

    @GetMapping("test")
    ResponseResult test();
}
