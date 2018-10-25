package cn.itcast.a;

import org.springframework.stereotype.Service;

// <bean id="productServiceImpl" class="cn.itcast.a.ProductServiceImpl"/>
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public void add() {
        System.out.println("1. 添加商品... ...");
    }

    @Override
    public void del() {
        System.out.println("2. 删除商品... ...");
    }

    @Override
    public void edit() {
        System.out.println("3. 修改商品... ...");
    }

    @Override
    public void query() {
        System.out.println("4. 查询商品... ...");
    }
}
