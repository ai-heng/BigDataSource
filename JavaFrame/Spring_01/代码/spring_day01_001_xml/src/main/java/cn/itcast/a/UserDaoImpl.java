package cn.itcast.a;

public class UserDaoImpl implements UserDao {
    @Override
    public void queryUserByUsernameAndPassword() {
        System.out.println("2. 调用 dao.queryUserByUsernameAndPassword() ... ...");
    }
}
