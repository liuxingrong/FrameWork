package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.CineraryStand;
import com.team.mapper.CineraryStandMapper;
import com.team.service.CineraryStandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class CineraryStandServiceImpl implements CineraryStandService{

    Logger logger = LoggerFactory.getLogger(CineraryStandServiceImpl.class);

    @Autowired
    private CineraryStandMapper cineraryStandMapper;

    public int insert(CineraryStand cineraryStand) {
        try {
            cineraryStandMapper.insertSelective(cineraryStand);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            cineraryStandMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(CineraryStand cineraryStand) {
        try {
            cineraryStandMapper.updateByPrimaryKeySelective(cineraryStand);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public CineraryStand findById(Integer id) {
        return cineraryStandMapper.selectByPrimaryKey(id);
    }

    public List<CineraryStand> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return cineraryStandMapper.selectAll();
        return null;
    }
}
