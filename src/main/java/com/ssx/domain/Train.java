package com.ssx.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import com.ssx.enums.TrainRunningType;
import com.ssx.enums.TrainType;
import lombok.Data;

/**
 * 
 * @TableName train
 */
@TableName(value ="train")
@Data
public class Train implements Serializable {
    /**
     * 火车编号
     */
    @TableId(value = "train_no")
    private String trainNo;

    /**
     * 火车车次
     */
    @TableField(value = "train_number")
    private String trainNumber;

    /**
     * 火车类型 火车 高铁 动车
     */
    @EnumValue()
    @TableField(value = "train_type")
    private TrainType trainType;

    /**
     * 车厢数
     */
    @TableField(value = "train_carriage_count")
    private Integer trainCarriageCount;

    /**
     * 列车起始站
     */
    @TableField(value = "train_start_station")
    private String trainStartStation;

    /**
     * 列车终点站
     */
    @TableField(value = "train_end_station")
    private String trainEndStation;

    /**
     * 列车起发时间
     */
    @TableField(value = "train_start_time")
    private Time trainStartTime;

    /**
     * 列车终点时间
     */
    @TableField(value = "train_end_time")
    private Time trainEndTime;

    /**
     * 列车总时长
     */
    @TableField(value = "train_running_time")
    private Time trainRunningTime;

    /**
     * 火车运行状态 运行 停运
     */
    @TableField(value = "train_running_type")
    private TrainRunningType trainRunningType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}