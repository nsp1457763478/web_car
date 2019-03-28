package com.framework;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class DbUtil  {
    private static Properties properties = null;
    private static Connection connection =null;
    static {
        try {
            properties.load(DbUtil.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            DataSource druidDataSource = getDruidDataSource();
            connection = druidDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(){
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static DataSource getDruidDataSource(){
        DruidDataSource druidDataSource=null;
        try {
            druidDataSource=new DruidDataSource();
            druidDataSource.configFromPropety(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }
}
