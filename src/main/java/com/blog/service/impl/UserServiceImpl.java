package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.model.entity.UserEntity;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/10
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserEntity getUser(String UserId){
        return userDao.getUser(UserId);
    }
}
