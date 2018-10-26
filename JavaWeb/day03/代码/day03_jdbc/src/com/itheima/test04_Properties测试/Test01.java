package com.itheima.test04_Properties测试;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) {
        /*
            Properties: 是一个双列集合, 是Hashtable的子类, 键值都是String类型.
                它是唯一一个可以直接和IO流相结合使用的集合类.
         */
        Properties pp = new Properties();
        //需求1: 通过Properties从a.properties中读取数据.
        try {
            pp.load(new FileReader("day03_jdbc\\src\\a.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("修改前的数据: " + pp);


        //需求2: 通过Properties往a.properties中写数据.
        pp.setProperty("name","dalihang");
        pp.setProperty("phone","13161290281");

        try {
            pp.store(new FileWriter("day03_jdbc\\src\\a.properties"),"hanghang");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("修改后的数据: " + pp);
    }
}
