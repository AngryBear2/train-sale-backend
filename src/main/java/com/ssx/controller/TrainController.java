package com.ssx.controller;

import com.ssx.service.TrainService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("train")
@Api("列车模块")
public class TrainController {
    @Autowired
    private TrainService trainService;
}
