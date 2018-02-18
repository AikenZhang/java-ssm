package com.blog.dao;

import com.blog.model.dto.vue.VueResult;
import com.blog.model.entity.VueComponentEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
public interface VueDao {
    int insertVue(@Param("vue") VueComponentEntity vue);
}
