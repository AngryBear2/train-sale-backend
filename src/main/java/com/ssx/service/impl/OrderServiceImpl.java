package com.ssx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssx.domain.Order;
import com.ssx.service.OrderService;
import com.ssx.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author telek
* @description 针对表【order】的数据库操作Service实现
* @createDate 2022-07-11 14:07:26
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




