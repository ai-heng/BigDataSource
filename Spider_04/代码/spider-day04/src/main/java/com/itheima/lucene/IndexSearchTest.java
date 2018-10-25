package com.itheima.lucene;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;

public class IndexSearchTest {
    //索引查询的入门代码
    @Test
    public void indexSearchTest01() throws Exception {
        //1.创建索引查询器对象
        DirectoryReader reader = DirectoryReader.open(FSDirectory.open(new File("H:\\test")));
        IndexSearcher indexSearcher = new IndexSearcher(reader);

        //2. 执行查询
        // 使用查询解析器获取query对象
        // 注意: 分词器的使用 一定要和 写入索引库的分词器保持一致了
       /* QueryParser queryParser = new QueryParser("content",new IKAnalyzer());*/
        MultiFieldQueryParser queryParser = new MultiFieldQueryParser(new String[]{"content","title"},new IKAnalyzer());
        Query query = queryParser.parse("全文检索");

        //参数1: query 查询条件
        //参数2: int n  最大的查询条数
        // TopDocs: 第一部分: 查询的总条数  第二部分: 文档的数组
        TopDocs topDocs = indexSearcher.search(query, Integer.MAX_VALUE);
        int totalHits = topDocs.totalHits;// 总条数
        // 得分文档的数组
        ScoreDoc[] scoreDocs = topDocs.scoreDocs;

        for (ScoreDoc scoreDoc : scoreDocs) {
           //scoreDoc : 第一部分: 当前文档的得分 第二部分 : 文档的id
            float score = scoreDoc.score;//得分

            int docId = scoreDoc.doc;

            Document doc = indexSearcher.doc(docId);
            String id = doc.get("id");
            String title = doc.get("title");
            String content = doc.get("content");
            System.out.println("得分数:"+score +"=="+id+"=="+title+"=="+content);
        }
    }
    //抽取一个公共的查询方法
    public void publicQuery(Query query) throws Exception {
        //1.创建索引查询器对象
        DirectoryReader reader = DirectoryReader.open(FSDirectory.open(new File("H:\\test")));
        IndexSearcher indexSearcher = new IndexSearcher(reader);

        //2. 执行查询
        // 使用查询解析器获取query对象
        // 注意: 分词器的使用 一定要和 写入索引库的分词器保持一致了


        //参数1: query 查询条件
        //参数2: int n  最大的查询条数
        // TopDocs: 第一部分: 查询的总条数  第二部分: 文档的数组
        TopDocs topDocs = indexSearcher.search(query, Integer.MAX_VALUE);
        int totalHits = topDocs.totalHits;// 总条数
        // 得分文档的数组
        ScoreDoc[] scoreDocs = topDocs.scoreDocs;

        for (ScoreDoc scoreDoc : scoreDocs) {
            //scoreDoc : 第一部分: 当前文档的得分 第二部分 : 文档的id
            float score = scoreDoc.score;//得分

            int docId = scoreDoc.doc;

            Document doc = indexSearcher.doc(docId);
            String id = doc.get("id");
            String title = doc.get("title");
            String content = doc.get("content");
            System.out.println("得分数:"+score +"=="+id+"=="+title+"=="+content);
        }
    }

    // 多样化的查询
    @Test
    public void queryTest() throws Exception {
        //1. 词条查询: TermQery   用来查询不需要进行分词的数据
        //词条的特点: 词条是一个不可在分割的单位, 词条看做是文档分词的后的关键字
        //     词条查询的书写的时候不允许出现错误, 一旦出错, 将会查询不到数据
        TermQuery termQuery = new TermQuery(new Term("content","扎心了老铁"));
        //publicQuery(termQuery);

        //2. 通配符查询
        // ? : 占用一个字符  类似于 mysql 中 like的查询 _
        // * : 占用0到多个字符  类似于 mysql 中 like的查询 %
        // ? 和 * 可以在任意的位置使用, 但是mysql中 _ 和 % 只能在首尾使用
        WildcardQuery wildcardQuery = new WildcardQuery(new Term("content","扎心了老铁*"));
        //publicQuery(wildcardQuery);

        //3. 模糊查询
        // 模糊查询只能在2次范围内能够查询到对应的词条:  补位  替换 移动
        // 模糊查询可以自定义最大的编辑次数: 0~2 之间
        FuzzyQuery fuzzyQuery = new FuzzyQuery(new Term("content","扎心了老铁"),2);
        //publicQuery(fuzzyQuery);

        //4. 数值范围查询
        //final String field, Long min, Long max, final boolean minInclusive, final boolean maxInclusive4
        // 参数1: 默认的查询字段
        // 参数2: 最小值
        // 参数3: 最大值
        // 参数4: 是否包含最小值
        // 参数5: 是否包含最大值
        NumericRangeQuery<Long> numericRangeQuery = NumericRangeQuery.newLongRange("id",1L,15L,false,true);

        //publicQuery(numericRangeQuery);

        // 5. 组合查询
        // BooleanQuery 本身是没有任何的查询条件的
        BooleanQuery booleanQuery  = new BooleanQuery();

        booleanQuery.add(numericRangeQuery, BooleanClause.Occur.MUST); //此条件必须存在

        booleanQuery.add(fuzzyQuery , BooleanClause.Occur.SHOULD); // 可选的

        booleanQuery.add(termQuery, BooleanClause.Occur.MUST_NOT);// 不能出现这个条件下的内容

        publicQuery(booleanQuery);
    }

}
