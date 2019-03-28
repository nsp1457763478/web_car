package com.service;

import com.dao.CarsDao;
import com.dao.impl.CarsDaoImpl;
import com.entity.Cars;

import java.util.List;

/**
 * @autor : WL;
 * @date : 2019/3/28 0028
 */
public class CarsService {
    private CarsDao dao=new CarsDaoImpl();
    public List<Cars> findSuv(){
        return dao.findSuv();
    }

    public List<Cars> findC(){
        return dao.findC();
    }

    public List<Cars> findD(){
        return dao.findD();
    }

}
