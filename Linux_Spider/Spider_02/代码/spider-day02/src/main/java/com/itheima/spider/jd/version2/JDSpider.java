package com.itheima.spider.jd.version2;

import com.google.gson.Gson;
import com.itheima.spider.jd.dao.ProductDao;
import com.itheima.spider.jd.pojo.Product;
import com.itheima.spider.jd.utils.HttpClientUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JDSpider {
    private static ProductDao productDao = new ProductDao();
    private static ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(1000);

    // 爬取jd商城的所有的手机信息
    public static void main(String[] args) throws Exception {
        /*//1.确定url
        String url = "https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8";

        //2. 发送请求, 获取数据
        String html = HttpClientUtils.doGet(url);

        //3. 解析数据
        parsePid(html);*/
        threadPoolExecute();// 注意一定要写在上面
        page();

    }


    //线程相关的内容
    public static void threadPoolExecute() {
        //开启30个线程同时消费pid
        ExecutorService threadPool = Executors.newFixedThreadPool(30);

        for (int i = 1; i <= 30; i++) {
            threadPool.execute(new Runnable() {
                public void run() {
                    while (true) {
                        //1.获取pid
                        try {
                            String pid = blockingQueue.take();
                            //2. 拼接url, 解析商品数据
                            Product product = parseProduct(pid);
                            //3. 保存数据
                            productDao.addProduct(product);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }

    }

    //分页
    public static void page() throws Exception {
        //https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&page=7
        for (int i = 1; i <= 100; i++) {
            String pageUrl = "https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&page=" + (2 * i - 1);
            String html = HttpClientUtils.doGet(pageUrl);
            parsePid(html);
        }
    }

    //解析pid
    private static void parsePid(String html) throws Exception {
        //3.1 将HTML转换成document
        Document document = Jsoup.parse(html);
        //3.2 解析pid
        Elements liEls = document.select("[class=gl-warp clearfix]>li");
        for (Element liEl : liEls) {
            String pid = liEl.attr("data-pid");


            //将pid存储到阻塞队列中

            blockingQueue.put(pid);
        }

    }

    // 根据给定pid, 解析商品数据
    private static Product parseProduct(String pid) throws Exception {
        //1. 拼接url(确定url)
        String productUrl = "https://item.jd.com/" + pid + ".html";

        //2. 发送请求, 获取数据
        String html = HttpClientUtils.doGet(productUrl);

        Product product = new Product();
        //3.解析商品数据
        //3.1 将HTML转换成document对象
        Document document = Jsoup.parse(html);
        //3.2 获取商品的标题
        Elements titleEl = document.select(".sku-name");
        product.setTitle(titleEl.text());

        //3.3 获取商品的价格: 暂不获取
        /*Elements priceEl = document.select("[class=price J-p-"+pid+"]");
        System.out.println(priceEl);
        product.setPrice(priceEl.text());*/

        //https://p.3.cn/prices/mgets?skuIds=J_5089275
        String priceUrl = "https://p.3.cn/prices/mgets?skuIds=J_" + pid;
        String priceJson = HttpClientUtils.doGet(priceUrl);
        //回顾json: json格式有几种: 二种  []js中的数组  {}js中的对象
        // var persion  = {"name":"张三"}
        // java中可以将标准的json字符串转换成什么东东呢?
        // [] : 可以转换数组 也可以转换成 集合(list set)
        // {} : 可以转换成 对象  也可以转换成map
        // 如何区分一个json字符串是什么类型的呢?  只需要查看json的最外侧的符号, 如果是[] 就是数组 如果是{} 对象
        Gson gson = new Gson();
        List<Map<String, String>> list = gson.fromJson(priceJson, List.class);
        String price = list.get(0).get("p");
        product.setPrice(price);

        //3.4 获取商品的品牌
        Elements brandEl = document.select("#parameter-brand>li");
        product.setBrand(brandEl.attr("title"));

        //3.5 获取商品的名称
        Elements nameEl = document.select("[class=parameter2 p-parameter-list]>li:first-child");
        product.setName(nameEl.attr("title"));

        //3.6 填充url 和 pid
        product.setPid(pid);
        product.setUrl(productUrl);

        return product;
    }
}
