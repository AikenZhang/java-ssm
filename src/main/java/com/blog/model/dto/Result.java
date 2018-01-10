package com.blog.model.dto;

import java.util.List;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/9
 */
import com.blog.model.enums.CodeEnum;
import java.util.List;
public class Result<T> {
    //状态码
    private String code;
    //是否成功
    private boolean success;
    //成功时返回的数据
    private T result;
    //错误信息
    public String error;
    public Result(boolean success){
        this.success=success;
        this.error="系统发生错误";
    }
    public Result(boolean success, T result){
        if(success){
            this.code=CodeEnum.SUCCESS.getIndex();
        }
        this.success=success;
        this.result=result;
    }
    public Result(boolean success,String error){
        this.success=success;
        this.error=error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
