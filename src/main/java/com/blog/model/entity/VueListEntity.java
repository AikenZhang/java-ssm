package com.blog.model.entity;

import javax.persistence.*;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
@Entity
@Table(name = "vue_list", schema = "blog", catalog = "")
public class VueListEntity {
    private int id;
    private String comId;
    private String vueBut;
    private String vueJs;
    private Integer vueSort;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "com_id")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Basic
    @Column(name = "vue_but")
    public String getVueBut() {
        return vueBut;
    }

    public void setVueBut(String vueBut) {
        this.vueBut = vueBut;
    }

    @Basic
    @Column(name = "vue_js")
    public String getVueJs() {
        return vueJs;
    }

    public void setVueJs(String vueJs) {
        this.vueJs = vueJs;
    }

    @Basic
    @Column(name = "vue_sort")
    public Integer getVueSort() {
        return vueSort;
    }

    public void setVueSort(Integer vueSort) {
        this.vueSort = vueSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VueListEntity that = (VueListEntity) o;

        if (id != that.id) return false;
        if (comId != null ? !comId.equals(that.comId) : that.comId != null) return false;
        if (vueBut != null ? !vueBut.equals(that.vueBut) : that.vueBut != null) return false;
        if (vueJs != null ? !vueJs.equals(that.vueJs) : that.vueJs != null) return false;
        if (vueSort != null ? !vueSort.equals(that.vueSort) : that.vueSort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (comId != null ? comId.hashCode() : 0);
        result = 31 * result + (vueBut != null ? vueBut.hashCode() : 0);
        result = 31 * result + (vueJs != null ? vueJs.hashCode() : 0);
        result = 31 * result + (vueSort != null ? vueSort.hashCode() : 0);
        return result;
    }
}
