package com.blog.model.entity;

import javax.persistence.*;

/**
 * @author status404
 * @version V1.0
 * @date 2018/2/17
 */
@Entity
@Table(name = "vue_component", schema = "blog", catalog = "")
public class VueComponentEntity {
    private int id;
    private String comId;
    private String comName;
    private String vueDescription;
    private String vueUsage;
    private String vueCode;

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
    @Column(name = "com_name")
    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    @Basic
    @Column(name = "vue_description")
    public String getVueDescription() {
        return vueDescription;
    }

    public void setVueDescription(String vueDescription) {
        this.vueDescription = vueDescription;
    }

    @Basic
    @Column(name = "vue_usage")
    public String getVueUsage() {
        return vueUsage;
    }

    public void setVueUsage(String vueUsage) {
        this.vueUsage = vueUsage;
    }

    @Basic
    @Column(name = "vue_code")
    public String getVueCode() {
        return vueCode;
    }

    public void setVueCode(String vueCode) {
        this.vueCode = vueCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VueComponentEntity that = (VueComponentEntity) o;

        if (id != that.id) return false;
        if (comId != null ? !comId.equals(that.comId) : that.comId != null) return false;
        if (comName != null ? !comName.equals(that.comName) : that.comName != null) return false;
        if (vueDescription != null ? !vueDescription.equals(that.vueDescription) : that.vueDescription != null)
            return false;
        if (vueUsage != null ? !vueUsage.equals(that.vueUsage) : that.vueUsage != null) return false;
        if (vueCode != null ? !vueCode.equals(that.vueCode) : that.vueCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (comId != null ? comId.hashCode() : 0);
        result = 31 * result + (comName != null ? comName.hashCode() : 0);
        result = 31 * result + (vueDescription != null ? vueDescription.hashCode() : 0);
        result = 31 * result + (vueUsage != null ? vueUsage.hashCode() : 0);
        result = 31 * result + (vueCode != null ? vueCode.hashCode() : 0);
        return result;
    }
}
