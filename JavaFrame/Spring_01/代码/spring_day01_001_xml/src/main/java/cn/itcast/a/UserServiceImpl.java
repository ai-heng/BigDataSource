package cn.itcast.a;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
        System.out.println("1. 调用service.login() ... ...");
        // 调用dao 操作数据库
        userDao.queryUserByUsernameAndPassword();
    }
}
