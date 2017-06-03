package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.AshesSettlement;
import com.team.mapper.AshesSettlementMapper;
import com.team.service.AshesSettlementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class AshesSettlementServiceImpl implements AshesSettlementService{

    Logger logger = LoggerFactory.getLogger(AshesSettlementServiceImpl.class);

    @Autowired
    private AshesSettlementMapper ashesSettlementMapper;

    public int insert(AshesSettlement ashesSettlement) {
        try {
            ashesSettlementMapper.insertSelective(ashesSettlement);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            ashesSettlementMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(AshesSettlement ashesSettlement) {
        try {
            ashesSettlementMapper.updateByPrimaryKeySelective(ashesSettlement);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public AshesSettlement findById(Integer id) {
        return ashesSettlementMapper.selectByPrimaryKey(id);
    }

    public List<AshesSettlement> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return ashesSettlementMapper.selectAll();
    }
}
