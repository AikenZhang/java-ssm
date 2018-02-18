package com.blog.controller;

import com.blog.model.dto.Result;
import com.blog.model.dto.exception.BlogException;
import com.blog.model.dto.vue.VueResult;
import com.blog.model.entity.VueComponentEntity;
import com.blog.service.VueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
@Controller
public class VueController {
    @Autowired
    private VueService vueService;

    /**
     * 主页
     *
     * @return
     */
    @RequestMapping(
            value = {"/insertvue"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public Result<Integer> insertVue(VueComponentEntity vue) throws Exception {

        Result<Integer> result = new Result<Integer>();
        Integer res = vueService.insertVue(vue);
        result.setSuccess(true);
        result.setResult(res);
        result.setCode(200);
        //throw new Exception("未知错误");
        return result;
    }
}
