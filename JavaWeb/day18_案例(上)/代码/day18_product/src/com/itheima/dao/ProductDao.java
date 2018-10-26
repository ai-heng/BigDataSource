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
}
