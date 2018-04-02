package com.dao.pattern.nullobject.core;

/**
 * 抽象类：人
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.nullobject.core.AbstractHuman.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 15:42:00
 */
public abstract class AbstractHuman {
    /**
     * 姓名
     */
    protected String name;
    /**
     * 年龄
     */
    protected int age;

    /**
     * 判断是不是空
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return boolean
     */
    public abstract boolean isNil();
    /**
     * 说一些什么
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public abstract void say();
}
