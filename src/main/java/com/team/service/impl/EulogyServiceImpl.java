package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Eulogy;
import com.team.mapper.EulogyMapper;
import com.team.service.EulogyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class EulogyServiceImpl implements EulogyService{

    Logger logger = LoggerFactory.getLogger(EulogyServiceImpl.class);

    @Autowired
    private EulogyMapper eulogyMapper;

    public int insert(Eulogy eulogy) {
        try {
            eulogyMapper.insertSelective(eulogy);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            eulogyMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Eulogy eulogy) {
        try {
            eulogyMapper.updateByPrimaryKeySelective(eulogy);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Eulogy findById(Integer id) {
        return eulogyMapper.selectByPrimaryKey(id);
    }

    public List<Eulogy> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return eulogyMapper.selectAll();
    }
}
