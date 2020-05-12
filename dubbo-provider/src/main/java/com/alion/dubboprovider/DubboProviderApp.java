package com.alion.dubboprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@EnableDubboConfiguration
public class DubboProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class,args);
    }
}
