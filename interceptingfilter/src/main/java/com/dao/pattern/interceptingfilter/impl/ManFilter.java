package com.dao.pattern.interceptingfilter.impl;

import com.dao.pattern.interceptingfilter.interfaces.Filter;
import com.dao.pattern.interceptingfilter.vo.User;

import java.util.Iterator;
import java.util.List;

/**
 * 过滤规则：男
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.impl.ManFilter.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:34:00
 */
public class ManFilter implements Filter {

    private static final String MAN="男";

    /**
     * 执行过滤规则：去掉女
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
            if(!MAN.equalsIgnoreCase(user.getSex())){
                iterator.remove();
            }
        }
    }
}
