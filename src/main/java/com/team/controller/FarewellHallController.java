package com.team.controller;

import com.team.dto.FarewellHall;
import com.team.service.FarewellHallService;
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
@RequestMapping("/farewellHall")
@Controller
public class FarewellHallController {

    Logger logger = LoggerFactory.getLogger(FarewellHallController.class);

    @Autowired
    private FarewellHallService farewellHallService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody FarewellHall farewellHall) {
        return farewellHallService.insert(farewellHall);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return farewellHallService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody FarewellHall farewellHall) {
        return farewellHallService.update(farewellHall);
    }

    @RequestMapping("/find")
    @ResponseBody
    public FarewellHall find(@RequestParam("id") Integer id) {
        return farewellHallService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<FarewellHall> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return farewellHallService.getList(currentPage, pageSize);
    }


}
