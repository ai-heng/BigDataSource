package cn.itcast.b_spring_jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJDBCTest {
    @Test
    public void demo01() {
        // 1 连接池
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring03_db");
        ds.setUsername("root");
        ds.setPassword("123");

        // 2 创建执行sql的对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);

        // 3 编写sql
        String sql = "insert into book(id, name, price) values(null, ?, ?)";

        // 4 执行sql 获得结果 处理结果
        Object[] paramArr = {"天龙八部", 9.9};
        jdbcTemplate.update(sql, paramArr);
    }

    @Test
    public void demo02() {
        // 1 连接池
        // 2 创建执行sql的对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);

        // 3 编写sql
        String sql = "insert into book(id, name, price) values(null, ?, ?)";

        // 4 执行sql 获得结果 处理结果
        Object[] paramArr = {"笑傲江湖", 9.9};
        jdbcTemplate.update(sql, paramArr);
    }
}
