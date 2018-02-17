package com.blog.model.enums;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/9
 */
public enum  CodeEnum  {
    SUCCESS("成功",200),ERROR("访问失败",201),LOGIN("登录成功",100),LOGINOUT("退出登录",101);
    private String name;
    private int index;
    CodeEnum(String name,int index){
        this.name=name;
        this.index=index;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
