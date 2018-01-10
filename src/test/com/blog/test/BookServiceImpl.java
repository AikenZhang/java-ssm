package com.blog.test;

import com.blog.model.table.Book;
import com.blog.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class BookServiceImpl {
    @Autowired
    private BookService bookService;

    @Test
    public void getBook() throws Exception {
//        Book a=bookService.getById(1003);
//        System.out.println(a);
    }
}
