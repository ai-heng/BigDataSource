package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    public List<User> queryAll() throws SQLException {
        // 1 创建执行sql的对象
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        // 2 书写sql语句
        String sql = "select * from user";
        // 3 执行sql
        List<User> userList = queryRunner.query(sql, new BeanListHandler<User>(User.class));
        return userList;
    }
}
