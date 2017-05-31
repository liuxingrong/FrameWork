package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Registration;
import com.team.mapper.RegistrationMapper;
import com.team.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class RegistrationServiceImpl implements RegistrationService{

    Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);

    @Autowired
    private RegistrationMapper registrationMapper;

    public int insert(Registration registration) {
        try {
            registrationMapper.insertSelective(registration);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            registrationMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Registration registration) {
        try {
            registrationMapper.updateByPrimaryKeySelective(registration);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Registration findById(Integer id) {
        return registrationMapper.selectByPrimaryKey(id);
    }

    public List<Registration> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return registrationMapper.selectAll();
        return null;
    }
}
