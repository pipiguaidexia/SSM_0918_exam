package com.xz.utils;

/**
 * @author 星晨
 * @Date 2023-09-19 16:06
 */
public enum EnumCode {
    NOT_FOUND(404,"资源找不到"),
    ACCOUNT_NOT_FOUND(10000,"账号不存在"),
    PASSWORD_ERROR(10001,"密码错误"),
    NOT_AUTHORITY(10002,"未登录"),
    NOT_PERMISSION(10403,"权限不足"),
    ACCOUNT_ALREADY_EXISTS(10000,"账号已存在")
    ;
    private int code;
    private String message;
    EnumCode(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
