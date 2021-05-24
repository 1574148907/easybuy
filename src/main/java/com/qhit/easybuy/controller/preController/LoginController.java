package com.qhit.easybuy.controller.preController;

import com.qhit.easybuy.entity.User;

import com.qhit.easybuy.exception.ServiceEnumType;
import com.qhit.easybuy.service.user.UserService;
import com.qhit.easybuy.utils.EmptyUtils;

import com.qhit.easybuy.utils.RespBean;
import com.qhit.easybuy.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

@RestController
@RequestMapping("/loging")
public class LoginController {
    //注入用户业务类
    @Autowired
    private UserService userService;

    @PostMapping("/login")  //http://localhost:8080/loging/login?loginName=admin&password=123456
    public RespBean LoginByName(@RequestParam(value = "loginName") String loginName , @RequestParam(value = "password") String password) {
    User user = userService.selectByName(loginName);
    if (EmptyUtils.isEmpty(user)) {
        System.out.println("没有该用户");

        return RespBean.fail(ServiceEnumType.GET_FAIL.getCode(), ServiceEnumType.GET_FAIL.getMsg());
    } else {
        if (user.getPassword().equals(SecurityUtils.md5Hex(password))) {
//            System.out.println("登录成功");
            //登陆成功
            return RespBean.success(ServiceEnumType.GET_SUCCESS.getCode(), ServiceEnumType.GET_SUCCESS.getMsg(), user);
        } else {
//            System.out.println("登录失败");
            return RespBean.fail(ServiceEnumType.GET_FAIL.getCode(), ServiceEnumType.GET_FAIL.getMsg());
        }
    }
}
}
