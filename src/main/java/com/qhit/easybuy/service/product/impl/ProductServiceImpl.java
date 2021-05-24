package com.qhit.easybuy.service.product.impl;

import com.qhit.easybuy.dao.ProductCategoryMapper;
import com.qhit.easybuy.dao.ProductMapper;
import com.qhit.easybuy.entity.Product;
import com.qhit.easybuy.entity.ProductCategory;
import com.qhit.easybuy.entity.ProductCategoryVo;
import com.qhit.easybuy.service.product.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品的业务类
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;
    @Resource
    private ProductCategoryMapper productCategoryMapper;


    /**
     * 通过productId id看商品详情
     *
     * @param productId
     * @return
     */
    @Override
    public Product getProductById(Integer productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        return product;

    }

    @Override
    public List<Product> getProductList(Integer categoryId, String name) {
        List<Product> productList = productMapper.getProductList( categoryId,name);
        if(productList!=null){
            System.out.println("查询成功");
            return productList;
        }else {
            System.out.println("查询失败");
            return null;
        }

    }


    @Override
    public int count(String name, Integer id) {
        Integer integer = productMapper.queryProductCount(name, id);
        return integer;
    }


    @Override
    public List<Product> selectProductList() {
        List<Product> products = productMapper.selectAll();
        if (products != null) {
            System.out.println("查询成功");
            return products;
        } else {
            System.out.println("查询失败");
            return null;
        }
    }

}
