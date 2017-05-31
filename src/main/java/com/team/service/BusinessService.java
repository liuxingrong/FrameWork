package com.team.service;

import com.team.dto.Business;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface BusinessService {
    int insert(Business business);

    int delete(Integer id);

    int update(Business business);

    Business findById(Integer id);

    List<Business> getList(int currentPage, int pageSize);
}
