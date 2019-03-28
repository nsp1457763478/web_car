package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;
import com.framework.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class UserDaoImpl implements UserDao {
    private QueryRunner queryRunner = new QueryRunner();
    @Override
    public User queryOne(String username) {
        String sql = "select * from user where username=?";
        try {
            User query = queryRunner.query(JdbcUtil.getConnection(), sql, new BeanHandler<>(User.class), username);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User queryById(int uId) {
        String sql = "select * from user where u_id=?";
        try {
            User query = queryRunner.query(JdbcUtil.getConnection(), sql, new BeanHandler<>(User.class), uId);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(username,password,user,user_state) values (?,?,'用户','允许')";
        try {
            int i = queryRunner.update(JdbcUtil.getConnection(), sql, user.getUsername(), user.getPassword());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updatePassword(User user) {
        String sql = "update user set password=? where user_id=?";
        try {
            int i = queryRunner.update(JdbcUtil.getConnection(), sql, user.getPassword(), user.getUserId());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int add(User user) {
        String sql = "insert into user(username,password,user,user_state) values (?,?,'管理员','允许')";
        try {
            int i = queryRunner.update(JdbcUtil.getConnection(), sql, user.getUsername(), user.getPassword());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateState(User user) {
        String sql = "update user set user_state=? where user_id=?";
        try {
            int i = queryRunner.update(JdbcUtil.getConnection(), sql, user.getUserstate(),user.getUserId());
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
