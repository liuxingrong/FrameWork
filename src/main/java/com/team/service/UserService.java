package com.team.service;

import com.team.dto.User;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface UserService {
    int insert(User user);

    int delete(Integer id);

    int update(User user);

    User findById(Integer id);

    List<User> getList(int currentPage, int pageSize);

    User findByUsername(String username);
}
