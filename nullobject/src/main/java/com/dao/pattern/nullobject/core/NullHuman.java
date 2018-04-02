package com.dao.pattern.nullobject.core;

/**
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.nullobject.core.NullJuman.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 15:53:00
 */
public class NullHuman extends AbstractHuman {

    /**
     * 判断是不是空
     *
     * @return boolean
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public boolean isNil() {
        return true;
    }

    /**
     * 说一些什么
     *
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public void say() {
        System.out.println("禁止未成年人上网！");
    }
}
