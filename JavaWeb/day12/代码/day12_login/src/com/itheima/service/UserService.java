package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {
    public boolean isLogin(User user) { //admin, 123
        //1. 调用dao层, 获取数据.
        UserDao ud = new UserDao();
        //查询后的数据             查询前的数据
        User loginUser = ud.isLogin(user);

        //2. 结果返回给: web层.
        return loginUser != null;
    }
}
