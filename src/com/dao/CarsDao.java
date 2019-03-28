package com.dao;

import com.entity.Cars;

import java.util.List;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public interface CarsDao {
    public List<Cars> query();

    public List<Cars> findSuv();

    public List<Cars> findC();

    public List<Cars> findD();
}
