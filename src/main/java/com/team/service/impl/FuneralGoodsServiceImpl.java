package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.FuneralGoods;
import com.team.mapper.FuneralGoodsMapper;
import com.team.service.FuneralGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class FuneralGoodsServiceImpl implements FuneralGoodsService{

    Logger logger = LoggerFactory.getLogger(FuneralGoodsServiceImpl.class);

    @Autowired
    private FuneralGoodsMapper funeralGoodsMapper;

    public int insert(FuneralGoods funeralGoods) {
        try {
            funeralGoodsMapper.insertSelective(funeralGoods);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            funeralGoodsMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(FuneralGoods funeralGoods) {
        try {
            funeralGoodsMapper.updateByPrimaryKeySelective(funeralGoods);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public FuneralGoods findById(Integer id) {
        return funeralGoodsMapper.selectByPrimaryKey(id);
    }

    public List<FuneralGoods> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return funeralGoodsMapper.selectAll();
        return null;
    }
}
