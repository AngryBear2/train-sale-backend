package com.ssx.controller;

import com.ssx.service.StationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("station")
@Api("车站模块")
public class StationController {
    @Autowired
    private StationService stationService;
}
