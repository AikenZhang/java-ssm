package com.blog.service.impl;

import com.blog.dao.BookDao;
import com.blog.model.table.Book;
import com.blog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    // 注入Service依赖
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getById(int bookId) {
        return bookDao.queryById(bookId);
    }

}
