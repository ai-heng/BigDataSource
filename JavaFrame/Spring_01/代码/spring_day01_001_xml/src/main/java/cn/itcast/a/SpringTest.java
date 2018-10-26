package cn.itcast.a;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void demo01() {
        UserDao userDao = new UserDaoImpl();
        userDao.queryUserByUsernameAndPassword();
    }

    @Test
    public void demo02() {
        // 让spring框架帮我们new出dao
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.queryUserByUsernameAndPassword();
    }

    @Test
    public void demo03() {
        // 让spring框架帮我们new出service
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        userService.login();
    }
}
