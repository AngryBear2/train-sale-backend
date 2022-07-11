package com.ssx.controller;

import com.ssx.service.SeatService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seat")
@Api("座位模块")
public class SeatController {
    @Autowired
    private SeatService seatService;
}
