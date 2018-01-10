package com.blog.model.enums;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/9
 */
public enum  CodeEnum  {
    SUCCESS("成功","200"),ERROR("访问失败","201"),LOGIN("登录成功","100"),LOGINOUT("退出登录","101");
    private String name;
    private String index;
    CodeEnum(String name,String index){
        this.name=name;
        this.index=index;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
