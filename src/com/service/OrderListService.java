package com.service;

import com.dao.OrderListDao;
import com.dao.impl.OrderListDaoImpl;
import com.entity.OrderList;
import com.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-27
 * Time: 19:16
 * Description: No Description
 */
public class OrderListService {
    OrderListDao dao = new OrderListDaoImpl();
    public int addOrder(OrderList orderList){
        return dao.addOrder(orderList);
    }
    public int deleteOrder(String orderId){
        return dao.deleteOrder(orderId);
    }
    public int updateOrder(OrderList orderList){
        return dao.updateOrder(orderList);
    }
    public List<OrderList> findAllOrder(){
        return dao.findAllOrder();
    }

    public OrderList findOne(String tel) {
        return dao.findOne(tel);
    }
    public OrderList findOrder(){
        return dao.findOrder();
    }
    public int updateOverTime(OrderList orderList){
        return dao.updateOverTime(orderList);
    }
}
