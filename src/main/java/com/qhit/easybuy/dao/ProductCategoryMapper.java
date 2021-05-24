package com.qhit.easybuy.dao;

import com.qhit.easybuy.entity.ProductCategory;
import com.qhit.easybuy.entity.ProductCategoryVo;
import com.qhit.easybuy.param.ProductCategoryParams;

import java.util.List;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCategory record);

//    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer id);

//    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);

    List<ProductCategory>  findByType1(Integer type);
    /**
     * 根据条件查询商品列表
     * @param
     */
    public List<ProductCategory> queryProductCategorylist(ProductCategory param);

    public List<ProductCategory> yiji();

    public List<ProductCategory> erji(Integer id);

}