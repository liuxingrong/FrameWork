package com.team.controller;

import com.team.dto.CremationFurnace;
import com.team.service.CremationFurnaceService;
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
@RequestMapping("/cremationFurnace")
@Controller
public class CremationFurnaceController {

    Logger logger = LoggerFactory.getLogger(CremationFurnaceController.class);

    @Autowired
    private CremationFurnaceService cremationFurnaceService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody CremationFurnace cremationFurnace) {
        return cremationFurnaceService.insert(cremationFurnace);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return cremationFurnaceService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody CremationFurnace cremationFurnace) {
        return cremationFurnaceService.update(cremationFurnace);
    }

    @RequestMapping("/find")
    @ResponseBody
    public CremationFurnace find(@RequestParam("id") Integer id) {
        return cremationFurnaceService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<CremationFurnace> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return cremationFurnaceService.getList(currentPage, pageSize);
    }


}
