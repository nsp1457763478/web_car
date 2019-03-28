package com.dao.impl;

import com.dao.CarsDao;
import com.entity.Cars;
import com.framework.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor : WL;
 * @date : 2019/3/28 0028
 */
public class CarsDaoImpl implements CarsDao {

    public List<Cars> getCarsList(String sql) {
        List<Cars> list = new ArrayList<>();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Connection con= JdbcUtil.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cars car=new Cars();
                int carId = rs.getInt("car_id");
                String carName = rs.getString("car_name");
                int gradeId = rs.getInt("grade_id");
                int isImage = rs.getInt("is_image");
                String imageUrl = rs.getString("image_url");
                int dailyRent = rs.getInt("daily_rent");
                int monthRent = rs.getInt("month_rent");
                int num = rs.getInt("num");
                String context = rs.getString("context");
                car.setCarId(carId);
                car.setCarName(carName);
                car.setGradeId(gradeId);
                car.setIsImage(isImage);
                car.setImageUrl(imageUrl);
                car.setDailyRent(dailyRent);
                car.setMonthRent(monthRent);
                car.setNum(num);
                car.setContext(context);
                list.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JdbcUtil.close();
        }
        return list;
    }

    @Override
    public List<Cars> query() {
        return null;
    }

    @Override
    public List<Cars> findSuv() {
        String sql = "select * from cars where grade_id = 3 order by daily_rent desc";
        return getCarsList(sql);
    }

    @Override
    public List<Cars> findC() {
        String sql = "select * from cars where grade_id = 1 order by daily_rent desc";
        return getCarsList(sql);
    }

    @Override
    public List<Cars> findD() {
        String sql = "select * from cars where grade_id = 2 order by daily_rent desc";
        return getCarsList(sql);
    }
}
