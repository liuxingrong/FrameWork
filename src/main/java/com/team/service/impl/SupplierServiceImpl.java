package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Supplier;
import com.team.mapper.SupplierMapper;
import com.team.service.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */

@Service
public class SupplierServiceImpl implements SupplierService{

    Logger logger = LoggerFactory.getLogger(SupplierServiceImpl.class);

    @Autowired
    private SupplierMapper supplierMapper;

    public int insert(Supplier supplier) {
        try {
            supplierMapper.insertSelective(supplier);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int delete(Integer id) {
        try {
            supplierMapper.deleteByPrimaryKey(id);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public int update(Supplier supplier) {
        try {
            supplierMapper.updateByPrimaryKeySelective(supplier);
            return 1;
        } catch (Exception exception) {
            logger.error(exception.getMessage());
            return 0;
        }
    }

    public Supplier findById(Integer id) {
        return supplierMapper.selectByPrimaryKey(id);
    }

    public List<Supplier> getList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
//        return supplierMapper.selectAll();
        return null;
    }
}
