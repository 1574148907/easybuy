package com.qhit.easybuy.controller.preController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhit.easybuy.entity.Product;
import com.qhit.easybuy.entity.ProductCategory;
import com.qhit.easybuy.entity.ProductCategoryVo;
import com.qhit.easybuy.exception.ServiceEnumType;
import com.qhit.easybuy.service.product.ProductCategoryService;
import com.qhit.easybuy.service.product.ProductService;
import com.qhit.easybuy.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/yiji")
    public RespBean yijiList() {
        List<ProductCategory> yiji = productCategoryService.yiji();
        return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), yiji);
    }

    @RequestMapping("/CategoryList")
    public RespBean CategoryList() {
        List<ProductCategory> erji = productCategoryService.erji();
        return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), erji);
    }

    @RequestMapping("/queryProductlist")
    public RespBean CategoryList1() {
//        System.out.println(p.getId());
        ProductCategoryVo productCategoryVo = productCategoryService.queryProductlist();
        return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), productCategoryVo);
    }

    @RequestMapping("/queryProductByKey")
    public RespBean QueryProductByKey(@RequestParam Integer id) {
        Product product = productService.getProductById(id);
        return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), product);

    }

    @RequestMapping("/queryProductByKey2")
    public RespBean QueryProductByKey2(
            @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "name", required = false) String name) {//页数
        PageHelper.startPage(pageNum, 3);
        List<Product> productList = productService.getProductList(id, name);
        PageInfo<Product> page = new PageInfo<>(productList);
        return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), page);

    }
}

