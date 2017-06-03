package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Business;
import com.team.mapper.BusinessMapper;
import com.team.service.BusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class BusinessServiceImpl implements BusinessService{

    Logger logger = LoggerFactory.getLogger(BusinessServiceImpl.class);

    @Autowired
    private BusinessMapper businessMapper;

    public int insert(Business business) {
        try {
            businessMapper.insertSelective(business);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            businessMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Business business) {
        try {
            businessMapper.updateByPrimaryKeySelective(business);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Business findById(Integer id) {
        return businessMapper.selectByPrimaryKey(id);
    }

    public List<Business> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return businessMapper.selectAll();
    }
}
