package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.CremationFurnace;
import com.team.mapper.CremationFurnaceMapper;
import com.team.service.CremationFurnaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class CremationFurnaceServiceImpl implements CremationFurnaceService{

    Logger logger = LoggerFactory.getLogger(CremationFurnaceServiceImpl.class);

    @Autowired
    private CremationFurnaceMapper cremationFurnaceMapper;

    public int insert(CremationFurnace cremationFurnace) {
        try {
            cremationFurnaceMapper.insertSelective(cremationFurnace);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            cremationFurnaceMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(CremationFurnace cremationFurnace) {
        try {
            cremationFurnaceMapper.updateByPrimaryKeySelective(cremationFurnace);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public CremationFurnace findById(Integer id) {
        return cremationFurnaceMapper.selectByPrimaryKey(id);
    }

    public List<CremationFurnace> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return cremationFurnaceMapper.selectAll();
    }
}
