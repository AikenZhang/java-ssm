package com.blog.model.dto.vue;

import com.blog.model.dto.page.PageParams;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
public class VueParams extends PageParams {
    private String comId;
    private String comName=null;
    private String vueDescription;
    private String vueUsage;
    private String vueCode;

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getVueDescription() {
        return vueDescription;
    }

    public void setVueDescription(String vueDescription) {
        this.vueDescription = vueDescription;
    }

    public String getVueUsage() {
        return vueUsage;
    }

    public void setVueUsage(String vueUsage) {
        this.vueUsage = vueUsage;
    }

    public String getVueCode() {
        return vueCode;
    }

    public void setVueCode(String vueCode) {
        this.vueCode = vueCode;
    }
}
