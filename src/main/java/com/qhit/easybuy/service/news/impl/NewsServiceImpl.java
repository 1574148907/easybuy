package com.qhit.easybuy.service.news.impl;

import com.qhit.easybuy.dao.NewsMapper;

import com.qhit.easybuy.entity.News;
import com.qhit.easybuy.param.NewsParams;
import com.qhit.easybuy.service.news.NewsService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional  //开启事务
public class NewsServiceImpl implements NewsService {
  @Resource
    private NewsMapper newsMapper;
    /**
     * 保存新闻
     * @param news
     */
    @Override
    public void addNews(News news) {
        int i = newsMapper.insert(news);
        if (i>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }
    /**
     * 根据id查询新闻
     * @param Id
     * @return
     */
    @Override
    public News findNewsById(Integer Id) {
        News news = newsMapper.selectByPrimaryKey(Id);
        if (null!=news){
            System.out.println("查询成功");
        }else {
            System.out.println("查询失败");
        }
        return news;
    }
    /***
     * 删除新闻
     * @param parameter
     */
    @Override
    public void deleteNews(String parameter) {

    }
    /***
     * 查询新闻列表
     * @param param
     * @return
     */
    @Override
    public List<News> queryNewsList(NewsParams param) {
        return null;
    }

    @Override
    public List<News> queryNews() {
        List<News> newsList = newsMapper.selectNews();
        if (newsList != null) {
            System.out.println("查询成功");
        } else {
            System.out.println("查询失败");

        }
        return newsList;
    }

    /***
     * 查询数目
     * @param param
     * @return
     */
    @Override
    public Integer queryNewsCount(NewsParams param) {
        return null;
    }
}
