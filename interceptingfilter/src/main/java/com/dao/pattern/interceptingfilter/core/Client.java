package com.dao.pattern.interceptingfilter.core;

import com.dao.pattern.interceptingfilter.vo.User;

import java.util.List;

/**
 * 客户端
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.core.Client.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:54:00
 */
public class Client {
    /**
     * 声明过滤器管理器
     */
    private FilterManager filterManager;
    /**
     * 执行过滤规则
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param users
     * @return void
     */
    public void doInterceptor(List<User> users){
        filterManager=new FilterManager(users);
        filterManager.executeFilter();
    }
}
