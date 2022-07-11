package com.ssx.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import com.ssx.enums.UserType;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户手机号 主键
     */
    @TableId(value = "user_phone_number")
    private String userPhoneNumber;

    /**
     * 用户密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 用户真实姓名
     */
    @TableField(value = "user_real_name")
    private String userRealName;

    /**
     * 用户类型 用户 工作人员 高级权限管理员
     */
    @EnumValue
    @TableField(value = "user_type",fill = FieldFill.INSERT_UPDATE)
    private UserType userType;

    /**
     * 用户身份证号
     */
    @TableField(value = "user_id")

    private String userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}