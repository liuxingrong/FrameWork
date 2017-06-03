package com.team.mapper;

import com.team.dto.AshesRegistration;

import java.util.List;

public interface AshesRegistrationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AshesRegistration record);

    int insertSelective(AshesRegistration record);

    AshesRegistration selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AshesRegistration record);

    int updateByPrimaryKey(AshesRegistration record);

    List<AshesRegistration> selectAll();

}