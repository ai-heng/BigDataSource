package com.itheima.dao;

import com.itheima.domain.Product;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 操作商品的: 数据层 接口
 */
public interface ProductDao {
    List<Map<String,Object>> findAllProduct() throws SQLException;

    int addProduct(Product product) throws SQLException;

    Product findProductByPid(String pid) throws SQLException;

    int updateProduct(Product p) throws SQLException;

    int deleteProduct(String pid) throws SQLException;

    List<Map<String,Object>> findProductByCondition(String cid, String pname) throws SQLException;

    int findTotal(String cid) throws SQLException;

    List<Product> findProductByPagenum(int begin, int numperpage, String cid) throws SQLException;
}
