package com.team.service;

import com.team.dto.Supplier;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface SupplierService {
    int insert(Supplier supplier);

    int delete(Integer id);

    int update(Supplier supplier);

    Supplier findById(Integer id);

    List<Supplier> getList(int currentPage, int pageSize);
}
