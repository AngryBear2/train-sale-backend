package com.ssx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import com.ssx.domain.Station;
import com.ssx.service.StationService;
import com.ssx.mapper.StationMapper;
import org.springframework.stereotype.Service;

/**
* @author telek
* @description 针对表【station】的数据库操作Service实现
* @createDate 2022-07-11 14:07:26
*/
@Service
public class StationServiceImpl extends MppServiceImpl<StationMapper, Station>
    implements StationService{

}




