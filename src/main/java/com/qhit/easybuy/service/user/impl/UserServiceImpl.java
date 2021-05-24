package com.qhit.easybuy.service.user.impl;

import com.qhit.easybuy.dao.NewsMapper;
import com.qhit.easybuy.dao.UserMapper;
import com.qhit.easybuy.entity.User;
import com.qhit.easybuy.service.user.UserService;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean deleteUserById(Integer userId) {
        return false;
    }

    @Override
    public User getUser(Integer userId, String loginName) {


        return null;
    }

    @Override
    public User selectByName(String loginName) {
        User user = userMapper.selectByName(loginName);
        if (user!=null){
            System.out.println("查询成功");
        }else {
            System.out.println("查询失败");
        }
        return user;
    }

    @Override
    public List<User> getUserList(Integer currentPageNo, Integer pageSize) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }




}
