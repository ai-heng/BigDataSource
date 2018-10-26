package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户集合
     */
    public List<User> queryAll();

    /**
     * 添加用户
     */
    void addUser(User user);

    /**
     * 修改用户
     */
    void editUser(User user);

    /**
     * 批量删除
     */
    void delByIds(@Param("idList") List<Long> ids);
}
