package com.team.controller;

import com.team.dto.Refrigerated;
import com.team.service.RefrigeratedService;
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
@RequestMapping("/refrigerated")
@Controller
public class RefrigeratedController {

    Logger logger = LoggerFactory.getLogger(RefrigeratedController.class);

    @Autowired
    private RefrigeratedService refrigeratedService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Refrigerated refrigerated) {
        return refrigeratedService.insert(refrigerated);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return refrigeratedService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Refrigerated refrigerated) {
        return refrigeratedService.update(refrigerated);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Refrigerated find(@RequestParam("id") Integer id) {
        return refrigeratedService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Refrigerated> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return refrigeratedService.getList(currentPage, pageSize);
    }


}
