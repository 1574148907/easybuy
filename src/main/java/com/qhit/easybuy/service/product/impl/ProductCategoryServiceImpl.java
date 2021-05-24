package com.qhit.easybuy.service.product.impl;

import com.qhit.easybuy.dao.ProductCategoryMapper;
import com.qhit.easybuy.dao.ProductMapper;
import com.qhit.easybuy.entity.Product;
import com.qhit.easybuy.entity.ProductCategory;
import com.qhit.easybuy.entity.ProductCategoryVo;
import com.qhit.easybuy.param.ProductCategoryParams;
import com.qhit.easybuy.service.product.ProductCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdqn on 2016/5/8.
 */
@Service
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Resource
    private ProductCategoryMapper productCategoryMapper;
    @Resource
    private ProductMapper productMapper;
    /**
     * 查询一级菜单
     *
     * @return
     */
    @Override
    public List<ProductCategory> yiji() {
        List<ProductCategory> yijilist = productCategoryMapper.yiji();
        if (yijilist != null) {
            System.out.println("查询成功");
            return yijilist;
        } else {
            System.out.println("没查到");
            return null;
        }

    }

    /**
     * 查询二级菜单
     *
     * @return
     */
    @Override
    public List<ProductCategory> erji() {
        List<ProductCategory> yiji = yiji();

        for (ProductCategory p1 : yiji) {
            System.out.println(p1);
            List<ProductCategory> erji = productCategoryMapper.erji(p1.getId());
            p1.setChilden(erji);
            for (ProductCategory p : erji) {
                List<ProductCategory> sanji = productCategoryMapper.erji(p.getId());
                p.setChilden(sanji);
            }
        }
        return yiji;
    }

    @Override
    public ProductCategoryVo queryProductlist() {
        ProductCategoryVo productCategoryVo = new ProductCategoryVo();
        List<ProductCategory> ProductCategory = erji();
        List<Product> products = productMapper.selectAll();
        productCategoryVo.setProductList(products);
        productCategoryVo.setProductCategory(ProductCategory);
        return productCategoryVo;
    }

    @Override
    public List<ProductCategory> queryProductCategoryList(Integer type) {
        List<ProductCategory> byType1 = productCategoryMapper.findByType1(type);
        return byType1;
    }


    /**
     * 查询全部的商品分类
     *
     * @return
     */
    @Override
    public List<ProductCategory> queryAllProductCategoryList(ProductCategory param) {
        List<ProductCategory> productCategories = productCategoryMapper.queryProductCategorylist(param);
        if (productCategories != null) {
            System.out.println("查询成功");
            return productCategories;
        } else {
            System.out.println("查询失败");
            return null;
        }

    }
}