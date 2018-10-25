package cn.itcast.mapper;

import cn.itcast.pojo.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    // 	需求1：根据订单号 查询订单的同时，查询出订单所属用户
    public Order queryOrderWithUserByOrdernumber(@Param("ordernumber")String ordernumber);

    // 需求2：根据订单号 查询订单，并且查询出所有订单详情及所属用户
    public Order queryOrderWithUserAndOrderitemsByOrdernumber(@Param("ordernumber")String ordernumber);

    // 需求3：根据订单号 查询订单，查询出所属用户，并且查询出订单的详情，及订单详情中的对应的商品信息
    public Order queryOrderWithUserAndOrderitemsAndProductByOrdernumber(@Param("ordernumber")String ordernumber);



}
