package com.dao.impl;

import com.dao.ClienDao;
import com.entity.Client;
import com.dao.ClienDao;
import com.entity.Client;
import com.entity.User;
import com.framework.JdbcUtil;
import com.util.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl  implements ClienDao {
    QueryRunner qr = new QueryRunner();

    @Override
    public Client queryOne(String username) {
        String sql="select * from client where client_id=(select client_id from user where username=?)";
        try {
            Client query = qr.query(JdbcUtil.getConnection(), sql, new BeanHandler<>(User.class), username);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int addClient(Client client) {
        String sql = "insert into client(name,sex,age,id_number," +
                "email,tel,drive_number,drive_type,address)" +
                " values (?,?,?,?,?,?,?,?,?)";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,client.getName());
            ps.setString(2,client.getSex());
            ps.setInt(3,client.getAge());
            ps.setString(4,client.getIdNumber());
            ps.setString(5,client.getEmail());
            ps.setString(6,client.getTel());
            ps.setString(7,client.getDriveNumber());
            ps.setString(8,client.getDriveType());
            ps.setString(9,client.getAddress());
           // ps.setInt(10,client.getIntegral());
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteClient(int clientId) {
        String sql = "delete from client where client_id = ?";
        Connection conn = JdbcUtils.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int i = ps.executeUpdate();
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateClient(Client client) {
        String sql = "update client set name=?,sex=?,age=?,id_number=?,email=?,tel=?,drive_number=?,drive_type=?,address=? where id_number=?"+client.getIdNumber();
        try {
            int i = qr.update(JdbcUtils.getConnection(), sql, client.getName(), client.getSex(), client.getAge(), client.getIdNumber(), client.getEmail(),
                    client.getTel(), client.getDriveNumber(), client.getDriveType(), client.getAddress(), client.getClientId());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Client> findAllClient() {
        List<Client>list = new ArrayList<>();
        String sql = "select * from client";
        Connection conn = JdbcUtils.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                String idNumber = rs.getString("idNumber");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                String driveNumber = rs.getString("driveNumber");
                String driveType = rs.getString("driveType");
                String address = rs.getString("address");
                Client client = new Client(name, sex, age, idNumber, email,tel, driveNumber, driveType, address);
                list.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Client findByIdNumber(String str) {
        String sql = "select * from client where id_number=?";
        Connection conn = JdbcUtils.getConnection();
        Client client = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,str);
            ResultSet rs = ps.executeQuery();
           while(rs.next()){
               String name = rs.getString("name");
               String sex = rs.getString("sex");
               int age = rs.getInt("age");
               String idNumber = rs.getString("idNumber");
               String email = rs.getString("email");
               String tel = rs.getString("tel");
               String driveNumber = rs.getString("driveNumber");
               String driveType = rs.getString("driveType");
               String address = rs.getString("address");
                client = new Client(name, sex, age, idNumber, email, tel, driveNumber, driveType, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Override
    public Client findUserInfo() {
        String sql = "select * from client c,user u  where c.client_id=u.client_id";
        Connection conn = JdbcUtils.getConnection();
        Client client = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                String idNumber = rs.getString("idNumber");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                String driveNumber = rs.getString("driveNumber");
                String driveType = rs.getString("driveType");
                String address = rs.getString("address");
                client = new Client(name, sex, age, idNumber, email, tel, driveNumber, driveType, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    public int getNowOrder(){
        String sql = "select orderid from client c," +
                "order_list o where c.client_id=o.clientid ";
        Connection conn = JdbcUtils.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
