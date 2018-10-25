package cn.itcast.a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// <bean id="userServiceImpl" class="cn.itcast.a.UserServiceImpl"/>
@Service
public class UserServiceImpl implements UserService {
    // 方式一
    // 自动装配: 根据类型进行匹配注入
    //@Autowired
    //@Qualifier("userDaoImpl02")

    // 方式二:
    @Value("#{userDaoImpl02}")
    private UserDao userDao;

    // 注入普通属性
    @Value("杨幂")
    private String meinv;

    @Override
    public void login() {
        System.out.println("1. 调用service.login() ... ... meinv = " + meinv);
        // 调用dao 操作数据库
        userDao.queryUserByUsernameAndPassword();
    }
}
