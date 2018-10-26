package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    // 根据编号查询用户信息
    public User queryUserById(@Param("id") Long id);

    // 2 查询所有用户集合
    public List<User> queryAll();

    // 3 添加用户
    public void addUser(User user);

    // 4 修改用户
    public void updateUser(User user);

    // 5 根据编号删除用户
    public void delById(Long id);

    // 6 需求: 根据用户名和密码查询用户信息
    public User queryUserByUsernameAndPassword(@Param("uname") String username,
                                                @Param("pwd") String password);

    // 需求1：查询所有男性用户，如果输入了姓名，则按照姓名模糊查找；如果没有输入则不管姓名
    public List<User> queryManUsersByName(@Param("name") String name);

    // 需求2：查询所有用户，传递参数orderType，
    // 如果值为0，按照年龄升序排序，如果为1则按照年龄降序排序，否则按照ID排序
    public List<User> queryAllWithSort(@Param("orderType") int orderType);

    // 需求3：查询所有用户，如果有姓名不为空，则按照姓名模糊查找；如果年龄也不为空，则还要满足年龄条件。
    public List<User> queryAllByNameAndAge(@Param("name") String name,
                                            @Param("age") int age);

    // 需求5：根据多个ID查询用户
    public List<User> queryUsersByIds(@Param("ids") List<Long> ids);
}
