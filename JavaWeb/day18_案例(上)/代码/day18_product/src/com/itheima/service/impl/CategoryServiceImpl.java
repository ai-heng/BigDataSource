package com.itheima.service.impl;

import com.itheima.dao.CategoryDao;
import com.itheima.dao.impl.CategoryDaoImpl;
import com.itheima.domain.Category;
import com.itheima.service.CategoryService;
import flexjson.JSON;
import flexjson.JSONSerializer;

import java.sql.SQLException;
import java.util.List;

/**
 * 操作分类信息的: 业务层实现类
 */
public class CategoryServiceImpl implements CategoryService {
    @Override
    public String findAllCategory() {
        //1. 调用dao层, 获取数据. List<Category>
        CategoryDao cd = new CategoryDaoImpl();
        try {
            List<Category> list = cd.findAllCategory();
            //2.将其转成: json字符串.
            //3. 返回结果给: web层.

            return new JSONSerializer().exclude("*.class").serialize(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
