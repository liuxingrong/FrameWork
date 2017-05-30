package com.team.controller;

import com.team.dto.Car;
import com.team.service.CarService;
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
@RequestMapping("/car")
@Controller
public class CarController {

    Logger logger = LoggerFactory.getLogger(CarController.class);

    @Autowired
    private CarService carService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Car car) {
        return carService.insert(car);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return carService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody Car car) {
        return carService.update(car);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Car find(@RequestParam("id") Integer id) {
        return carService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Car> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return carService.getList(currentPage, pageSize);
    }


}
