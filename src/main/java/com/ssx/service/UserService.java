package com.ssx.service;

import cn.dev33.satoken.util.SaResult;
import com.ssx.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author telek
* @description 针对表【user】的数据库操作Service
* @createDate 2022-07-11 14:07:48
*/
public interface UserService extends IService<User> {

    SaResult doRegister(User user);

}
