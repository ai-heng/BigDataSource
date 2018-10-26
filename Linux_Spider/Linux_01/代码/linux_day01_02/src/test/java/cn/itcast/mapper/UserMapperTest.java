package cn.itcast.mapper;

import cn.itcast.pojo.User;
import cn.itcast.pojo.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_dao.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user);
    }

    @Test
    public void selectByExample() throws Exception {
        // 需求: 查询所有用户信息
        UserExample example = new UserExample();

        List<User> userList = userMapper.selectByExample(example);
        System.out.println("==========================================");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void selectByExample02() throws Exception {
        // 需求: 查询姓"李"的用户 且 age=28
        UserExample example = new UserExample();

        // 增加条件
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%李%");
        criteria.andAgeEqualTo(28);

        List<User> userList = userMapper.selectByExample(example);
        System.out.println("==========================================");
        for (User user : userList) {
            System.out.println(user);
        }
    }



    @Test
    public void deleteByPrimaryKey() throws Exception {
        userMapper.deleteByPrimaryKey(9L);
    }

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setUserName("zhoubotong");
        user.setName("周伯通");

        userMapper.insert(user);
    }

    @Test
    public void insertSelective() throws Exception {
        User user = new User();
        user.setUserName("duanwangye");
        user.setName("段王爷");

        userMapper.insertSelective(user);
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
        User user = new User();
        user.setId(11L);
        user.setUserName("duanyu");
        user.setName("段誉");

        userMapper.updateByPrimaryKeySelective(user);
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
        // 先查
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println("=====================================================================================");
        // 后改
        user.setAge(8000);
        userMapper.updateByPrimaryKey(user);
    }

}