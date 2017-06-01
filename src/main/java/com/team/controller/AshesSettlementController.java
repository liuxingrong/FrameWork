package com.team.controller;

import com.team.dto.AshesSettlement;
import com.team.service.AshesSettlementService;
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
@RequestMapping("/ashesSettlement")
@Controller
public class AshesSettlementController {

    Logger logger = LoggerFactory.getLogger(AshesSettlementController.class);

    @Autowired
    private AshesSettlementService ashesSettlementService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody AshesSettlement ashesSettlement) {
        return ashesSettlementService.insert(ashesSettlement);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return ashesSettlementService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody AshesSettlement ashesSettlement) {
        return ashesSettlementService.update(ashesSettlement);
    }

    @RequestMapping("/find")
    @ResponseBody
    public AshesSettlement find(@RequestParam("id") Integer id) {
        return ashesSettlementService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<AshesSettlement> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return ashesSettlementService.getList(currentPage, pageSize);
    }


}
