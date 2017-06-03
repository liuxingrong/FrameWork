package com.team.mapper;

import com.team.dto.Eulogy;

import java.util.List;

public interface EulogyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Eulogy record);

    int insertSelective(Eulogy record);

    Eulogy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Eulogy record);

    int updateByPrimaryKey(Eulogy record);

    List<Eulogy> selectAll();
}