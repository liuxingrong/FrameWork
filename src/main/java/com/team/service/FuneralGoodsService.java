package com.team.service;

import com.team.dto.FuneralGoods;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface FuneralGoodsService {
    int insert(FuneralGoods funeralGoods);

    int delete(Integer id);

    int update(FuneralGoods funeralGoods);

    FuneralGoods findById(Integer id);

    List<FuneralGoods> getList(int currentPage, int pageSize);
}
