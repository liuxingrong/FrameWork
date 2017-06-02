package com.team.controller;

import com.team.dto.MourningHall;
import com.team.service.MourningHallService;
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
@RequestMapping("/mourningHall")
@Controller
public class MourningHallController {

    Logger logger = LoggerFactory.getLogger(MourningHallController.class);

    @Autowired
    private MourningHallService mourningHallService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody MourningHall mourningHall) {
        return mourningHallService.insert(mourningHall);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return mourningHallService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody MourningHall mourningHall) {
        return mourningHallService.update(mourningHall);
    }

    @RequestMapping("/find")
    @ResponseBody
    public MourningHall find(@RequestParam("id") Integer id) {
        return mourningHallService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<MourningHall> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return mourningHallService.getList(currentPage, pageSize);
    }


}
