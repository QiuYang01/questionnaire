package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户实体
 */
@ApiModel(value = "用户",description = "用户id，账号，密码")
public class User {
    @ApiModelProperty(value = "用户id")
    private  int id;
    @ApiModelProperty(value = "用户账号")
    private  int user_id;
    @ApiModelProperty(value = "用户密码")
    private String user_password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
