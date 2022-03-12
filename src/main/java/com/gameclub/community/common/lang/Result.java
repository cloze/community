package com.gameclub.community.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description
 * @Author YCDN
 * @Date 2022/3/12 15:20
 * @Version 1.0
 */
@Data
public class Result implements Serializable {
    /**
     * 200是正常，非200异常
     */
    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data){
        return succ(200,"操作成功",data);
    }

    public static Result succ(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg,Object data){
        return fail(400,msg,null);
    }

    public static Result fail(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
