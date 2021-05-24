package com.qhit.easybuy.controller.preController;

import com.qhit.easybuy.service.news.NewsService;
import com.qhit.easybuy.service.product.ProductCategoryService;
import com.qhit.easybuy.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
@Autowired
    private ProductService productService;
@Autowired
    private NewsService newsService;
@Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 商城主页的方法
     * @param
     * @param
     * @return
     */
//    @RequestMapping("/index")
//    public RespBean index(){
////        Map<String, Object> map = new HashMap<>();
//        List<ProductCategoryVo> productCategoryVoList = productCategoryService.queryAllProductCategoryList();
//        Pager pager= new Pager(5, 5, 1);
//        NewsParams params = new NewsParams();
//        params.openPage((pager.getCurrentPage() - 1) * pager.getRowPerPage(),pager.getRowPerPage());
////        List<News> news = newsService.queryNews();
//        //查询一楼
//        for (ProductCategoryVo vo : productCategoryVoList) {
//            List<Product> productList = productService.getProductList(1, 8, null, vo.getProductCategory().getId(), 1);
//            vo.setProductList(productList);
//        }
////            map.put("productCategoryVoList", productCategoryVoList);
////            map.put("news", news);
//        return    RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(),ServiceEnumType.GET_SUCCESS.getMsg(),productCategoryVoList);
//
//    }


}
