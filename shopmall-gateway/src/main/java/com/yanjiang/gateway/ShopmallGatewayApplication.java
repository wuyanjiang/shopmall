package com.yanjiang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ShopmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallGatewayApplication.class, args);
    }

}
