package com.itheima.solrCloud;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

public class SolrCloudTest {
    //写入索引的操作
    @Test
    public void indexWriterTest01() throws Exception {
        //1. 创建solrCloud的服务对象
        String zkHost = "192.168.72.141:2181,192.168.72.142:2181,192.168.72.143:2181";
        CloudSolrServer solrServer = new CloudSolrServer(zkHost);

        solrServer.setDefaultCollection("collection2"); //设置默认连接的索引库

        solrServer.setZkClientTimeout(5000); // 连接zookeeper的超时时间
        solrServer.setZkConnectTimeout(5000); // 从zookeeper上获取solr的连接的超时连接

        solrServer.connect(); //获取连接

        //2. 添加索引
        SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id","1");
        doc.addField("title","这是一个solrCloud的集群");
        doc.addField("content","今天在部署solrCloud的时候, 一定要小心小心再小心");
        solrServer.add(doc);

        //3. 提交数据
        solrServer.commit();

    }
    //索引的删除
    @Test
    public void indexWriterDel() throws Exception {
        //1. 创建solrCloud服务对象
        String zkHost = "192.168.72.141:2181,192.168.72.142:2181,192.168.72.143:2181";
        CloudSolrServer solrServer = new CloudSolrServer(zkHost);

        solrServer.setDefaultCollection("collection2");//设置默认连接的索引库

        solrServer.setZkClientTimeout(5000); //获取zookeeper的连接的超时时间
        solrServer.setZkConnectTimeout(5000);//通过zookeeper获取solr的连接的超时时间

        solrServer.connect(); //获取连接

        //2. 删除索引
        solrServer.deleteById("1");

        //3. 提交数据
        solrServer.commit();

    }
    //索引的查询
    @Test
    public void indexWriterQuery() throws Exception {
        //1. 创建solrCloud服务对象
        String zkHost = "192.168.72.141:2181,192.168.72.142:2181,192.168.72.143:2181";
        CloudSolrServer solrServer = new CloudSolrServer(zkHost);

        solrServer.setDefaultCollection("collection2");//设置默认连接的索引库

        solrServer.setZkClientTimeout(5000); //获取zookeeper的连接的超时时间
        solrServer.setZkConnectTimeout(5000);//通过zookeeper获取solr的连接的超时时间

        solrServer.connect(); //获取连接

        //2. 执行查询
        SolrQuery solrQuery = new SolrQuery("*:*");
        QueryResponse response = solrServer.query(solrQuery);

        //3. 获取数据
        SolrDocumentList documentList = response.getResults();

        for (SolrDocument document : documentList) {
            Object id = document.get("id");
            Object title = document.get("title");
            Object content = document.get("content");
            System.out.println(id +"=="+title+"=="+content);
        }


    }

}
