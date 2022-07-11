package com.ssx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssx.domain.Passenger;
import com.ssx.service.PassengerService;
import com.ssx.mapper.PassengerMapper;
import org.springframework.stereotype.Service;

/**
* @author telek
* @description 针对表【passenger】的数据库操作Service实现
* @createDate 2022-07-11 14:07:26
*/
@Service
public class PassengerServiceImpl extends ServiceImpl<PassengerMapper, Passenger>
    implements PassengerService{

}




