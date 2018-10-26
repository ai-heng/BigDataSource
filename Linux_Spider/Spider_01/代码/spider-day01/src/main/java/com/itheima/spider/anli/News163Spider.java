package com.itheima.spider.anli;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class News163Spider {

    public static void main(String[] args) throws IOException {
        //1. 确定url
        String url = "https://news.163.com/18/1017/16/DUB7C0GE000189FH.html";

        //2. 发送请求, 获取数据
        //2.1 创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2.2 创建请求方式
        HttpGet httpGet = new HttpGet(url);

        //2.3 封装参数:
        // 标准的设置方式: 将请求头当中所有的信息, 全部填充
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36");


        //2.4 发送请求
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //2.5 获取数据
        String html = EntityUtils.toString(response.getEntity(), "UTF-8");

        //3.解析数据
        //3.1 获取document对象
        Document document = Jsoup.parse(html);
        //3.2 解析新闻数据
        //3.2.1 获取新闻的标题
        Elements h1El = document.select("#epContentLeft>h1");
        System.out.println(h1El.text());

        //3.2.2 获取新闻的发布时间
        Elements divEl = document.select(".post_time_source");
        String timeAndSource = divEl.text();
        System.out.println(timeAndSource);

        String[] split = timeAndSource.split("　");
        System.out.println(split[0]);

        //3.2.3 获取新闻的来源
        System.out.println(split[1]);

        //3.2.4 新闻的正文
        Elements pEls = document.select("#endText>p");
        for (Element pEl : pEls) {
            System.out.println(pEl.text());
        }

        //3.2.5 获取责任编辑
        Elements editorEl = document.select(".ep-editor");
        System.out.println(editorEl.text());
    }
}
