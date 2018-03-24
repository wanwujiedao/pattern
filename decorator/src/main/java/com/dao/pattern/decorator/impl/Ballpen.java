package com.dao.pattern.decorator.impl;

import com.dao.pattern.decorator.interfaces.Pen;

/**
 * 圆珠笔
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.decorator.impl.Ballpen.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-24 16:47:00
 */
public class Ballpen implements Pen {

    /**
     * 获取圆珠笔的名称
     *
     * @return void
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     */
    public void name() {
        System.out.println("我是圆珠笔。");
    }
}
