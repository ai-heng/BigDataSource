package cn.itcast.dao;

import cn.itcast.domain.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    // 查询用户集合
    List<User> queryAll() throws SQLException;
}
