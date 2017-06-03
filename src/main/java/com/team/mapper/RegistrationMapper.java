package com.team.mapper;

import com.team.dto.Registration;

import java.util.List;

public interface RegistrationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Registration record);

    int insertSelective(Registration record);

    Registration selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);

    List<Registration> selectAll();
}