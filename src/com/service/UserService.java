package com.service;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class UserService {
    private UserDao dao=new UserDaoImpl();
    public User queryOne(String username){
        return dao.queryOne(username);
    }
    public int addUser(User user){
        return dao.addUser(user);
    }
    public int updatePassword(User user){
        return dao.updatePassword(user);
    }
    public int add(User user){
        return dao.add(user);
    }
    public int updateState(User user){
        return dao.updateState(user);
    }
    public User queryById(int uId){
        return dao.queryById(uId);
    }
}
