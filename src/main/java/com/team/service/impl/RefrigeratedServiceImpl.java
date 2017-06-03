package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Refrigerated;
import com.team.mapper.RefrigeratedMapper;
import com.team.service.RefrigeratedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class RefrigeratedServiceImpl implements RefrigeratedService{

    Logger logger = LoggerFactory.getLogger(RefrigeratedServiceImpl.class);

    @Autowired
    private RefrigeratedMapper refrigeratedMapper;

    public int insert(Refrigerated refrigerated) {
        try {
            refrigeratedMapper.insertSelective(refrigerated);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            refrigeratedMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Refrigerated refrigerated) {
        try {
            refrigeratedMapper.updateByPrimaryKeySelective(refrigerated);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Refrigerated findById(Integer id) {
        return refrigeratedMapper.selectByPrimaryKey(id);
    }

    public List<Refrigerated> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return refrigeratedMapper.selectAll();
    }
}
