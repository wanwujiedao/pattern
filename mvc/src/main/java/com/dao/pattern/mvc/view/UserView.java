package com.dao.pattern.mvc.view;

import com.alibaba.fastjson.JSON;
import com.dao.pattern.mvc.model.User;

/**
 * 用户视图
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mvc.view.UserView.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 09:55:00
 */
public class UserView {
    /**
     * 打印用户信息
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param user
     * @return void
     */
    public void printUser(User user){
        System.out.println(JSON.toJSONString(user));
    }
}
