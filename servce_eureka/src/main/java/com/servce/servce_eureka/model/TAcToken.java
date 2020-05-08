package com.servce.servce_eureka.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_ac_token")
@Data
public class TAcToken implements Serializable {
    /**
     * 会话id
     */
    @Id
    @Column(name = "ac_token_id")
    private String acTokenId;

    /**
     * 终端用户id
     */
    @Column(name = "ac_user_id")
    private String acUserId;

    /**
     * token值
     */
    @Column(name = "token_value")
    private String tokenValue;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 登录的IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 终端操作系统类型，ios还是android，取字典表key标识
     */
    @Column(name = "os_type")
    private String osType;

    /**
     * 终端操作系统的版本号
     */
    @Column(name = "os_version")
    private String osVersion;

    /**
     * 终端设备的类型和型号，如iphone6
     */
    @Column(name = "device_version")
    private String deviceVersion;

    /**
     * 设备识别号
     */
    @Column(name = "device_sn")
    private String deviceSn;

    /**
     * 当前登录的应用版本号
     */
    @Column(name = "app_version")
    private String appVersion;

    /**
     * 会话过期时间
     */
    @Column(name = "expiry_time")
    private Date expiryTime;

    public TAcToken() {
    }
}