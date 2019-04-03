package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

    private static String driverClassName="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://172.16.4.26:3306/car?serverTimezone=GMT%2B8";
    private static String user="root";
    private static String password="123";
    private static Connection connection;

    public static Connection getConnection(){

        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url,user,password);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
