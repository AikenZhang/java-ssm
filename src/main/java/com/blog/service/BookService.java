package com.blog.service;

import com.blog.dao.BookDao;
import com.blog.model.table.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public interface BookService {

    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(int bookId);


}
