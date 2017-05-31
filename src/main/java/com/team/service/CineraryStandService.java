package com.team.service;

import com.team.dto.CineraryStand;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface CineraryStandService {
    int insert(CineraryStand cineraryStand);

    int delete(Integer id);

    int update(CineraryStand cineraryStand);

    CineraryStand findById(Integer id);

    List<CineraryStand> getList(int currentPage, int pageSize);
}
