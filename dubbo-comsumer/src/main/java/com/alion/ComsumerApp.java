package com.alion;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ComsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerApp.class,args);
    }
}
