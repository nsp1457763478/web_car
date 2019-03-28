package com.entity;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String user;
    private String userstate;

    public User(int userId, String userstate) {
        this.userId = userId;
        this.userstate = userstate;
    }

    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String user, String userstate) {
        this.username = username;
        this.password = password;
        this.user = user;
        this.userstate = userstate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user='" + user + '\'' +
                ", userstate='" + userstate + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
    }
}
