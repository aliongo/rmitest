package com.alion.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alion.pojo.User;
import com.alion.serice.IUserService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IUserService.class)
@Component
public class UserServiceImpl implements IUserService {
    @Override
    public User selectUserById(Integer id) {

        User user = new User();
        user.setId(id);
        user.setName("admin");

        System.out.println("userId:" + id+"UserName"+user.getName());
        return user;
    }
}
