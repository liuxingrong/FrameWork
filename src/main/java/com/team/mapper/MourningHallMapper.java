package com.team.mapper;

import com.team.dto.MourningHall;

import java.util.List;

public interface MourningHallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MourningHall record);

    int insertSelective(MourningHall record);

    MourningHall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MourningHall record);

    int updateByPrimaryKey(MourningHall record);

    List<MourningHall> selectAll();
}