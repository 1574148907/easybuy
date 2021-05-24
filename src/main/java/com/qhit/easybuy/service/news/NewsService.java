package com.qhit.easybuy.service.news;

import com.qhit.easybuy.entity.News;
import com.qhit.easybuy.param.NewsParams;

import java.util.List;

/**
 * 编写消息的业务逻辑方法
 */
public interface NewsService  {

    /**
     * 保存新闻
     * @param news
     */
    void addNews(News news);//保存新闻
    /**
     * 根据id查询新闻
     * @param Id
     * @return
     */
    News findNewsById(Integer Id);
    /***
     * 删除新闻
     * @param parameter
     */
    void deleteNews(String parameter);
    /***
     * 查询新闻列表
     * @param param
     * @return
     */
    List<News> queryNewsList(NewsParams param);

    List<News> queryNews();
    /***
     * 查询数目
     * @param param
     * @return
     */
    Integer queryNewsCount(NewsParams param);



}
