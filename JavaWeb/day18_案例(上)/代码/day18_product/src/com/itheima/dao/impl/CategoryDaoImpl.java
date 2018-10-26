package com.itheima.dao.impl;

import com.itheima.dao.CategoryDao;
import com.itheima.domain.Category;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 操作分类信息的: 数据层 实现类
 */
public class CategoryDaoImpl implements CategoryDao {
    @Override
    public List<Category> findAllCategory() throws SQLException {
        //查询数据库, 获取数据.
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from category ;";
        return qr.query(sql, new BeanListHandler<Category>(Category.class));
    }
}
