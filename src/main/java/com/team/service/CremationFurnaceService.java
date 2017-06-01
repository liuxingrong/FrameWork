package com.team.service;

import com.team.dto.CremationFurnace;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface CremationFurnaceService {
    int insert(CremationFurnace cremationFurnace);

    int delete(Integer id);

    int update(CremationFurnace cremationFurnace);

    CremationFurnace findById(Integer id);

    List<CremationFurnace> getList(int currentPage, int pageSize);
}
