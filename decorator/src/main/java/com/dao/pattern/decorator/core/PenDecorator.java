package com.dao.pattern.decorator.core;

import com.dao.pattern.decorator.interfaces.Pen;

/**
 * 笔的装饰器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.decorator.core.PenDecorator.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-24 16:48:00
 */
public class PenDecorator implements Pen {

    /**
     * 笔
     */
    protected Pen pen;
    /**
     * 笔的装饰器构造方法
     *
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     * @param pen
     * @return
     */
    public PenDecorator(Pen pen) {
        this.pen = pen;
    }

    /**
     * 获取笔的名称
     *
     * @return void
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     */
    @Override
    public void name() {
        pen.name();
    }
}
