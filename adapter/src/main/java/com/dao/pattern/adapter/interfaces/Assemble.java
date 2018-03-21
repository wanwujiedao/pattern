package com.dao.pattern.adapter.interfaces;

/**
 * 盛放，装载
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.adapter.interfaces.Assemble.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 15:22:00
 */
public interface Assemble {
    /**
     * 装液体
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param name
     * @return void
     */
    void assembleLiquid(String name);
    /**
     * 装固体
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param name
     * @return void
     */
    void assembleSolid(String name);
}
