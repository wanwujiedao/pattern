package com.dao.pattern.proxy.impl;

import com.dao.pattern.proxy.interfaces.DataBase;

/**
 * 真正的数据库
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.proxy.impl.RealDataBase.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 19:51:00
 */
public class RealDataBase implements DataBase{

    /**
     * 数据库名称
     */
    private String name;

    /**
     * 初始化数据库
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param name
     * @return
     */
    public RealDataBase(String name) {
        this.name = name;
        System.out.println("准备连接数据库："+name);
    }
    /**
     * 数据库连接信息
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    @Override
    public void connect() {
        System.out.println("已经连接数据库："+name);
    }
}
