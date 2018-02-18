package com.blog.common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.blog.model.dto.Result;
import com.blog.model.dto.exception.BlogException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import java.io.IOException;


/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
//    @Override
//    public ModelAndView resolveException(HttpServletRequest request,
//                                         HttpServletResponse response, Object handler, Exception ex) {
//
////        ex.printStackTrace();
////        BlogException exception = null;
////
////        //如果抛出的是系统自定义的异常则直接转换
////        if (ex instanceof BlogException) {
////            exception = (BlogException) ex;
////        } else {
////            //如果抛出的不是系统自定义的异常则重新构造一个未知错误异常
////            //这里我就也有CustomException省事了，实际中应该要再定义一个新的异常
////            exception = new BlogException("系统未知错误");
////        }
////        Result<BlogException> res = new Result<BlogException>();
////        res.setSuccess(false);
////        res.setError(exception.toString());
////        return new ModelAndView("/ssd");
//        /**日志log*/
//        private static Logger log = LoggerFactory.getLogger(CustomExceptionResolver.class);
//
//        //系统抛出的异常
//        @Override
//        public ModelAndView resolveException(HttpServletRequest request,
//                HttpServletResponse response, Object handler, Exception ex) {
//            //handler就是处理器适配器要执行的Handler对象(只有method)
//            //解析出异常类型。
//    	/*  使用response返回    */
//            response.setStatus(HttpStatus.OK.value()); //设置状态码
//            response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType
//            response.setCharacterEncoding("UTF-8"); //避免乱码
//            response.setHeader("Cache-Control", "no-cache, must-revalidate");
//            //如果该 异常类型是系统 自定义的异常，直接取出异常信息。
//            BlogException customException=null;
//            try {
//                if(ex instanceof BlogException){
//                    customException = (BlogException)ex;
//                    //错误信息
//                    response.getWriter().write(ResultUtils.error(customException.getCode(),ex.getMessage()).toString());
//                }else
//                    response.getWriter().write(ResultUtils.error(-1,ex.getMessage()).toString());
//            } catch (IOException e) {
//                log.error("与客户端通讯异常:"+ e.getMessage(), e);
//                e.printStackTrace();
//            }
//            ModelAndView modelAndView=new ModelAndView();
//
//            return modelAndView;
//        }
//    }
    /**日志log*/
       private static Logger log = LoggerFactory.getLogger(CustomExceptionResolver.class);
    //系统抛出的异常
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        //handler就是处理器适配器要执行的Handler对象(只有method)
        //解析出异常类型。
    	/*  使用response返回    */
        response.setStatus(HttpStatus.OK.value()); //设置状态码
        response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType
        response.setCharacterEncoding("UTF-8"); //避免乱码
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        //如果该 异常类型是系统 自定义的异常，直接取出异常信息。
        BlogException customException=null;
        try {
            Result<BlogException> res = new Result<BlogException>();
            res.setSuccess(false);
            res.setCode(100);
            if(ex instanceof BlogException){
                customException = (BlogException)ex;
                res.setError(customException.getMessage().toString());
                response.getWriter().write(res.toString());
                log.error(customException.getMessage().toString());
            }else
                res.setError("服务器发生错误");
                response.getWriter().write(res.toString());
                log.error(ex.getMessage().toString());
        } catch (IOException e) {
            log.error("与客户端通讯异常:"+ e.getMessage(), e);
            e.printStackTrace();

        }
        ModelAndView modelAndView=new ModelAndView();

        return modelAndView;
    }
}
