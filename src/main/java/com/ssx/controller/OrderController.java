package com.ssx.controller;

import com.ssx.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api("订单模块")
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
}
