package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 结果码实体
 */
@ApiModel(value = "结果码",description = "返回结果码给前端")
public class Result {
    // 正确返回代码
    private static final Integer SUCCESS_CODE = 0;
    // 错误返回代码
    private static final Integer ERROR_CODE = 1;

    // 状态代码
    @ApiModelProperty(value = "状态码")
    private Integer status;
    // 信息
    @ApiModelProperty(value = "结果信息")
    private String msg;
    // 内容
    @ApiModelProperty(value = "结果内容")
    private Object message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Result() {}

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.message = data;
    }

    public static Result ok(Object message) {
        return ok("OK", message);
    }

    public static Result ok(String msg, Object message) {
        return new Result(SUCCESS_CODE, msg, message);
    }

    public static Result error(Object message) {
        return error("ERROR", message);
    }

    public static Result error(String msg, Object message) {
        return new Result(ERROR_CODE, msg, message);
    }

}
