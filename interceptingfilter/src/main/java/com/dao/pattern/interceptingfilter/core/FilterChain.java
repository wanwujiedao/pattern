package com.dao.pattern.interceptingfilter.core;

import com.dao.pattern.interceptingfilter.interfaces.Filter;
import com.dao.pattern.interceptingfilter.vo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器执行链
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.core.FilterChain.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:37:00
 */
public class FilterChain {
    /**
     * 声明过滤器集合
     */
    private List<Filter> filters;
    /**
     * 声明被处理的对象集合
     */
    private List<User> users;

    /**
     * 构造块给属性分配空间
     */
    {
        this.filters=new ArrayList<>();
        this.users=new ArrayList<>();
    }

    /**
     * 添加过滤规则
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param filter
     * @return void
     */
    public void addFilter(Filter filter){
        this.filters.add(filter);
    }


    public void doFilter(){
        if(this.filters!=null&&!this.filters.isEmpty()&&this.users!=null&&!this.users.isEmpty()) {
            this.filters.forEach(filter -> filter.doFilter(this.users));
        }
    }

    public void setUsers(List<User> users){
        this.users=users;
    }
}
