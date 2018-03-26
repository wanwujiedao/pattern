package com.dao.pattern.flyweight.impl;

import com.dao.pattern.flyweight.interfaces.Animals;

/**
 * 人类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.flyweight.impl.Human.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 13:55:00
 */
public class Human implements Animals{

    /**
     * 性别
     */
    private String sex;
    /**
     * 姓名
     */
    private String name;
    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param sex
     * @return
     */
    public Human(String sex) {
        this.sex = sex;
        System.out.println("我是上帝，正在创建性别为"+sex+"的人类...");
    }

    /**
     * 姓名填充
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 自述
     *
     * @return void
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     */
    @Override
    public void say() {
        System.out.println("我叫"+name+",性别"+sex+"。");
    }
}
