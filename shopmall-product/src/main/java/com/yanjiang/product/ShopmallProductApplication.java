package com.yanjiang.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableDiscoveryClient
@EnableFeignClients(basePackages="com.yanjiang.product.feign")
@SpringBootApplication
public class ShopmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallProductApplication.class, args);
    }

}
