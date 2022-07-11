package com.ssx.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import com.ssx.enums.SeatType;
import lombok.Data;

/**
 * 
 * @TableName seat
 */
@TableName(value ="seat")
@Data
public class Seat implements Serializable {
    /**
     * 火车号
     */
    @MppMultiId
    @TableField(value = "train_no")
    private Integer trainNo;

    /**
     * 车厢号
     */
    @MppMultiId
    @TableField(value = "carriage_no")
    private Integer carriageNo;

    /**
     * 座位号
     */
    @MppMultiId
    @TableField(value = "seat_no")
    private Integer seatNo;

    /**
     * 座位类型
     */
    @EnumValue
    @TableField(value = "seat_type")
    private SeatType seatType;

    /**
     * 根据不同座位类型 从硬座座位额外价钱
     */
    @TableField(value = "extra_money")
    private String extraMoney;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}