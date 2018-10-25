package com.itheima.dao;

import com.itheima.domain.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * 操作分类信息的: 数据层接口
 */
public interface CategoryDao {
    List<Category> findAllCategory() throws SQLException;
}
