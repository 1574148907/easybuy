package com.qhit.easybuy.exception;

public class CustomServiceException extends RuntimeException {
    private Integer code;
    private String msg;
    public CustomServiceException(String message, Integer code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
