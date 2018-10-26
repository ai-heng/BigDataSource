package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

/**
 * 操作商品的: 业务层 接口
 */
public interface ProductService {
    /**
     * 查找所有的商品信息
     * @return
     */
    List<Product> findAllProduct();

    boolean addProduct(Product product);

    Product findProductByPid(String pid);
}
