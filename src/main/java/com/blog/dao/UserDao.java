package com.blog.dao;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/10
 */
import com.blog.model.entity.UserEntity;
public interface UserDao {
    /**
     * @Author: 95DBC
     * @Date: 2018/1/10 上午10:30
     * @param UserId  用户名
     *
     */
    UserEntity getUser(String UserId);
}
