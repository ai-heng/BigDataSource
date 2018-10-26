package com.itheima.service.impl;

import com.itheima.dao.ProductDao;
import com.itheima.dao.impl.ProductDaoImpl;
import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.itheima.utils.CommonUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 操作商品的: 业务层 实现类
 */
public class ProductServiceImpl implements ProductService {
    ProductDao pd = new ProductDaoImpl();

    /**
     * 获取所有的商品信息
     * @return
     */
    @Override
    public List<Product> findAllProduct() {
        //1. 调用dao层的功能, 获取数据. List<Map<String,Object>>
        //2.1 定义集合, 存储封装后的: 商品对象.
        List<Product> list = new ArrayList<>();
        try {
            List<Map<String,Object>> maps = pd.findAllProduct();
            //2. 将其封装成: List<Product>
            //2.2 遍历maps集合, 获取到每一个map: 它里边既有分类信息, 也有商品信息
            for (Map<String, Object> map : maps) {
                //2.3 将其(每个map)分别封装成: Product对象, Category对象.
                Product p = new Product();
                Category c = new Category();
                BeanUtils.populate(p,map);
                BeanUtils.populate(c,map);
                //2.4 将Category对象当做Product对象的一个属性进行设置.
                p.setCategory(c);
                //2.5 将封装后的product对象, 添加到集合中.
                list.add(p);
            }
            //3. 将封装后的结果(list), 返回为web层.
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 添加商品
     * @param product
     * @return
     */
    @Override
    public boolean addProduct(Product product) {
        //1. 调用dao层, 添加商品.
        try {
            //设置商品的pid
            product.setPid(CommonUtils.getUUID());
            int num = pd.addProduct(product);
            return  num > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //2. 获取结果, 判断, 然后将判断结果返回给: web层.
        return false;
    }

    /**
     * 根据id, 查询商品
     * @param pid
     * @return
     */
    @Override
    public Product findProductByPid(String pid) {
        try {
            return pd.findProductByPid(pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().replace("-",""));
        System.out.println(uuid.toString().length());
    }
}
