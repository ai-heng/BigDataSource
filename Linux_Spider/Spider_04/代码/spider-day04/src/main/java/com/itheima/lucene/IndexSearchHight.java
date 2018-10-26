package com.itheima.lucene;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.store.FSDirectory;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;

//高亮显示
public class IndexSearchHight {

    public static void main(String[] args) throws  Exception{
        //1.创建索引查询器对象
        DirectoryReader reader = DirectoryReader.open(FSDirectory.open(new File("H:\\test")));
        IndexSearcher indexSearcher = new IndexSearcher(reader);

        //2. 执行查询
        MultiFieldQueryParser queryParser = new MultiFieldQueryParser(new String[]{"content","title"},new IKAnalyzer());
        Query query = queryParser.parse("全文检索");

        // --------------高亮设置 start-------------------
        SimpleHTMLFormatter formatter = new SimpleHTMLFormatter("<font color='red'>","</font>");
        QueryScorer scorer = new QueryScorer(query);
        Highlighter highlighter  = new Highlighter(formatter,scorer);

        // --------------高亮设置 end-------------------
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

            //获取高亮 -------------start----------------
            content = highlighter.getBestFragment(new IKAnalyzer(), "content", content);
            //获取高亮 -------------end----------------
            System.out.println("得分数:"+score +"=="+id+"=="+title+"=="+content);
        }
    }

}
