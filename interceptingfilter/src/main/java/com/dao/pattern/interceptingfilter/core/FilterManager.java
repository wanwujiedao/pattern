package com.dao.pattern.interceptingfilter.core;

import com.dao.pattern.interceptingfilter.impl.AdultFilter;
import com.dao.pattern.interceptingfilter.impl.ManFilter;
import com.dao.pattern.interceptingfilter.vo.User;

import java.util.List;

/**
 * 过滤器管理器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.core.FilterManager.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:47:00
 */
public class FilterManager {
    /**
     * 声明过滤器执行链
     */
    private FilterChain filterChain;

    /**
     * 将过滤器添加到链路中，当然这里可以用一个方法替代更加灵活，此处就默认写死
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param users
     * @return
     */
    public FilterManager(List<User> users) {
        //分配空间
        this.filterChain = new FilterChain();
        //添加成人规则
        this.filterChain.addFilter(new AdultFilter());
        //添加男人规则
        this.filterChain.addFilter(new ManFilter());
        //被处理的对象
        this.filterChain.setUsers(users);
    }

    /**
     * 执行过滤规则
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public void executeFilter(){
        this.filterChain.doFilter();
    }

}
