package com.team.mapper;

import com.team.dto.FarewellHall;

import java.util.List;

public interface FarewellHallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FarewellHall record);

    int insertSelective(FarewellHall record);

    FarewellHall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FarewellHall record);

    int updateByPrimaryKey(FarewellHall record);

    List<FarewellHall> selectAll();
}