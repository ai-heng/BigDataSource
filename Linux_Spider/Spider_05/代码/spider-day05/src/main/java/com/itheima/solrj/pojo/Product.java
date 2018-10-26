package com.itheima.solrj.pojo;

import org.apache.solr.client.solrj.beans.Field;

public class Product {
    //@Field : 用来指定那些成员属性是solr的字段
    @Field
    private String id;
    @Field
    private String title;
    @Field
    private Long price;
    @Field
    private String content;

    public Product() {
    }

    public Product(String id, String title, Long price, String content) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
