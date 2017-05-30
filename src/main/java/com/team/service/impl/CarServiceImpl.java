package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Car;
import com.team.mapper.CarMapper;
import com.team.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class CarServiceImpl implements CarService{

    Logger logger = LoggerFactory.getLogger(CarServiceImpl.class);

    @Autowired
    private CarMapper carMapper;

    public int insert(Car car) {
        try {
            carMapper.insertSelective(car);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            carMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Car car) {
        try {
            carMapper.updateByPrimaryKeySelective(car);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Car findById(Integer id) {
        return carMapper.selectByPrimaryKey(id);
    }

    public List<Car> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return carMapper.selectAll();
        return null;
    }
}
