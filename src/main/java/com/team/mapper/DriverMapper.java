package com.team.mapper;

import com.team.dto.Driver;

import java.util.List;

public interface DriverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);

    List<Driver> selectAll();
}