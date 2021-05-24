package com.qhit.easybuy.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bdqn on 2016/4/25.
 */
public class ProductCategoryVo implements Serializable {

    private List<ProductCategory> productCategory;
    private List<Product> productList;

    public List<ProductCategory> getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(List<ProductCategory> productCategory) {
        this.productCategory = productCategory;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
