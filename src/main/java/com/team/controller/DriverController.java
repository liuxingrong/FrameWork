package com.team.controller;

import com.team.dto.Driver;
import com.team.service.DriverService;
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
@RequestMapping("/driver")
@Controller
public class DriverController {

    Logger logger = LoggerFactory.getLogger(DriverController.class);

    @Autowired
    private DriverService driverService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Driver driver) {
        return driverService.insert(driver);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return driverService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Driver driver) {
        return driverService.update(driver);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Driver find(@RequestParam("id") Integer id) {
        return driverService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Driver> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return driverService.getList(currentPage, pageSize);
    }


}
