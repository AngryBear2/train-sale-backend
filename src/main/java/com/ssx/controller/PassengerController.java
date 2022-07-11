package com.ssx.controller;

import com.ssx.service.PassengerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("passenger")
@Api("乘客模块")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
}
