package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.AshesRegistration;
import com.team.mapper.AshesRegistrationMapper;
import com.team.service.AshesRegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class AshesRegistrationServiceImpl implements AshesRegistrationService{

    Logger logger = LoggerFactory.getLogger(AshesRegistrationServiceImpl.class);

    @Autowired
    private AshesRegistrationMapper ashesRegistrationMapper;

    public int insert(AshesRegistration ashesRegistration) {
        try {
            ashesRegistrationMapper.insertSelective(ashesRegistration);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            ashesRegistrationMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(AshesRegistration ashesRegistration) {
        try {
            ashesRegistrationMapper.updateByPrimaryKeySelective(ashesRegistration);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public AshesRegistration findById(Integer id) {
        return ashesRegistrationMapper.selectByPrimaryKey(id);
    }

    public List<AshesRegistration> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return ashesRegistrationMapper.selectAll();
    }
}
