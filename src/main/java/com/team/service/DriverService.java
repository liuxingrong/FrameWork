package com.team.service;

import com.team.dto.Driver;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface DriverService {
    int insert(Driver driver);

    int delete(Integer id);

    int update(Driver driver);

    Driver findById(Integer id);

    List<Driver> getList(int currentPage, int pageSize);
}
