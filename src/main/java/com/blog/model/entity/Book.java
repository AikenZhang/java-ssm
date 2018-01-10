package com.blog.model.entity;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/10
 */
public class Book {

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name  +
                ", number=" + number +
                '}';
    }
}