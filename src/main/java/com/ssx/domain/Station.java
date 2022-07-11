package com.ssx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.Data;

/**
 * 
 * @TableName station
 */
@TableName(value ="station")
@Data
public class Station implements Serializable {
    /**
     * 火车编号
     */
    @MppMultiId
    @TableField(value = "train_no")
    private String trainNo;

    /**
     * 车站编号
     */
    @MppMultiId
    @TableField(value = "station_no")
    private String stationNo;

    /**
     * 车站名
     */
    @TableField(value = "station_name")
    private String stationName;

    /**
     * 火车车次
     */
    @TableField(value = "train_number")
    private String trainNumber;

    /**
     * 到达日期与初始日期差值
     */
    @TableField(value = "arrive_day")
    private Integer arriveDay;

    /**
     * 到达时间
     */
    @TableField(value = "arrive_time")
    private Time arriveTime;

    /**
     * 发车时间
     */
    @TableField(value = "start_time")
    private Time startTime;

    /**
     * 停留时间
     */
    @TableField(value = "parking_time")
    private Time parkingTime;

    /**
     * 从这一战到下一站的钱
     */
    @TableField(value = "station_money")
    private String stationMoney;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}