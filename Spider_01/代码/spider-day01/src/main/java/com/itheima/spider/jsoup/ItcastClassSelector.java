package com.itheima.spider.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

// 使用 选择器的方式来解析数据
public class ItcastClassSelector {

    public static void main(String[] args) throws IOException {
        //1. 确定url
        String url = "http://www.itcast.cn";

        //2. 使用jsoup获取document对象
        Document document = Jsoup.connect(url).get();

        //3. 解析数据
        Elements aEls = document.select(".nav_txt>ul>li>a");
        for (Element aEl : aEls) {
            System.out.println(aEl.text());
        }
    }
}
