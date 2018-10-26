package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface UserService {
    // 查询用户集合
    List<User> queryAll();
}
