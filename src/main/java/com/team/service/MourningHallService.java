package com.team.service;

import com.team.dto.MourningHall;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface MourningHallService {
    int insert(MourningHall mourningHall);

    int delete(Integer id);

    int update(MourningHall mourningHall);

    MourningHall findById(Integer id);

    List<MourningHall> getList(int currentPage, int pageSize);
}
