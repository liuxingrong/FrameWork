package com.team.controller;

import com.team.dto.Dead;
import com.team.service.DeadService;
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
@RequestMapping("/dead")
@Controller
public class DeadController {

    Logger logger = LoggerFactory.getLogger(DeadController.class);

    @Autowired
    private DeadService deadService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Dead dead) {
        return deadService.insert(dead);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return deadService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Dead dead) {
        return deadService.update(dead);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Dead find(@RequestParam("id") Integer id) {
        return deadService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Dead> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return deadService.getList(currentPage, pageSize);
    }


}
