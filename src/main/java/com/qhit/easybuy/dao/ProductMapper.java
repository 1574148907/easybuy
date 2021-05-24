package com.qhit.easybuy.dao;

import com.qhit.easybuy.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product product);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product product);

    int updateByPrimaryKey(Product product);

    public List<Product> getProductList( @Param("id") Integer categoryId,@Param("name") String name);


    public List<Product> selectAll();
    public  Integer queryProductCount(String name, Integer id);

}