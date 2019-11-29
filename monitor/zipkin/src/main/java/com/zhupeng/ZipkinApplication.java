package com.zhupeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import zipkin.storage.mysql.MySQLStorage;
import zipkin2.server.internal.EnableZipkinServer;

import javax.sql.DataSource;


@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinApplication {

    public static void main(String[] args) {
        log.info("zipkin监控启动中……");
        SpringApplication.run(ZipkinApplication.class , args);
        log.info("zipkin监控启动完成！");
    }
//    @Bean
//    @Primary
//    public MySQLStorage mySQLStorage(DataSource datasource) {
//        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
//    }
}
