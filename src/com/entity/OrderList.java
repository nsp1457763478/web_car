package com.entity;


/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-27
 * Time: 13:46
 * Description: No Description
 */
public class OrderList {
    //订单号
    private String orderId;
    //会员姓名
    private String name;
    //会员电话
    private String tel;
    //会员预定车名
    private String carName;
    //租期
    private String lease;
    //订单开始时间
    private String orderTime ;
    //订单结束时间
    private String overTime ;
    //总费用
    private int allCost ;

    public OrderList() {
    }


    public OrderList(String overTime) {
        this.overTime = overTime;
    }

    public OrderList(String orderId,String name, String tel, String carName, String lease, String orderTime) {
        this.orderId = orderId;
        this.name = name;
        this.tel = tel;
        this.carName = carName;
        this.lease = lease;
        this.orderTime = orderTime;
    }

    public OrderList(String orderId, String tel, String carName, String lease, String orderTime, String overTime, int allCost) {
        this.orderId = orderId;
        this.tel = tel;
        this.carName = carName;
        this.lease = lease;
        this.orderTime = orderTime;
        this.overTime = overTime;
        this.allCost = allCost;
    }

    public OrderList(String orderId, String name, String tel, String carName, String lease, String orderTime, String overTime, int allCost) {
        this.orderId = orderId;
        this.name = name;
        this.tel = tel;
        this.carName = carName;
        this.lease = lease;
        this.orderTime = orderTime;
        this.overTime = overTime;
        this.allCost = allCost;
    }

    public OrderList(String orderId, String overTime) {
        this.orderId = orderId;
        this.orderTime = orderTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCar_Name(String carName) {
        this.carName = carName;
    }

    public String getLease() {
        return lease;
    }

    public void setLease(String lease) {
        this.lease = lease;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrder_Time(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOver_Time(String overTime) {
        this.overTime = overTime;
    }

    public int getAllCost() {
        return allCost;
    }

    public void setAll_Cost(int allCost) {
        this.allCost = allCost;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orderId='" + orderId + '\'' +
                //", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", carName='" + carName + '\'' +
                ", lease='" + lease + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", overTime='" + overTime + '\'' +
                ", allCost=" + allCost +
                '}';
    }
}
