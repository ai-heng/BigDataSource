package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMapperTest {

    private UserMapper userMapper;

    SqlSession sqlSession;

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        // 1 加载mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        // 2 创建执行sql的对象
        sqlSession = sqlSessionFactory.openSession(true);

        // 3 实例化接口的实现类(mybatis)
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void queryUserById() throws Exception {
        User user = userMapper.queryUserById(1L);
        System.out.println(user);
    }

    @Test
    public void queryAll() throws Exception {
        List<User> userList = userMapper.queryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setuserName("zhaomin03");
        user.setPassword("123");
        user.setName("赵敏03");
        user.setAge(18);
        user.setSex(1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat.parse("2000-9-9");
        user.setBirthday(birthday);

        userMapper.addUser(user);

        System.out.println("新增的用户编号: " + user.getId());
    }

    @Test
    public void updateUser() throws Exception {
        // 先查
        User user = userMapper.queryUserById(13L);
        user.setAge(250);

        // 后改
        userMapper.updateUser(user);
    }

    @Test
    public void updateUser02() throws Exception {
        User user = new User();

        user.setId(15L);
        user.setuserName("yangmi");
        user.setName("杨幂");

        userMapper.updateUser(user);
    }

    @Test
    public void delById() throws Exception {
        userMapper.delById(8L);
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        User user = userMapper.queryUserByUsernameAndPassword("lisi", "123456");
        System.out.println(user);
    }

    @Test
    public void queryUserByUsernameAndPassword02() {
        User user = userMapper.queryUserByUsernameAndPassword("wangwu' -- ", "skldfjskfdjdslkfjdsklfj");
        System.out.println(user);
    }

    @Test
    public void queryManUsersByName() {
        List<User> userList = userMapper.queryManUsersByName("张");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void queryAllWithSort() {
        List<User> userList = userMapper.queryAllWithSort(10000);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void queryAllByNameAndAge() {
        List<User> userList = userMapper.queryAllByNameAndAge("张", 25);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void queryUsersByIds() {
        List<Long> idList = new ArrayList<Long>();
        idList.add(1L);
        idList.add(2L);
        idList.add(3L);

        List<User> userList = userMapper.queryUsersByIds(idList);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test1LevelCache() {
        User user = userMapper.queryUserById(1L); // 会
        System.out.println(user);

        System.out.println("------------------------------------------------------");
        userMapper.delById(15L);
        System.out.println("------------------------------------------------------");

        User user02 = userMapper.queryUserById(1L); //
        System.out.println(user02);
    }

    @Test
    public void test2LevelCache() {
        User user = userMapper.queryUserById(1L); // 会
        System.out.println(user);

        System.out.println("------------------------------------------------------");

        // 销毁sqlSession
        sqlSession.close();

        sqlSession = sqlSessionFactory.openSession(true);
        userMapper= sqlSession.getMapper(UserMapper.class);

        System.out.println("------------------------------------------------------");

        User user02 = userMapper.queryUserById(1L); //
        System.out.println(user02);
    }
}