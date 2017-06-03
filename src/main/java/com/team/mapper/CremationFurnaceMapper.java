package com.team.mapper;

import com.team.dto.CremationFurnace;

import java.util.List;

public interface CremationFurnaceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CremationFurnace record);

    int insertSelective(CremationFurnace record);

    CremationFurnace selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CremationFurnace record);

    int updateByPrimaryKey(CremationFurnace record);

    List<CremationFurnace> selectAll();
}