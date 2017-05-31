package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.MourningHall;
import com.team.mapper.MourningHallMapper;
import com.team.service.MourningHallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class MourningHallServiceImpl implements MourningHallService{

    Logger logger = LoggerFactory.getLogger(MourningHallServiceImpl.class);

    @Autowired
    private MourningHallMapper mourningHallMapper;

    public int insert(MourningHall mourningHall) {
        try {
            mourningHallMapper.insertSelective(mourningHall);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            mourningHallMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(MourningHall mourningHall) {
        try {
            mourningHallMapper.updateByPrimaryKeySelective(mourningHall);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public MourningHall findById(Integer id) {
        return mourningHallMapper.selectByPrimaryKey(id);
    }

    public List<MourningHall> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return mourningHallMapper.selectAll();
        return null;
    }
}
