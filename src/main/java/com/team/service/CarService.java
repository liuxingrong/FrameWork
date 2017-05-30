package com.team.service;

import com.team.dto.Car;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface CarService {
    int insert(Car car);

    int delete(Integer id);

    int update(Car car);

    Car findById(Integer id);

    List<Car> getList(int currentPage, int pageSize);
}
