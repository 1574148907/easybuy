package com.qhit.easybuy.service.user;

import com.qhit.easybuy.entity.User;

import java.util.List;

public interface UserService {

    public boolean add(User user);

    public boolean update(User user);

    public boolean deleteUserById(Integer userId);

    public User getUser(Integer userId, String loginName);

    //	登录
    public User selectByName(String loginName);

    public List<User> getUserList(Integer currentPageNo, Integer pageSize);

    public int count();
}
