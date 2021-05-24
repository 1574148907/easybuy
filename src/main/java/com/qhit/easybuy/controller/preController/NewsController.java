package com.qhit.easybuy.controller.preController;

import com.qhit.easybuy.entity.News;
import com.qhit.easybuy.exception.ServiceEnumType;
import com.qhit.easybuy.service.news.NewsService;
import com.qhit.easybuy.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/findNewsByid")
    public News selectByNew(@RequestParam(value = "id") Integer id){
        News news = newsService.findNewsById(id);
        return news;
    }

    @RequestMapping(value = "/findNews")
    public RespBean selectByNews(){
        List<News> newsList = newsService.queryNews();
        if (newsList != null) {
            return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), newsList);
        } else {
            return RespBean.fail(ServiceEnumType.GET_FAIL.getCode(), ServiceEnumType.GET_FAIL.getMsg());
        }

    }

}
