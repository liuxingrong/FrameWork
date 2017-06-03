package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Invoice;
import com.team.mapper.InvoiceMapper;
import com.team.service.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class InvoiceServiceImpl implements InvoiceService{

    Logger logger = LoggerFactory.getLogger(InvoiceServiceImpl.class);

    @Autowired
    private InvoiceMapper invoiceMapper;

    public int insert(Invoice invoice) {
        try {
            invoiceMapper.insertSelective(invoice);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            invoiceMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Invoice invoice) {
        try {
            invoiceMapper.updateByPrimaryKeySelective(invoice);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Invoice findById(Integer id) {
        return invoiceMapper.selectByPrimaryKey(id);
    }

    public List<Invoice> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return invoiceMapper.selectAll();
    }
}
