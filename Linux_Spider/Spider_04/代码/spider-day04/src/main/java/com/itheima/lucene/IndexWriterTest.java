package com.itheima.lucene;

import com.sun.org.apache.xml.internal.utils.FastStringBuffer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndexWriterTest {
    // 索引写入入门代码
    @Test
    public void indexWriterTest01() throws Exception {
        //1. 创建索引写入器对象
        Directory directory = FSDirectory.open(new File("H:\\test"));
        /*StandardAnalyzer analyzer = new StandardAnalyzer();*/
        IKAnalyzer analyzer = new IKAnalyzer();
        IndexWriterConfig config = new IndexWriterConfig(Version.LATEST,analyzer);
        config.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);
        IndexWriter indexWriter  = new IndexWriter(directory,config);

        //2. 添加文档数据: 一个文档 可以看做是一条数据, 或者看做是一个文件
        List<Document> docs = new ArrayList<Document>();
        for(int  i = 12 ; i<=15 ; i++) {
            Document doc = new Document();
            doc.add(new LongField("id", i, Field.Store.YES));
            doc.add(new StringField("title", "lucene简介", Field.Store.NO));
            doc.add(new TextField("content", "lucene是一个全文检索的工具包, 使用lucene可以构建一个全文检索搜索引擎", Field.Store.YES));

            docs.add(doc);
        }

       //indexWriter.addDocument(doc);
        indexWriter.addDocuments(docs);
        //3. 提交
        indexWriter.commit();

        //4. 将写入器关闭
        indexWriter.close();

    }


    // 索引修改
    // 本质 先将匹配到的数据全部删除, 然后添加新的数据
        // 如果采用updateDocument: 添加一条
        //如果采用updateDocuments: 会吧匹配的数据全部删除, 将list中的数据添加到索引中
    @Test
    public void indexWriterUpdate() throws Exception {
        //1.创建 indexWriter对象
        Directory directory = FSDirectory.open(new File("H:\\test"));
        /*StandardAnalyzer analyzer = new StandardAnalyzer();*/
        IKAnalyzer analyzer = new IKAnalyzer();
        IndexWriterConfig config = new IndexWriterConfig(Version.LATEST,analyzer);
        config.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);
        IndexWriter indexWriter  = new IndexWriter(directory,config);

        //2. 执行索引的修改
        Document doc = new Document();
        doc.add(new LongField("id", 16, Field.Store.YES));
        doc.add(new StringField("title", "lucene简介", Field.Store.NO));
        doc.add(new TextField("content", "lucene是一个全文检索的工具包, 使用lucene可以构建一个全文检索搜索引擎,修改数据", Field.Store.YES));

        // 参数1: 表示词条
        // 参数2: 修改成什么内容
        indexWriter.updateDocument(new Term("content","扎心了老铁"),doc);

        //3. 提交
        indexWriter.commit();

        //4. 关闭写入器对象
        indexWriter.close();
    }

    //索引的删除
    @Test
    public void indexWriterDel() throws Exception {
        //1.创建 indexWriter对象
        Directory directory = FSDirectory.open(new File("H:\\test"));
        /*StandardAnalyzer analyzer = new StandardAnalyzer();*/
        IKAnalyzer analyzer = new IKAnalyzer();
        IndexWriterConfig config = new IndexWriterConfig(Version.LATEST, analyzer);
        config.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);
        IndexWriter indexWriter = new IndexWriter(directory, config);


        //2. 执行删除
       // indexWriter.deleteAll(); //删除所有
        indexWriter.deleteDocuments(new Term("content","修改"));

        //3. 提交
        indexWriter.commit();
        //4. 关闭
        indexWriter.close();
    }

}
