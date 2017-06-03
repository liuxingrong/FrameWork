package com.team.controller;

import com.team.dto.Business;
import com.team.dto.Dead;
import com.team.service.BusinessService;
import com.team.service.DeadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by fantasy on 17-5-28.
 */
@RequestMapping("/business")
@Controller
public class BusinessController {

    Logger logger = LoggerFactory.getLogger(BusinessController.class);

    @Autowired
    private BusinessService businessService;
    @Autowired
    private DeadService deadService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Map parm) {
        System.out.println(parm);
        Dead dead = new Dead();
        String number = (String) parm.get("number");
        String deadName = (String) parm.get("deadName");
        String gender = (String) parm.get("gender");
        String deathCause = (String) parm.get("deathCause");
        String telephone = (String) parm.get("telephone");
        String age = (String) parm.get("age");
        String pickUpTime = (String) parm.get("pickUpTime");
        String pickUpAddress = (String) parm.get("pickUpAddress");
        String note = (String) parm.get("note");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
        Date d = new Date();
        try {
           d=format.parse(parm.get("pickUpTime").toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dead.setAge(Integer.parseInt(age));
        dead.setCreateTime(new Date());
        dead.setGender(Integer.parseInt(gender));
        dead.setDeathCause(deathCause);
        dead.setName(deadName);
        deadService.insert(dead);
        Business business = new Business();
        business.setDeadName(deadName);
        business.setNumber(Integer.parseInt(number));
        business.setNote(note);
        business.setTelephone(telephone);
        business.setPickUpAddress(pickUpAddress);
        business.setPickUpTime(d);
        business.setCreateTime(new Date());
        business.setType(1);
        business.setDeadId(dead.getId());
//        return businessService.insert(business);
        return businessService.insert(business);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return businessService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Business business) {
        return businessService.update(business);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Business find(@RequestParam("id") Integer id) {
        return businessService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Business> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize,@RequestParam("type")int type){
        List<Business> list = businessService.getList(currentPage, pageSize,type);
        return list;
    }

    @RequestMapping("/choose")
    @ResponseBody
    public int choose(@RequestBody Map parm){
        String type = (String) parm.get("type");
        int i = Integer.parseInt(type);
        String value = (String) parm.get("value");
        String id = (String) parm.get("id");
        Business business =   businessService.findById(Integer.parseInt(id));
        business.setType(i+1);
        if(i==1){
            business.setCarId(value);
        }
        if(i==2){
            business.setRefrigeratedId(Integer.parseInt(value));
        }
        if(i==3){
            business.setUserId(Integer.parseInt(value));
        }
        if(i==4){
            business.setFarewellHallId(Integer.parseInt(value));
        }
        if(i==5){
            business.setCharge(Integer.parseInt(value));
        }
        if(i==6){
            business.setCremationFurnaceId(Integer.parseInt(value));
        }
        return businessService.update(business);
    }

}
