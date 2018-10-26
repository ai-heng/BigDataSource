package com.itheima.spider.httpClient;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

// 演示使用httpClient发送get请求
public class HttpClientGet {
    public static void main(String[] args) throws IOException {
        //1. 确定url
        String url = "http://www.itcast.cn?username=hangge";

        //2. 发送请求, 获取数据
        //2.1 获取httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2.2 创建请求方式
        HttpGet httpGet = new HttpGet(url);

        //2.3 设置参数: 请求参数 请求头
        httpGet.setHeader("user-agent","Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36");

        //2.4 发送请求, 获得响应对象
        // CloseableHttpResponse包含了响应行, 响应头, 响应体
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //2.5 获取数据
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

        if(statusCode==200){
            //表示请求成功
            // 获取响应头
            Header[] headers = response.getHeaders("Content-Type");
            String value = headers[0].getValue();
            System.out.println(value);

            // 获取响应体
            String html = EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println(html);
        }
    }
}
