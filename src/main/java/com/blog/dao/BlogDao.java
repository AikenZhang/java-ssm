package com.blog.dao;
import com.blog.model.table.BlogContentEntity;
import java.util.List;
public interface BlogDao {
    /**
     * 获取blog
     *
     * @param blogId
     * @return
     */
    List<BlogContentEntity> getBlog(int blogId);
}
