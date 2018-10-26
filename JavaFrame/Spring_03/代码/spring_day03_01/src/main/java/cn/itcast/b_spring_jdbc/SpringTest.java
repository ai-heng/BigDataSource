package cn.itcast.b_spring_jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    // JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void demo01() {
        String sql = "insert into book(id, name, price) values(null, ?, ?)";
        Object[] paramArr = {"鹿鼎记", 9.9};
        jdbcTemplate.update(sql, paramArr);
    }

}
