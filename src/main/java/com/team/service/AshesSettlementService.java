package com.team.service;

import com.team.dto.AshesSettlement;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface AshesSettlementService {
    int insert(AshesSettlement ashesSettlement);

    int delete(Integer id);

    int update(AshesSettlement ashesSettlement);

    AshesSettlement findById(Integer id);

    List<AshesSettlement> getList(int currentPage, int pageSize);
}
