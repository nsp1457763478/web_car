package com.dao.impl;

import com.dao.OrderListDao;
import com.entity.OrderList;
import com.entity.User;
import com.util.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-27
 * Time: 13:53
 * Description: No Description
 */
public class OrderListDaoImpl implements OrderListDao {
    QueryRunner qr = new QueryRunner();
    @Override
    public int addOrder(OrderList orderList) {
        String sql = "insert into order_list(order_id,name,tel,car_name,lease,order_time)values(?,?,?,?,?,?)";
        Connection conn = JdbcUtils.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,orderList.getOrderId());
            ps.setString(2,orderList.getName());
            ps.setString(3,orderList.getTel());
            ps.setString(4,orderList.getCarName());
            ps.setString(5,orderList.getLease());
            ps.setString(6,orderList.getOrderTime());
           /* ps.setDate(7,new java.sql.Date(orderList.getOrderTime().getTime()));
            ps.setDate(8,new java.sql.Date(orderList.getOverTime().getTime()));*/
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteOrder(String orderId) {
        String sql = "delete from order_list where order_id=?";
        try {
            int i = qr.update(JdbcUtils.getConnection(), sql, orderId);
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateOrder(OrderList orderList) {

        String sql = "update order_list set name=?,tel=?,car_name=?," +
                "lease=?,order_time=?,over_time=?,all_cost=? where order_id=?";
        try {
            int i = qr.update(JdbcUtils.getConnection(), sql,orderList.getOrderId());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    @Override
    public int updateOverTime(OrderList orderList) {
        String sql = "update order_list set over_time=? where order_id=?";
        System.out.println("sql:" +  sql);
        Connection conn = JdbcUtils.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println("prepare:" +  orderList.getOverTime());
            System.out.println("prepare:" +  orderList.getOrderId());
            ps.setString(1,orderList.getOverTime());
            ps.setString(2,orderList.getOrderId());
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
//        String sql = "update order_list set name=?,tel=?,car_name=?," +
//                "lease=?,order_time=?,over_time=?,all_cost=? where order_id=?";
      /*  try {
            int i = qr.update(JdbcUtils.getConnection(), sql, orderList.getOverTime(),orderList.getOrderId());
            System.out.println(i);
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        /* try {
            int i = qr.update(JdbcUtils.getConnection(), sql,orderList.getName(),orderList.getTel(),
                    orderList.getCarName(),orderList.getLease(),orderList.getOrderTime(),
                    orderList.getOverTime(),orderList.getAllCost(),orderList.getOrderId());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public List<OrderList> findAllOrder(){
        List<OrderList> list = new ArrayList<>();
        Connection conn = JdbcUtils.getConnection();
        String sql = "select * from order_list where over_time is not null order by order_time desc ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String orderId = rs.getString("order_id");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                String carName = rs.getString("car_name");
                String lease = rs.getString("lease");
                String orderTime = rs.getString("order_time");
                String overTime = rs.getString("over_time");
                int allCost = rs.getInt("all_cost");
                OrderList orderList = new OrderList(orderId,name,tel, carName, lease, orderTime, overTime, allCost);
                list.add(orderList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public OrderList findOrder() {

        Connection conn = JdbcUtils.getConnection();
        String sql = "select * from order_list  where over_time is NULL order by order_time desc ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String orderId = rs.getString("order_id");
                String tel1 = rs.getString("tel");
                String carName = rs.getString("car_name");
                String lease = rs.getString("lease");
                String orderTime = rs.getString("order_time");
                String overTime = rs.getString("over_time");
                int allCost = rs.getInt("all_cost");
                OrderList orderList = new OrderList(orderId, tel1, carName, lease, orderTime, overTime, allCost);
                return orderList;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OrderList findOne(String tel) {
        Connection conn = JdbcUtils.getConnection();
        String sql = "select * from order_list  where tel=? order by order_time desc limit 0,1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,tel);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){

                String orderId = rs.getString("order_id");
                String name = rs.getString("name");
                String tel1 = rs.getString("tel");
                String carName = rs.getString("car_name");
                String lease = rs.getString("lease");
                String orderTime = rs.getString("order_time");
                String overTime = rs.getString("over_time");
                int allCost = rs.getInt("all_cost");
                OrderList orderList = new OrderList(orderId,name, tel1, carName, lease, orderTime, overTime, allCost);
                return orderList;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
