package com.dao.pattern.decorator.core;

import com.dao.pattern.decorator.interfaces.Pen;

/**
 * 黑色的笔
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.decorator.core.BlackPenDecorator.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-24 16:50:00
 */
public class BlackPenDecorator extends PenDecorator {

    public BlackPenDecorator(Pen pen) {
        super(pen);
    }
    /**
     * 获取笔的名称以及其他属性
     *
     * @return void
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     */
    @Override
    public void name(){
        pen.name();
        setPenColor();
    }

    /**
     * 笔的颜色
     *
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private void setPenColor() {
        System.out.println("我是黑色的笔。");
    }
}
