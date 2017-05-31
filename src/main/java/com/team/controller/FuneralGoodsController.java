package com.team.controller;

import com.team.dto.FuneralGoods;
import com.team.service.FuneralGoodsService;
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
@RequestMapping("/funeralGoods")
@Controller
public class FuneralGoodsController {

    Logger logger = LoggerFactory.getLogger(FuneralGoodsController.class);

    @Autowired
    private FuneralGoodsService funeralGoodsService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody FuneralGoods funeralGoods) {
        return funeralGoodsService.insert(funeralGoods);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam("id") Integer id) {
        return funeralGoodsService.delete(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(@RequestBody FuneralGoods funeralGoods) {
        return funeralGoodsService.update(funeralGoods);
    }

    @RequestMapping("/find")
    @ResponseBody
    public FuneralGoods find(@RequestParam("id") Integer id) {
        return funeralGoodsService.findById(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<FuneralGoods> list(@RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){
        return funeralGoodsService.getList(currentPage, pageSize);
    }


}
