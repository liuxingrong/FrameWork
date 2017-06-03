package com.team.mapper;

import com.team.dto.AshesSettlement;

import java.util.List;

public interface AshesSettlementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AshesSettlement record);

    int insertSelective(AshesSettlement record);

    AshesSettlement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AshesSettlement record);

    int updateByPrimaryKey(AshesSettlement record);

    List<AshesSettlement> selectAll();
}