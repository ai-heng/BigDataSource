package com.itheima.service;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;

import java.util.List;

public class ProductService {
    public List<Product> findAllProduct() {
        //1. 调用dao层, 获取集合.
        ProductDao pd = new ProductDao();

        //2. 将集合返回给web层.
        return pd.findAllProduct();
    }
}
