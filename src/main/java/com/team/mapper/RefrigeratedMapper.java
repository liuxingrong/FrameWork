package com.team.mapper;

import com.team.dto.Refrigerated;

import java.util.List;

public interface RefrigeratedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Refrigerated record);

    int insertSelective(Refrigerated record);

    Refrigerated selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Refrigerated record);

    int updateByPrimaryKey(Refrigerated record);

    List<Refrigerated> selectAll();
}