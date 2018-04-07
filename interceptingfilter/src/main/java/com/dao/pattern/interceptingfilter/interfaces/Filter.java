package com.dao.pattern.interceptingfilter.interfaces;

import com.dao.pattern.interceptingfilter.vo.User;

import java.util.List;

/**
 * 过滤器接口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.interfaces.Filter.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:25:00
 */
public interface Filter {

    /**
     * 执行过滤规则
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param users
     * @return void
     */
    void doFilter(List<User> users);
}
