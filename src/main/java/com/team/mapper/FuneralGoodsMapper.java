package com.team.mapper;

import com.team.dto.FuneralGoods;

import java.util.List;

public interface FuneralGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FuneralGoods record);

    int insertSelective(FuneralGoods record);

    FuneralGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FuneralGoods record);

    int updateByPrimaryKey(FuneralGoods record);

    List<FuneralGoods> selectAll();
}