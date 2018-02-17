package com.blog.controller;

import com.blog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.blog.model.table.Book;
import com.blog.model.dto.Result;
import java.util.List;
@Controller
public class IndexController
{
   @Autowired
   private BookService bookService;
    /**
     * 主页
     * @return
     */
    @RequestMapping(
            value = {"/"},
            method = {RequestMethod.GET}
    )
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = {"/getbook"},method = {RequestMethod.POST})
    @ResponseBody
    public Result<List<Book>> getName(){
        Result<List<Book>> result=new Result<List<Book>>(true,bookService.getById(1003));
        return result;
    }
}

