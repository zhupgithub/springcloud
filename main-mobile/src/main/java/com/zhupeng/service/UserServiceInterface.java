package com.zhupeng.service;

import com.zhupeng.constant.ServiceConstant;
import com.zhupeng.mobile.user.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = ServiceConstant.PC_SERVICE)
public interface UserServiceInterface extends UserService {
}
