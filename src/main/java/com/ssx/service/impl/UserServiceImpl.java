package com.ssx.service.impl;

import cn.dev33.satoken.util.SaResult;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssx.domain.User;
import com.ssx.service.UserService;
import com.ssx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author telek
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-11 14:07:48
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Override
    public SaResult doRegister(User user) {
        String userId = user.getUserId();
        String userPassword = user.getUserPassword();
        String userRealName = user.getUserRealName();
        return SaResult.ok();
    }
}




