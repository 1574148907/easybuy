package com.qhit.easybuy.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Table(name = "easybuy_product_category")
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer id;

    private String name;

    private Integer parentid;

    private Integer type;

    private String iconclass;
    @Transient
    private String parentName;

    private List<ProductCategory> childen;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<ProductCategory> getChilden() {
        return childen;
    }

    public void setChilden(List<ProductCategory> childen) {
        this.childen = childen;
    }
}