package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<User> queryAll() {
        // 调用dao 查询用户集合
        UserDao userDao = new UserDaoImpl();
        List<User> userList = null;
        try {
            userList = userDao.queryAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
