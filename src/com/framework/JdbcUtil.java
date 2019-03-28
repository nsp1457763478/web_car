package com.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class JdbcUtil {

    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    private static String url ="jdbc:mysql://172.16.4.26:3306/car?serverTimezone=GMT%2B8";
    private static String user="root";
    private static String password="123";
    private static Connection connection=null;

    public static Connection getConnection(){
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(){
        try {
            if(connection!=null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
