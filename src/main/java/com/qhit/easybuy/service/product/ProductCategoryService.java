package com.qhit.easybuy.service.product;

import com.qhit.easybuy.entity.ProductCategory;
import com.qhit.easybuy.entity.ProductCategoryVo;
import com.qhit.easybuy.param.ProductCategoryParams;

import java.util.List;

/**
 * Created by bdqn on 2016/5/8.
 */
public interface ProductCategoryService {
    /**
     * 查询一级的商品分类
     *
     * @return
     */
    public List<ProductCategory> yiji();

    /**
     * 查询全部的商品分类  分级查
     *
     * @return
     */
    public List<ProductCategory> erji();

    /**
     *    展示1F的六条商品
     */
    public ProductCategoryVo queryProductlist();

    /**
     * 查询全部的商品分类
     * @return
     */
    public List<ProductCategory> queryAllProductCategoryList(ProductCategory param);


    /**
     * 查询商品分类列表 查询type=1
     *
     * @param type
     * @return
     */
    public List<ProductCategory> queryProductCategoryList(Integer type);



}
