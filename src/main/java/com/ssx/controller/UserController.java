package com.ssx.controller;

import cn.dev33.satoken.util.SaResult;
import cn.hutool.core.util.ObjectUtil;
import com.ssx.domain.User;
import com.ssx.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@Api("用户模块")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户列表")
    @GetMapping("/list")
    public List<User> userList(){
      return userService.list();
    }

    @ApiOperation(value = "注册用户")
    @PostMapping("/register")
    public SaResult doRegister(@RequestBody User user){
        if(ObjectUtil.isEmpty(user)){
            return SaResult.error("用户为空");
        }
        return userService.doRegister(user);
    }
}
