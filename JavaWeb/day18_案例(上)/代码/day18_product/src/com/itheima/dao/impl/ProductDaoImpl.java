package com.itheima.dao.impl;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 操作商品的: 数据层 实现类
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Map<String, Object>> findAllProduct() throws SQLException {
        //查询数据库, 获取数据
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM category c,product p WHERE c.cid=p.cid ORDER BY pid+0;";
        return qr.query(sql, new MapListHandler());
    }

    /**
     * 添加商品
     * @param p
     * @return
     */
    @Override
    public int addProduct(Product p) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "INSERT INTO product(pid,pname,market_price,shop_price,cid,is_hot,pdesc,pflag,pimage,pdate)  VALUES(?,?,?,?,?,?,?,1,'products/1/c_0016.jpg',NOW());";
        Object[] obj = {p.getPid(),p.getPname(),p.getMarket_price(),p.getShop_price(),p.getCid(),p.getIs_hot(),p.getPdesc()};
        return qr.update(sql,obj);
    }

    /**
     * 根据pid获取商品信息
     * @param pid
     * @return
     */
    @Override
    public Product findProductByPid(String pid) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from product where pid = ?;";
        return qr.query(sql, new BeanHandler<Product>(Product.class),pid);
    }
}
