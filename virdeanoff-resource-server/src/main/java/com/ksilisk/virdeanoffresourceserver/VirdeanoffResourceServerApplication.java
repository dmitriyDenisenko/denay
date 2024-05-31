package com.ksilisk.virdeanoffresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class VirdeanoffResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirdeanoffResourceServerApplication.class, args);
    }

}
