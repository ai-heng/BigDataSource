package com.itheima.spider.jdk;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//演示使用原生jdk发送get请求
public class JDKGet {

    public static void main(String[] args) throws Exception {
        //1.确定url
        String indexUrl = "http://www.itcast.cn?username=xiaochaun";

        //2. 发送请求, 获取数据
        //2.1: 将url转换成一个url对象
        URL url = new URL(indexUrl);
        //2.2 : 根据这个url获取此url的远程连接
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        //2.3: 设置请求方式
        connection.setRequestMethod("GET");// 注意 此处的请求方式的值一定要大写

        //2.4 : 设置参数: 请求参数, 请求头

        //2.5 发送请求
        InputStream in = connection.getInputStream();// 获取输入流,
        //2.6 获取数据
        int len = 0;
        byte[] b = new byte[1024];
        while( (len = in.read(b) ) !=-1 ){
            System.out.println(new String(b,0,len));// 注意String的包的问题
        }
        in.close();
    }
}
