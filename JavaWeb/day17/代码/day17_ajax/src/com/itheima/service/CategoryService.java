package com.itheima.service;

import com.itheima.dao.CategoryDao;
import com.itheima.domain.Category;
import flexjson.JSONSerializer;

import java.util.List;

public class CategoryService {

    public String findAllCategory() {
        //1. 调用dao层, 获取List<Category>.
        CategoryDao cd = new CategoryDao();
        List<Category> list = cd.findAllCategory();

        //2. 将List集合转成json字符串.
        JSONSerializer js = new JSONSerializer();
        String str = js.exclude("*.class").serialize(list);
        //3. 将结果返回给web层.
        return str;

        //return new JSONSerializer().exclude("*.class").serialize(list);
    }
}
