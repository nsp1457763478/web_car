package com.dao;

import com.entity.User;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public interface UserDao {
    public User queryOne(String username);
    public User queryById(int uId);
    public int addUser(User user);
    public int updatePassword(User user);
    public int add(User user);
    public int updateState(User user);
}
