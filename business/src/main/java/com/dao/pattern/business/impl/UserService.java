package com.dao.pattern.business.impl;

import com.dao.pattern.business.interfaces.BusinessService;

/**
 * 用户服务
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.business.impl.UserService.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 10:54:00
 */
public class UserService implements BusinessService {

    /**
     * 处理一些事情
     *
     * @return void
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     */
    @Override
    public void dosomething() {
        System.out.println("处理用户服务");
    }
}
