package com.zhupeng.mobile.user.service;

import com.zhupeng.constant.ServiceConstant;
import com.zhupeng.entity.ResponseResult;
import com.zhupeng.entity.vo.UserVo;
import com.zhupeng.mobile.user.service.fallback.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = ServiceConstant.PC_SERVICE , fallback = UserServiceFallBack.class)
public interface UserService {

    @PostMapping("/addUser")
    ResponseResult addUser(UserVo userVo);
}
