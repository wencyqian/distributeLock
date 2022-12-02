package com.atguigu.distributedlock.controller;

import com.atguigu.distributedlock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 *
 * @Author: qianwenqian
 * @Date: 2022/12/2 9:53
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/hello")
    public String hello() {
        return "ok";
    }

    @GetMapping("/check/lock/{id}")
    public String checkAndLock(@PathVariable("id")String id) {
        this.stockService.checkAndLock();
        return "验库存并锁库存成功";
    }
}
