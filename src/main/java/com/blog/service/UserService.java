package com.blog.service;
import com.blog.model.entity.UserEntity;
/**
 * @author status404
 * @version V1.0
 * @date 2018/1/10
 */
public interface UserService {
    /**
     * @function: 获取用户的信息
     * @Date: 2018/1/10 上午11:09
     * @param UserId  用户名
     */
    UserEntity getUser(String UserId);
}
