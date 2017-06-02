package com.team.controller;

import com.team.dto.Supplier;
import com.team.service.SupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */
@RequestMapping("/supplier")
@Controller
public class SupplierController {

    Logger logger = LoggerFactory.getLogger(SupplierController.class);

    @Autowired
    private SupplierService supplierService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Supplier supplier) {
        return supplierService.insert(supplier);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return supplierService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Supplier supplier) {
        return supplierService.update(supplier);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Supplier find(@RequestParam("id") Integer id) {
        return supplierService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Supplier> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return supplierService.getList(currentPage, pageSize);
    }


}
