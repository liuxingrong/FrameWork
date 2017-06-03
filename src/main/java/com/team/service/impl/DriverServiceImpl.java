package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Driver;
import com.team.mapper.DriverMapper;
import com.team.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class DriverServiceImpl implements DriverService{

    Logger logger = LoggerFactory.getLogger(DriverServiceImpl.class);

    @Autowired
    private DriverMapper driverMapper;

    public int insert(Driver driver) {
        try {
            driverMapper.insertSelective(driver);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            driverMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Driver driver) {
        try {
            driverMapper.updateByPrimaryKeySelective(driver);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Driver findById(Integer id) {
        return driverMapper.selectByPrimaryKey(id);
    }

    public List<Driver> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return driverMapper.selectAll();
    }
}
