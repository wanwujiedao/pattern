package com.dao.pattern.interceptingfilter.impl;

import com.dao.pattern.interceptingfilter.interfaces.Filter;
import com.dao.pattern.interceptingfilter.vo.User;

import java.util.Iterator;
import java.util.List;

/**
 * 成人过滤
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.impl.AdultFilter.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:31:00
 */
public class AdultFilter implements Filter{


    /**
     * 执行过滤规则：去掉未成年人
     *
     * @param users
     * @return void
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     */
    @Override
    public void doFilter(List<User> users) {
        Iterator<User> iterator=users.iterator();
        while (iterator.hasNext()){
            User user=iterator.next();
            if(user.getAge()<18){
                iterator.remove();
            }
        }
    }
}
