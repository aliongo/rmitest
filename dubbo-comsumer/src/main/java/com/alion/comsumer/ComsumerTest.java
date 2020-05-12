package com.alion.comsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alion.serice.IUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComsumerTest implements CommandLineRunner {

    @Reference(interfaceClass = IUserService.class)
    private IUserService iUserService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(iUserService.selectUserById(1));
    }
}
