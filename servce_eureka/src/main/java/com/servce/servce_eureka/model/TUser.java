package com.servce.servce_eureka.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "t_user")
@Data
public class TUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    public TUser() {
    }
}