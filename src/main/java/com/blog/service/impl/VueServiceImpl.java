package com.blog.service.impl;

import com.blog.dao.VueDao;
import com.blog.model.dto.Result;
import com.blog.model.dto.vue.VueParams;
import com.blog.model.entity.VueComponentEntity;
import com.blog.model.entity.VueListEntity;
import com.blog.service.VueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int insertVueBut(VueListEntity vueL) {
        return vueDao.insertVueBut(vueL);
    }

    @Override
    public Result<List<VueComponentEntity>> selectVue(VueParams params) {
        Result<List<VueComponentEntity>> result = new Result<List<VueComponentEntity>>();
        result.setSuccess(true);
        result.setResult(vueDao.selectVue(params));
        result.setCode(200);
        result.setTotalCount(vueDao.getCount());
        return result;
    }
}
