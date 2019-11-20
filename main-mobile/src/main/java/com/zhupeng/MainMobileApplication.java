package com.zhupeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MainMobileApplication {

    public static void main(String[] args) {
        log.info("手机端主流业务启动中……");
        SpringApplication.run(MainMobileApplication.class , args);
        log.info("手机端主流业务启动完成！");
    }

}
