package com.itheima.domain;

import java.util.List;

/**
 * 设计分页的类
 */
public class Pagebean {
    //当前页数
    private int pagenum;
    //每页显示的条数
    private int numperpage;
    //分页显示数据, 查询数据库
    private List<Product> productList;
    //总记录数: 查询数据库
    private int total;
    //总页数
    private int totalpage;

    public Pagebean() {
    }

    public Pagebean(int pagenum, int numperpage, List<Product> productList, int total, int totalpage) {
        this.pagenum = pagenum;
        this.numperpage = numperpage;
        this.productList = productList;
        this.total = total;
        this.totalpage = totalpage;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getNumperpage() {
        return numperpage;
    }

    public void setNumperpage(int numperpage) {
        this.numperpage = numperpage;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    @Override
    public String toString() {
        return "Pagebean{" +
                "pagenum=" + pagenum +
                ", numperpage=" + numperpage +
                ", productList=" + productList +
                ", total=" + total +
                ", totalpage=" + totalpage +
                '}';
    }
}
