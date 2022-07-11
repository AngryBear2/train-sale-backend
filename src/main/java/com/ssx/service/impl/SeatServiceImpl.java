package com.ssx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.ssx.domain.Seat;
import com.ssx.service.SeatService;
import com.ssx.mapper.SeatMapper;
import org.springframework.stereotype.Service;

/**
* @author telek
* @description 针对表【seat】的数据库操作Service实现
* @createDate 2022-07-11 14:07:26
*/
@Service
public class SeatServiceImpl extends MppServiceImpl<SeatMapper, Seat>
    implements SeatService{

}




