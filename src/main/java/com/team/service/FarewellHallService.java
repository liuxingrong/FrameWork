package com.team.service;

import com.team.dto.FarewellHall;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface FarewellHallService {
    int insert(FarewellHall farewellHall);

    int delete(Integer id);

    int update(FarewellHall farewellHall);

    FarewellHall findById(Integer id);

    List<FarewellHall> getList(int currentPage, int pageSize);
}
