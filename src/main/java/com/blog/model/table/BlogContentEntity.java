package com.blog.model.table;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "blog_Content", schema = "blog", catalog = "")
public class BlogContentEntity {
    private int blogId;
    private String blogTitle;
    private String blogContent;
    private String blogImg;
    private Timestamp blogTime;

    @Id
    @Column(name = "blog_id")
    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    @Basic
    @Column(name = "blog_title")
    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    @Basic
    @Column(name = "blog_content")
    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    @Basic
    @Column(name = "blog_img")
    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg;
    }

    @Basic
    @Column(name = "blog_time")
    public Timestamp getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(Timestamp blogTime) {
        this.blogTime = blogTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogContentEntity that = (BlogContentEntity) o;

        if (blogId != that.blogId) return false;
        if (blogTitle != null ? !blogTitle.equals(that.blogTitle) : that.blogTitle != null) return false;
        if (blogContent != null ? !blogContent.equals(that.blogContent) : that.blogContent != null) return false;
        if (blogImg != null ? !blogImg.equals(that.blogImg) : that.blogImg != null) return false;
        if (blogTime != null ? !blogTime.equals(that.blogTime) : that.blogTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blogId;
        result = 31 * result + (blogTitle != null ? blogTitle.hashCode() : 0);
        result = 31 * result + (blogContent != null ? blogContent.hashCode() : 0);
        result = 31 * result + (blogImg != null ? blogImg.hashCode() : 0);
        result = 31 * result + (blogTime != null ? blogTime.hashCode() : 0);
        return result;
    }
}
