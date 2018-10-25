package com.itheima.spider.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class JsoupTest {
    // 演示获取document的方式
    public static void main(String[] args) throws IOException {
        //1. 最常用的一种
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>jsoup获取document最常用的一种方式</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        Document document = Jsoup.parse(html);
        String title = document.title();
        System.out.println(title);


        //2. 最简单的方式
        String url = "http://www.itcast.cn";
        Document document1 = Jsoup.connect(url).get();
       // System.out.println(document1);

        //3. 支持将HTML的代码片段转化成document
        Document document2 = Jsoup.parseBodyFragment("<a>跳转首页url</a>");
        //Document document2 = Jsoup.parse("<a>跳转首页url</a>");
        String text = document2.text();
        System.out.println(text);

        //4. 获取本地的HTML文档
        Document document3 = Jsoup.parse(new File(""), "utf-8");

    }

}
