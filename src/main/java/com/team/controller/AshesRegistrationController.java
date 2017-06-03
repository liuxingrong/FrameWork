package com.team.controller;

import com.team.dto.AshesRegistration;
import com.team.service.AshesRegistrationService;
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
@RequestMapping("/ashesRegistration")
@Controller
public class AshesRegistrationController {

    Logger logger = LoggerFactory.getLogger(AshesRegistrationController.class);

    @Autowired
    private AshesRegistrationService ashesRegistrationService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody AshesRegistration ashesRegistration) {
        return ashesRegistrationService.insert(ashesRegistration);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return ashesRegistrationService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody AshesRegistration ashesRegistration) {
        return ashesRegistrationService.update(ashesRegistration);
    }

    @RequestMapping("/find")
    @ResponseBody
    public AshesRegistration find(@RequestParam("id") Integer id) {
        return ashesRegistrationService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<AshesRegistration> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return ashesRegistrationService.getList(currentPage, pageSize);
    }


}
