package com.zhupeng.controller.user;

import com.zhupeng.entity.ResponseResult;
import com.zhupeng.entity.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping("/addUser")
    public ResponseResult addUser(UserVo userVo){

        userVo.setUsername("zhupneg");
        userVo.setAge(12);

        return ResponseResult.successResult(userVo);
    }
}
