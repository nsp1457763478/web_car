package com.dao;

import com.entity.OrderList;
import com.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-27
 * Time: 13:55
 * Description: No Description
 */
public interface OrderListDao {
    public int addOrder(OrderList orderList);
    public int deleteOrder(String orderId);
    public int updateOrder(OrderList orderList);
    public List<OrderList> findAllOrder();
    public OrderList findOrder();
    public int updateOverTime(OrderList orderList);
    public OrderList findOne(String tel);
}
