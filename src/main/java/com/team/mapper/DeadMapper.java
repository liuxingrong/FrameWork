package com.team.mapper;

import com.team.dto.Dead;

public interface DeadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dead record);

    int insertSelective(Dead record);

    Dead selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dead record);

    int updateByPrimaryKey(Dead record);
}