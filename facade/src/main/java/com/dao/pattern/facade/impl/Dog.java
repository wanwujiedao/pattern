package com.dao.pattern.facade.impl;

import com.dao.pattern.facade.interfaces.Animals;

/**
 * 狗
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.facade.impl.Dog.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 10:45:00
 */
public class Dog implements Animals{

    /**
     * 获取狗的名称
     *
     * @return java.lang.String
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     */
    public String name() {
        return "狗";
    }
}
