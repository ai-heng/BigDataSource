package com.itheima.spider.httpClient;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

// 演示 使用httpClient发送Post请求
public class HttpClientPost {

    public static void main(String[] args) throws Exception {
        //1. 确定url
        String url = "http://www.itcast.cn";
        //2. 发送请求, 获取数据
        //2.1 获取httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //2.2 创建请求方式
        HttpPost httpPost = new HttpPost(url);

        //2.3 设置参数: 请求参数 和  请求头
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("username","hangge"));
        list.add(new BasicNameValuePair("age","18"));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list);
        httpPost.setEntity(entity);

        //2.4 发送请求
        CloseableHttpResponse response = httpClient.execute(httpPost);

        //2.5 获取数据
        int statusCode = response.getStatusLine().getStatusCode();
        if(statusCode==200){

            System.out.println(EntityUtils.toString(response.getEntity(),"utf-8"));
        }


    }
}
