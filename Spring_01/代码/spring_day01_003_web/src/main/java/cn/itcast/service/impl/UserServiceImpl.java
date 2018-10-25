package cn.itcast.service.impl;

import cn.itcast.service.UserService;
import org.springframework.stereotype.Service;

// <bean id="userServiceImpl" class="cn.itcast.service.impl.UserServiceImpl"/>
@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("********************************* 调用UserServiceImpl的构造方法 ... ...");
    }

    @Override
    public void login() {
        System.out.println("============================ 调用业务类的login() ... ...");
    }
}
