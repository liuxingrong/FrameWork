package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Dead;
import com.team.mapper.DeadMapper;
import com.team.service.DeadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class DeadServiceImpl implements DeadService{

    Logger logger = LoggerFactory.getLogger(DeadServiceImpl.class);

    @Autowired
    private DeadMapper deadMapper;

    public int insert(Dead dead) {
        try {
            deadMapper.insertSelective(dead);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            deadMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Dead dead) {
        try {
            deadMapper.updateByPrimaryKeySelective(dead);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Dead findById(Integer id) {
        return deadMapper.selectByPrimaryKey(id);
    }

    public List<Dead> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return deadMapper.selectAll();
        return null;
    }
}
