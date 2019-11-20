package com.zhupeng.controller.user;

import com.zhupeng.entity.ResponseResult;
import com.zhupeng.entity.vo.UserVo;
import com.zhupeng.mobile.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@RequestMapping("user")
public class UserController implements UserService {


    @Override
    public ResponseResult addUser(UserVo userVo) {
        userVo.setUsername("zhupneg");
        userVo.setAge(12);

        System.out.println("======================================================" + userVo.toString() );
        return ResponseResult.successResult(userVo);
    }

    @Override
    public ResponseResult test() {
        UserVo userVo = new UserVo();
        userVo.setUsername("zhupneg");
        userVo.setAge(12);

        System.out.println("======================================================" + userVo.toString() );
        return ResponseResult.successResult(userVo);
    }
}
