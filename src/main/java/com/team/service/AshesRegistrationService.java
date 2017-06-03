package com.team.service;

import com.team.dto.AshesRegistration;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface AshesRegistrationService {
    int insert(AshesRegistration ashesRegistration);

    int delete(Integer id);

    int update(AshesRegistration ashesRegistration);

    AshesRegistration findById(Integer id);

    List<AshesRegistration> getList(int currentPage, int pageSize);
}
