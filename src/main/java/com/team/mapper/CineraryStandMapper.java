package com.team.mapper;

import com.team.dto.CineraryStand;

public interface CineraryStandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CineraryStand record);

    int insertSelective(CineraryStand record);

    CineraryStand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CineraryStand record);

    int updateByPrimaryKey(CineraryStand record);
}