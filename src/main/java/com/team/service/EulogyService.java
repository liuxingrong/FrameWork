package com.team.service;

import com.team.dto.Eulogy;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface EulogyService {
    int insert(Eulogy eulogy);

    int delete(Integer id);

    int update(Eulogy eulogy);

    Eulogy findById(Integer id);

    List<Eulogy> getList(int currentPage, int pageSize);
}
