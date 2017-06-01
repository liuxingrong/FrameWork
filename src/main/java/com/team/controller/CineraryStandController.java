package com.team.controller;

import com.team.dto.CineraryStand;
import com.team.service.CineraryStandService;
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
@RequestMapping("/cineraryStand")
@Controller
public class CineraryStandController {

    Logger logger = LoggerFactory.getLogger(CineraryStandController.class);

    @Autowired
    private CineraryStandService cineraryStandService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody CineraryStand cineraryStand) {
        return cineraryStandService.insert(cineraryStand);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return cineraryStandService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody CineraryStand cineraryStand) {
        return cineraryStandService.update(cineraryStand);
    }

    @RequestMapping("/find")
    @ResponseBody
    public CineraryStand find(@RequestParam("id") Integer id) {
        return cineraryStandService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<CineraryStand> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return cineraryStandService.getList(currentPage, pageSize);
    }


}
