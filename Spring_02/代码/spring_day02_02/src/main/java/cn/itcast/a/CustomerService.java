package cn.itcast.a;

import org.springframework.stereotype.Service;

// <bean id="customerService" class=""cn.itcast.a.CustomerService/>
@Service
public class CustomerService {

    public void add() {
        System.out.println("5. 添加客户 ... ...");
    }

    public void del() {
        System.out.println("6. 删除客户 ... ...");
    }

    public void edit() {
        System.out.println("7. 修改客户 ... ...");
    }

    public void query() {
        System.out.println("8. 查询客户 ... ...");
    }
}
