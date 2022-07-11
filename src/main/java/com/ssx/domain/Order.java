package com.ssx.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import com.ssx.enums.OrderStatus;
import lombok.Data;

/**
 * 
 * @TableName order
 */
@TableName(value ="order")
@Data
public class Order implements Serializable {
    /**
     * 订单id自增主键
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    /**
     * 用户电话号
     */
    @TableField(value = "user_phone_number")
    private String userPhoneNumber;

    /**
     * 乘客电话号
     */
    @TableField(value = "passenger_phone_number")
    private String passengerPhoneNumber;

    /**
     * 火车车次
     */
    @TableField(value = "train_number")
    private String trainNumber;

    /**
     * 起始站
     */
    @TableField(value = "start_station")
    private String startStation;

    /**
     * 终点站
     */
    @TableField(value = "end_station")
    private String endStation;

    /**
     * 车厢号
     */
    @TableField(value = "carriage_no")
    private String carriageNo;

    /**
     * 座位号
     */
    @TableField(value = "seat_no")
    private String seatNo;

    /**
     * 订单金额
     */
    @TableField(value = "order_money")
    private String orderMoney;

    /**
     * 订单创建时间
     */
    @TableField(value = "order_create_time",fill = FieldFill.INSERT)
    private Date orderCreateTime;

    /**
     * 订单状态 已完成 未支付 订单取消
     */
    @EnumValue
    @TableField(value = "order_status")
    private OrderStatus orderStatus;

    /**
     * 发车时间
     */
    @TableField(value = "train_start_date")
    private Time trainStartDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}