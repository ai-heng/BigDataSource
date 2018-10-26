package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {
    public User isLogin(User user) {
        //调用UserDao层的功能, 获取查询数据库后的对象.
        UserDao ud = new UserDao();
       /* User loginUser = ud.isLogin(user);

        //将获取到的对象, 返回给: web层.
        return loginUser;*/

       //优化上述两行代码
        return ud.isLogin(user);
    }
}
