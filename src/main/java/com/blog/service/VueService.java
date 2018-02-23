package com.blog.service;

import com.blog.model.dto.Result;
import com.blog.model.dto.vue.VueParams;
import com.blog.model.entity.VueComponentEntity;
import com.blog.model.entity.VueListEntity;

import java.util.List;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
public interface VueService {
    /*插入vue组件信息
     */
    int insertVue(VueComponentEntity vue);

    /**
    * 插入vueBut
    * @author AikenZhang
    */
    int insertVueBut(VueListEntity vueL);

    Result<List<VueComponentEntity>> selectVue(VueParams params);
}
