package com.team.service;

import com.team.dto.Refrigerated;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface RefrigeratedService {
    int insert(Refrigerated refrigerated);

    int delete(Integer id);

    int update(Refrigerated refrigerated);

    Refrigerated findById(Integer id);

    List<Refrigerated> getList(int currentPage, int pageSize);
}
