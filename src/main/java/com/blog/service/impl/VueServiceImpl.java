package com.blog.service.impl;

import com.blog.dao.VueDao;
import com.blog.model.entity.VueComponentEntity;
import com.blog.service.VueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
@Service
public class VueServiceImpl implements VueService {
    // 注入Service依赖
    @Autowired
    private VueDao vueDao;
    @Override
    public int insertVue(VueComponentEntity vue) {
        return vueDao.insertVue(vue);
    }

}
