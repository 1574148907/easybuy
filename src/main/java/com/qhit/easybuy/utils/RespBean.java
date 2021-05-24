package com.qhit.easybuy.utils;

public class RespBean {
    private Integer code;
    private String msg;
    private Object data;
    //不携带数据
    public static RespBean success(Integer code,String msg){
        return new RespBean(code,msg,null);
    }
    //携带数据
    public static RespBean success(Integer code,String msg,Object data){
        return new RespBean(code,msg,data);
    }
    //不携带数据
    public static RespBean fail(Integer code,String msg){
        return new RespBean(code,msg,null);
    }
    //携带数据
    public static RespBean fail(Integer code,String msg,Object data){
        return new RespBean(code,msg,data);
    }
    public RespBean() {
    }

    public RespBean(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
