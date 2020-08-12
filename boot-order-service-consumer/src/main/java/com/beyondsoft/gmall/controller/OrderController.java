package com.beyondsoft.gmall.controller;

import com.beyondsoft.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: com.beyondsoft.gmall.controller.OrderController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/8/12 19:41
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public void initOrder (){
        orderService.initOrder("1");
    }
}
