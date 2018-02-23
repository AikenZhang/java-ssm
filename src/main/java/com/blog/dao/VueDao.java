package com.blog.dao;

import com.blog.model.dto.vue.VueParams;
import com.blog.model.dto.vue.VueResult;
import com.blog.model.entity.VueComponentEntity;
import com.blog.model.entity.VueListEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author status404
 * @version V1.0
 */
public interface VueDao {
/**
* 插入vue组件基本信息
* @author AikenZhang
*/
    int insertVue(@Param("vue") VueComponentEntity vue);
/**
* 插入Vue示例实现代码
* @author AikenZhang
*/
    int insertVueBut(@Param("vueL") VueListEntity vueL);
    /**
    * 查询vueBut
    * @author AikenZhang
    */
    List<VueComponentEntity> selectVue(@Param("params") VueParams params);
    /**
    * 获取表的数量
    * @author AikenZhang
    */

    int getCount();
}
