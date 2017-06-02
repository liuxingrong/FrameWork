package com.team.service;

import com.team.dto.Dead;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface DeadService {
    int insert(Dead dead);

    int delete(Integer id);

    int update(Dead dead);

    Dead findById(Integer id);

    List<Dead> getList(int currentPage, int pageSize);
}
