package com.itheima.dao.impl;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLException;
import java.util.ArrayList;
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


    /**
     * 修改指定商品的信息
     * @param p
     * @return
     * @throws SQLException
     */
    @Override
    public int updateProduct(Product p) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "UPDATE product SET pname=?,is_hot=?,market_price=?,shop_price=?,cid=?,pdesc=?   WHERE pid=?;";
        Object[] obj = {p.getPname(),p.getIs_hot(), p.getMarket_price(), p.getShop_price(), p.getCid(),p.getPdesc(),p.getPid()};
        return qr.update(sql, obj);
    }

    /**
     * 根据pid, 删除数据.
     * @param pid
     * @return
     */
    @Override
    public int deleteProduct(String pid) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "delete from product where pid = ?;";
        return qr.update(sql, pid);
    }

    /**
     * 根据查询条件, 获取商品信息
     * @param cid
     * @param pname
     * @return
     */
    @Override
    public List<Map<String, Object>> findProductByCondition(String cid, String pname) throws SQLException {
        //查询数据库, 获取数据
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        /*
            SELECT * FROM product p LEFT JOIN category c ON p.cid=c.cid
            WHERE 1=1
            #and p.cid = 1
            AND pname LIKE '%联想%'
            #可能有cid属性	 	and cid = ?
            #可能有pname属性	and pname = ?
            ORDER BY pid+0;
        * */
        String sql = "SELECT * FROM product p LEFT JOIN category c ON p.cid=c.cid  WHERE 1=1 ";
        //定义一个集合, 记录参数信息.
        ArrayList<Object> list = new ArrayList<>();
        if (StringUtils.isNotBlank(cid)) {
            sql += " and p.cid = ?";
            list.add(cid);
        }
        if (StringUtils.isNotBlank(pname)) {
            sql += " and pname like ?";
            list.add("%" + pname + "%");
        }
        sql += " ORDER BY pid+0;";

        return qr.query(sql, new MapListHandler(),list.toArray());
    }

    /**
     * 获取数据总条数
     * @return
     * @param cid
     */
    @Override
    public int findTotal(String cid) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "SELECT COUNT(*) FROM product where 1=1 ";

        //cid(分类信息)可有可无.
        ArrayList<Object> list = new ArrayList<>();
        if (StringUtils.isNotBlank(cid)) {
            sql += " and cid = ? ";
            list.add(cid);
        }

        return qr.query(sql, new ScalarHandler<Long>(),list.toArray()).intValue();        //这里有问题
    }

    /**
     * 根据条件, 获取该页的具体显示数据.
     * @param begin
     * @param numperpage
     * @param cid
     * @return
     */
    @Override
    public List<Product> findProductByPagenum(int begin, int numperpage, String cid) throws SQLException {
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM product where 1=1 ";
        //cid(分类信息)可有可无.
        ArrayList<Object> list = new ArrayList<>();
        if (StringUtils.isNotBlank(cid)) {
            sql += " and cid = ? ";
            list.add(cid);
        }
        sql += " ORDER BY pid+0 LIMIT ?,?;";
        list.add(begin);
        list.add(numperpage);
        return qr.query(sql, new BeanListHandler<Product>(Product.class),list.toArray());
    }
}
