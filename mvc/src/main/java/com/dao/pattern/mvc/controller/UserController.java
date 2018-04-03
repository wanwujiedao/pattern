package com.dao.pattern.mvc.controller;

import com.dao.pattern.mvc.model.User;
import com.dao.pattern.mvc.view.UserView;

/**
 * 用户控制器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mvc.controller.UserController.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 09:56:00
 */
public class UserController {
    /**
     * 用户
     */
    private User user;
    /**
     * 用户视图
     */
    private UserView userView;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param user
     * @param userView
     * @return
     */
    public UserController(User user, UserView userView) {
        this.user = user;
        this.userView = userView;
    }
    /**
     * 查询用户
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.mvc.model.User
     */
    public void findUser(){
        userView.printUser(user);
    }

    /**
     * 更新用户
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param user
     * @return void
     */
    public void updateUser(User user){
         this.user=user;
    }

}
