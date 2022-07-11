package com.ssx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssx.domain.Train;
import com.ssx.service.TrainService;
import com.ssx.mapper.TrainMapper;
import org.springframework.stereotype.Service;

/**
* @author telek
* @description 针对表【train】的数据库操作Service实现
* @createDate 2022-07-11 14:07:26
*/
@Service
public class TrainServiceImpl extends ServiceImpl<TrainMapper, Train>
    implements TrainService{

}




