package com.ssx.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import com.ssx.enums.PassengerType;
import lombok.Data;

/**
 * 
 * @TableName passenger
 */
@TableName(value ="passenger")
@Data
public class Passenger implements Serializable {
    /**
     * 乘客电话号码
     */
    @TableId(value = "passenger_phone_number")
    private String passengerPhoneNumber;

    /**
     * 乘客真实姓名
     */
    @TableField(value = "passenger_real_name")
    private String passengerRealName;

    /**
     * 乘客类型 小孩 成年人
     */
    @TableField(value = "passenger_type")
    @EnumValue
    private PassengerType passengerType;

    /**
     * 乘客身份证号
     */
    @TableField(value = "passenger_id")
    private String passengerId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}