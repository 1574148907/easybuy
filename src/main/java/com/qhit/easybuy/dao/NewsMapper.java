package com.qhit.easybuy.dao;

import com.qhit.easybuy.entity.News;
import com.qhit.easybuy.param.NewsParams;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<News> selectNews();

    public List<News> queryNewsList(NewsParams params)throws Exception;
}