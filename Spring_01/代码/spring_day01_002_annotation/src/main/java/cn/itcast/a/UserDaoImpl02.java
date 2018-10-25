package cn.itcast.a;

import org.springframework.stereotype.Repository;

// <bean id="userDaoImpl02" class="cn.itcast.a.UserDaoImpl"/>
@Repository
public class UserDaoImpl02 implements UserDao {
    @Override
    public void queryUserByUsernameAndPassword() {
        System.out.println("2. 22222222222222222222调用 dao.queryUserByUsernameAndPassword() ... ...");
    }
}
