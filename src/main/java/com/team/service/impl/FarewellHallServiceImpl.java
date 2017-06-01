package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.FarewellHall;
import com.team.mapper.FarewellHallMapper;
import com.team.service.FarewellHallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class FarewellHallServiceImpl implements FarewellHallService{

    Logger logger = LoggerFactory.getLogger(FarewellHallServiceImpl.class);

    @Autowired
    private FarewellHallMapper farewellHallMapper;

    public int insert(FarewellHall farewellHall) {
        try {
            farewellHallMapper.insertSelective(farewellHall);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            farewellHallMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(FarewellHall farewellHall) {
        try {
            farewellHallMapper.updateByPrimaryKeySelective(farewellHall);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public FarewellHall findById(Integer id) {
        return farewellHallMapper.selectByPrimaryKey(id);
    }

    public List<FarewellHall> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return farewellHallMapper.selectAll();
        return null;
    }
}
