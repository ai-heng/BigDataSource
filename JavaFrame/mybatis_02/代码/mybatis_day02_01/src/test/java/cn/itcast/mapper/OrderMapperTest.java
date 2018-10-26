package cn.itcast.mapper;

import cn.itcast.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class OrderMapperTest {

    private OrderMapper orderMapper;

    @Before
    public void setUp() throws Exception {
        // 1 加载mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        // 2 创建执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3 实例化接口的实现类(mybatis)
        orderMapper = sqlSession.getMapper(OrderMapper.class);
    }

    @Test
    public void queryOrderWithUserByOrdernumber() throws Exception {
        Order order = orderMapper.queryOrderWithUserByOrdernumber("20140921001");
        System.out.println(order);
    }

    @Test
    public void queryOrderWithUserAndOrderitemsByOrdernumber() throws Exception {
        Order order = orderMapper.queryOrderWithUserAndOrderitemsByOrdernumber("20140921001");
        System.out.println(order);
    }

    @Test
    public void queryOrderWithUserAndOrderitemsAndProductByOrdernumber() throws Exception {
        Order order = orderMapper.queryOrderWithUserAndOrderitemsAndProductByOrdernumber("20140921001");
        System.out.println(order);
    }

}