//package com.zhupeng.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * =========================================
// * WebSecurityConfig
// *
// * @Author: ErickWu
// * @CreateDate: 2018-09-29 10:42
// * @Version: 1.0
// * Copyright: Copyright (c) 2018-09-29 10:42
// * =========================================
// */
//@EnableWebSecurity
//public class WebSecurityConfig implements WebMvcConfigurer {
//
//    @Bean
//    public UserDetailsService userDetailsService() throws Exception {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withDefaultPasswordEncoder().username("root").password("root").roles("administrator").build());
//        return manager;
//    }
//}
