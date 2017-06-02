package com.team.service;

import com.team.dto.Invoice;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

public interface InvoiceService {
    int insert(Invoice invoice);

    int delete(Integer id);

    int update(Invoice invoice);

    Invoice findById(Integer id);

    List<Invoice> getList(int currentPage, int pageSize);
}
