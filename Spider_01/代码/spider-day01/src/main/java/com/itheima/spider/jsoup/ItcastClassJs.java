package com.itheima.spider.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

// 基于原生js的方式来解析HTML文档
public class ItcastClassJs {

    public static void main(String[] args) throws IOException {
        String url = "http://www.itcast.cn";
        //1. 使用jsoup获取document
        Document document = Jsoup.connect(url).get();
        //2. 解析数据
        Elements divEls = document.getElementsByClass("nav_txt");
        Element divEl = divEls.get(0);
        Elements ulEls = divEl.getElementsByTag("ul");
        Element ulEl = ulEls.get(0);
        Elements liEls = ulEl.getElementsByTag("li");
        for (Element liEl : liEls) {
            /*String text = liEl.text();
            System.out.println(text);*/
            Elements aEls = liEl.getElementsByTag("a");
            Element aEl = aEls.get(0);
            String text = aEl.text();
            System.out.println(text);
        }
    }
}
