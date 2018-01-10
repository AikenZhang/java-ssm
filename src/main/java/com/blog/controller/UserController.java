package com.blog.controller;

import com.blog.model.entity.UserEntity;
import com.blog.service.UserService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.blog.model.dto.Result;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/10
 */
@Controller
public class UserController {
   @Autowired
    private UserService userService;
    @RequestMapping(
            value = {"/getuser"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public Result<UserEntity> getUser(String UserId) {
        UserEntity user = userService.getUser(UserId);
        Result<UserEntity> res = new Result(true, user);
        return res;
    }
}
