package com.team.controller;

import com.team.dto.Eulogy;
import com.team.service.EulogyService;
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
@RequestMapping("/eulogy")
@Controller
public class EulogyController {

    Logger logger = LoggerFactory.getLogger(EulogyController.class);

    @Autowired
    private EulogyService eulogyService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Eulogy eulogy) {
        return eulogyService.insert(eulogy);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return eulogyService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Eulogy eulogy) {
        return eulogyService.update(eulogy);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Eulogy find(@RequestParam("id") Integer id) {
        return eulogyService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Eulogy> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return eulogyService.getList(currentPage, pageSize);
    }


}
