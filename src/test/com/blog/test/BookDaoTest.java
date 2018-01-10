package com.blog.test;

import com.blog.dao.BookDao;
import com.blog.model.table.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById() throws Exception {
//        int id = 1003;
//        Book book = bookDao.queryById(id);
//        System.out.println(book);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book book : books) {
            System.out.println(book+"abcd");
        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        int bookId = 1003;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update=" + update);
    }
}
