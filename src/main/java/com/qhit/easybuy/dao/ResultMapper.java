package com.qhit.easybuy.dao;

import com.qhit.easybuy.entity.Result;

public interface ResultMapper {
    int insert(Result record);

    int insertSelective(Result record);
}