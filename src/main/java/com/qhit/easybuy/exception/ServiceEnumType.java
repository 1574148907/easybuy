package com.qhit.easybuy.exception;

public enum ServiceEnumType {
// 1开头的为成功  ，2开头的为失败
    GET_SUCCESS(10,"查询成功"),
    DELETE_SUCCESS(11,"删除成功"),
    UPDATE_SUCCESS(12,"修改成功"),
    SAVE_SUCCESS(13,"添加成功"),

    GET_FAIL(20,"查询失败"),
    DELETE_FAIL(21,"删除失败"),
    UPDATE_FAIL(22,"修改失败"),
    SAVE_FAIL(23,"添加失败");
    private Integer code;
    private String msg;

    ServiceEnumType(Integer code, String msg) {
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
