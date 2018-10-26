package cn.itcast.a;

import org.springframework.stereotype.Repository;

// <bean id="userDaoImpl" class="cn.itcast.a.UserDaoImpl"/>
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void queryUserByUsernameAndPassword() {
        System.out.println("2. 1111111111111调用 dao.queryUserByUsernameAndPassword() ... ...");
    }
}
