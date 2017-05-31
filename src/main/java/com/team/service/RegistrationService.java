package com.team.service;

import com.team.dto.Registration;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface RegistrationService {
    int insert(Registration registration);

    int delete(Integer id);

    int update(Registration registration);

    Registration findById(Integer id);

    List<Registration> getList(int currentPage, int pageSize);
}
