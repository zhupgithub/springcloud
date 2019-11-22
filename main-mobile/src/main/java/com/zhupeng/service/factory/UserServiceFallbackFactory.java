//package com.zhupeng.service.factory;
//
//import com.zhupeng.mobile.user.service.UserService;
//import com.zhupeng.service.fallback.UserServiceFallback;
//import feign.hystrix.FallbackFactory;
//
//public class UserServiceFallbackFactory implements FallbackFactory<UserService> {
//    @Override
//    public UserService create(Throwable cause) {
//        UserServiceFallback userServiceFallback = new UserServiceFallback();
//        userServiceFallback.setCause(cause);
//        return userServiceFallback;
//    }
//}
