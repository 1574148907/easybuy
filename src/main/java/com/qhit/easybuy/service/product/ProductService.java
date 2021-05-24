package com.qhit.easybuy.service.product;

import com.qhit.easybuy.entity.Product;
import com.qhit.easybuy.entity.ProductCategory;
import com.qhit.easybuy.entity.ProductCategoryVo;

import java.util.List;

public interface ProductService {

    /**
     * 通过productId id看商品详情
     *
     * @param productId
     * @return
     */
    public Product getProductById(Integer productId);

    public List<Product> getProductList(Integer categoryId, String name);

    public int count(String name, Integer categoryId);

    public List<Product> selectProductList();
}
