package com.itheima.spider.jdk;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// 演示 元素JDK发送post请求
public class JDKPost {

    public static void main(String[] args) throws Exception {
        //1.确定url
        String  indexUrl = "http://www.itcast.cn";
        //2. 发送请求, 获取数据
        //2.1 创建url对象
        URL url = new URL(indexUrl);
        //2.2 获取远程的连接对象
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();

        //2.3 设置请求方式
        connection.setRequestMethod("POST");

        //2.4 设置参数: 请求参数 请求头
        connection.setDoOutput(true);// 注意: 此代码一定要写在获取输出流之前
        OutputStream out = connection.getOutputStream();
        out.write("username=xiaochaun&age=58".getBytes());

        //2.5 发送请求
        InputStream in = connection.getInputStream();

        //2.6 获取数据
        int len = 0;
        byte[] b = new byte[1024];
        while((len = in.read(b))!=-1){
            System.out.println(new String(b,0,len));

        }
        in.close();
        out.close();


    }
}
