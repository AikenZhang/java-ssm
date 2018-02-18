package com.blog.model.dto.exception;
import java.lang.Exception;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
public class BlogException extends Exception {
    //异常信息
    public String message;
    private String code;
    public BlogException(String message) {
        super(message);
        this.message = message;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
