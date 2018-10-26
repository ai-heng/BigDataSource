package com.itheima.solrj;

import com.itheima.solrj.pojo.Product;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndexWriterSolrj {
    // 原生的方式写入索引的操作
    @Test
    public void indexWriterTest01() throws Exception {
        //1.  创建的solrj的服务对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");

        //2. 添加文档数据
        List<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
        SolrInputDocument doc1 = new SolrInputDocument();
        doc1.addField("id","1");
        doc1.addField("title","托塔天王");
        doc1.addField("name","老夯");
        doc1.addField("content","老夯, 被誉为是托塔李天王,从未在6.30下过课");
        docs.add(doc1);

        SolrInputDocument doc2 = new SolrInputDocument();
        doc2.addField("id","2");
        doc2.addField("title","搞笑天王");
        doc2.addField("name","川哥");
        doc2.addField("content","川哥被誉为搞笑天王, 因为永远离不了娃娃两字");
        docs.add(doc2);

        //solrServer.add(doc);
        solrServer.add(docs);
        //3. 提交数据
        solrServer.commit();
    }

    //使用javaBean写入索引数据
    @Test
    public void indexWriterTest02() throws Exception {
        //1.  创建的solrj的服务对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");

        //2. 添加javaBean
        Product product = new Product("10","iPhone5",600L,"目前已经很卡了");
        solrServer.addBean(product);

        //3. 提交数据
        solrServer.commit();
    }


    // 索引的删除
    @Test
    public void indexWriterTest03() throws Exception {
        //1.  创建的solrj的服务对象
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr/collection1");


        //2. 执行索引的删除
        //solrServer.deleteById("10");
        solrServer.deleteByQuery("*:*"); //删除所有的数据
        //3. 提交数据
        solrServer.commit();
    }
}
