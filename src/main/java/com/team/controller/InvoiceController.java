package com.team.controller;

import com.team.dto.Invoice;
import com.team.service.InvoiceService;
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
@RequestMapping("/invoice")
@Controller
public class InvoiceController {

    Logger logger = LoggerFactory.getLogger(InvoiceController.class);

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Invoice invoice) {
        return invoiceService.insert(invoice);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return invoiceService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Invoice invoice) {
        return invoiceService.update(invoice);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Invoice find(@RequestParam("id") Integer id) {
        return invoiceService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Invoice> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return invoiceService.getList(currentPage, pageSize);
    }


}
