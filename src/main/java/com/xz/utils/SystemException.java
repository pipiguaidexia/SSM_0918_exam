package com.xz.utils;

/**
 * @author 星晨
 * @Date 2023-09-18 16:34
 */
public class SystemException extends RuntimeException{
    private int code;
    private String message;
    public SystemException(EnumCode enumCode) {
        super(enumCode.getMessage());
        this.code = enumCode.getCode();
        this.message = enumCode.getMessage();
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
