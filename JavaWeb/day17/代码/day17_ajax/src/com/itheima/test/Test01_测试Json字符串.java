package com.itheima.test;

import com.itheima.domain.Category;
import flexjson.JSONSerializer;

public class Test01_测试Json字符串 {
    public static void main(String[] args) {
        //1. 创建一个Java对象.
        Category c = new Category(1, "手机数码");

        //2. 将其转换成: json字符串.     借助第三方jar包
        //2.1 创建可以转换成: json字符串的对象.
        JSONSerializer js = new JSONSerializer();
        //2.2 调用功能, 转换即可.
        String str = js.exclude("*.class").serialize(c);

        //2.3 移除: class属性

        //3. 打印结果.
        System.out.println(str);
    }
}
