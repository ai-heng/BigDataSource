package cn.itcast.a;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class DbutilsTest {
    public static void main(String[] args) throws SQLException {
        // 1 创建连接池
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring03_db");
        ds.setUsername("root");
        ds.setPassword("123");

        // 2 创建执行sql对象
        QueryRunner qr = new QueryRunner(ds);

        // 3 编写sql
        String sql = "create table book(id int primary key auto_increment, name varchar(50), price double)";

        // 4 执行sql
        qr.update(sql);
    }
}
