package com.itheima.solrj;

import com.itheima.solrj.pojo.Product;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class IndexSearchSolrj {
    //原生的方式获取数据
    @Test
    public void indexSearchTest01() throws Exception {
        //1. 创建solrserver对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");

        //2. 执行查询
        SolrQuery solrQuery = new SolrQuery("*:*");
        QueryResponse response = solrServer.query(solrQuery);
        
        //3. 获取数据
        SolrDocumentList documentList = response.getResults();

        for (SolrDocument document : documentList) {
            String id = (String)document.get("id");
            String title = (String)document.get("title");
            Long price =(Long) document.get("price");
            String content =(String) document.get("content");
            System.out.println(id+"=="+title+"=="+price+"=="+content);
        }
    }

    //索引查询:返回javaBean
    @Test
    public void indexSearchTest02() throws Exception {
        //1. 创建solrserver对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");

        //2. 执行查询
        SolrQuery solrQuery = new SolrQuery("*:*");
        QueryResponse response = solrServer.query(solrQuery);

        //3. 获取数据:javaBean

        List<Product> productList = response.getBeans(Product.class);

        for (Product product : productList) {
            System.out.println(product);
        }
//响应回来的json字符串: {name:"",price:13000}

    }

    //抽取一个公共查询方法

    public void publicSearch(SolrQuery query) throws Exception {
        //1. 创建solrserver对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");

        //2. 执行查询
        QueryResponse response = solrServer.query(query);

        //3. 获取数据:javaBean

        List<Product> productList = response.getBeans(Product.class);

        for (Product product : productList) {
            System.out.println(product);
        }

    }

    //多样化查询
    @Test
    public void indexSearchTest03() throws Exception {
        //1. 通配符查询: ? *\
        // q的格式:    字段的名 : 字段的值
        SolrQuery solrQuery = new SolrQuery("title:ipho*");
        //publicSearch(solrQuery);

        //2. 相似度查询：模糊查询
        //  最大编辑次数: 2
        // solr支持更改最大编辑次数: 0~2 但是如果改的值大于了2, 那么久采用2, 如果小于0了, 那么就采用0
        //如果用户输入~, 那么就会导致solr报错, 此时需要将用户的输入的内容两侧加上单引号或者双引号
        solrQuery = new SolrQuery("title:'iphon~'~2");
        //publicSearch(solrQuery);

        //3. 范围查询: TO 一定要大写
        // id 是String类型的, 如果是String类型其实使用范围的时候文本范围, 字典顺序进行排序
        // demo: 1,2,3,4    1,2,3,10 ,20    :[1~2]  1,10,2,20
        solrQuery = new SolrQuery("id:[1 TO 3]");
        //publicSearch(solrQuery);

        //4. 布尔查询(组合查询中一种): AND(MUST)  OR(SHOULD)  NOT(MUST_NOT)
        solrQuery = new SolrQuery("title:iphone NOT id:3");
        //publicSearch(solrQuery);

        //5.子表达式查询
        solrQuery = new SolrQuery("(title:iphone OR id:10) AND title:max");
        publicSearch(solrQuery);

    }

    //solr的高亮
    @Test
    public  void indexSearchTest04() throws Exception {
        //1. 创建solrserver对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");

        //2. 执行查询
        SolrQuery query = new SolrQuery("content:誉为");
        //高亮设置的开始 ----------------------------

        query.setHighlight(true); //开启了高亮
        query.addHighlightField("content"); //可以给多个字段设置高亮

        query.setHighlightSimplePre("<font color='red'>");
        query.setHighlightSimplePost("</font>");
        // 用来设置高亮的分片数: 默认值为 1
        query.setHighlightSnippets(1000);

        //高亮设置的结束 ----------------------------
        QueryResponse response = solrServer.query(query);

        //获取高亮:开始-----------------
        /**
         * 最外层的map:
         *      key: 高亮的这个文档的id值
         *      value: 对应这个文档的高亮的内容map集合
         * 内层map:
         *      key: 高亮的字段的名称
         *      value: 高亮的内容集合
         * list集合: 里面一般只有一个数据, 除非当前高亮的字段是一个多值的字段, 同时高亮的分片必须大于1
         */
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();

        for (String docID : highlighting.keySet()) {
           // System.out.println(docID);

            Map<String, List<String>> listMap = highlighting.get(docID);
            List<String> list = listMap.get("content");

            System.out.println(list.get(0));

        }

        //获取高亮:结束-----------------
        //3. 获取结果
        List<Product> productList = response.getBeans(Product.class);

        for (Product product : productList) {
            System.out.println(product);
        }

    }


    //solr的分页 和 排序
    @Test
    public  void indexSearchTest05() throws Exception {
        int  page = 2;
        int pageSize = 2;

        //1. 创建solrserver对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");


        //2.执行查询

        SolrQuery solrQuery = new SolrQuery("*:*");

        solrQuery.setSort("id", SolrQuery.ORDER.asc);

        solrQuery.setStart((page-1)*pageSize);

        solrQuery.setRows(pageSize);

        QueryResponse response = solrServer.query(solrQuery);

        //3. 获取数据
        List<Product> productList = response.getBeans(Product.class);

        for (Product product : productList) {
            System.out.println(product);
        }

    }

}
