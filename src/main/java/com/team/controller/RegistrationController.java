package com.team.controller;

import com.team.dto.Registration;
import com.team.service.RegistrationService;
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
@RequestMapping("/registration")
@Controller
public class RegistrationController {

    Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Registration registration) {
        return registrationService.insert(registration);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return registrationService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Registration registration) {
        return registrationService.update(registration);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Registration find(@RequestParam("id") Integer id) {
        return registrationService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Registration> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return registrationService.getList(currentPage, pageSize);
    }


}
