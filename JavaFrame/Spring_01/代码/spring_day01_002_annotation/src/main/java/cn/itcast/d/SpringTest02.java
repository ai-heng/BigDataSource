package cn.itcast.d;

import cn.itcast.a.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//  代替: ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest02 {

    // 代替: LifeCycleBean lifeCycleBean = ac.getBean("lifeCycleBean", LifeCycleBean.class);
    // @Autowired : 根据类型匹配
    @Autowired
    private LifeCycleBean lifeCycleBean;

    @Autowired
    @Qualifier("userDaoImpl02")
    private UserDao userDao;

    @Test
    public void demo02() {
        userDao.queryUserByUsernameAndPassword();
    }

    @Test
    public void demo01() {
        // 1 实例化spring容器
        // 2 获取对应的bean
        // 3 测试
        lifeCycleBean.service();
        lifeCycleBean.service();
        lifeCycleBean.service();
    }




}
